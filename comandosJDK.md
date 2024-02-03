#### Fecha de actualización: 10.02.2023

Nota: Para que no marquen error las instrucciones ejemplo tienen que estar dentro de la carpeta de su almacén. Las rutas usadas por los siguientes comandos suponen que la ruta relativa (la posición actual) es dentro de ../LeonardoGallo/ejercicios/.

Para compilar la clase _PrimosGemelos.java_, recuerda tener el árbol de directorios sugerido, ejecuta el siguiente comando:

```
javac -d build/ src/numeros/PrimosGemelos.java
```

La carpeta _build/_ debe ser creada previamente. Recuerda poner en los archivos _.java_ el nombre del paquete, en el ejemplo el paquete es 'numeros'.

Desde la misma ubicación de compilación ejecuta la clase o clases compiladas:

```
java -cp build/ numeros.PrimosGemelos
```

-cp es el classpath (ruta donde java buscará las clases)

En caso de necesitar alguna otra clase previamente compilada, debes incluir dónde se encuentra el _.class_, por lo que quedaría de la siguiente manera:

```
javac -d build/ -cp build/ src/numeros/PrimosGemelos.java
```

Para generar la documentación ejecuta:

```
javadoc -d javadoc/ -version -author src/numeros/PrimosGemelos
```

-d javadoc/ indica el lugar donde será guardada la documentación.

-version: Al ser generada la documentación se incluye el número de versión, de ser definido en la Clase.

-author : En caso de ser definido el parámetro autor, este aparecerá en la documentación.
