#!/usr/bin/env bash

set -u

ORGANIZACION="CCLaboratorio"
EQUIPO="icc2027-1"
DESTINO="$HOME/Documents/almacenesICC"

# Validar argumento
if [ "$#" -ne 1 ]; then
    echo "Uso: $0 {clone|pull}"
    exit 1
fi

OPERACION="$1"

case "$OPERACION" in
    clone|pull) ;;
    *)
        echo "Operación no válida: $OPERACION"
        echo "Uso: $0 {clone|pull}"
        exit 1
        ;;
esac

# Crear directorio de destino
mkdir -p "$DESTINO" || exit 1

# Obtener almacenes del equipo
ARCHIVO_TEMP=$(mktemp) || exit 1

if ! gh api --paginate \
    "/orgs/$ORGANIZACION/teams/$EQUIPO/repos" \
    --jq '.[].full_name' > "$ARCHIVO_TEMP"; then
    echo "Error al consultar los almacenes de GitHub."
    rm -f "$ARCHIVO_TEMP"
    exit 1
fi

if [ ! -s "$ARCHIVO_TEMP" ]; then
    echo "No se encontraron almacenes para el equipo $EQUIPO."
    rm -f "$ARCHIVO_TEMP"
    exit 0
fi

# Procesar cada almacén
while IFS= read -r almacen; do
    [ -z "$almacen" ] && continue

    nombre="${almacen##*/}"
    carpeta="$DESTINO/$nombre"

    echo
    echo "[$OPERACION] $almacen"

    if [ "$OPERACION" = "clone" ]; then
        if [ -d "$carpeta/.git" ]; then
            echo "Ya existe; se omite."
        elif [ -e "$carpeta" ]; then
            echo "Error: existe una carpeta que no es un almacén Git."
        else
            gh repo clone "$almacen" "$carpeta" ||
                echo "Error al clonar $almacen"
        fi
    else
        if [ -d "$carpeta/.git" ]; then
            git -C "$carpeta" pull --ff-only ||
                echo "Error al actualizar $almacen"
        else
            echo "No está clonado; se omite."
        fi
    fi

done < "$ARCHIVO_TEMP"

rm -f "$ARCHIVO_TEMP"

echo
echo "Operación $OPERACION finalizada."
