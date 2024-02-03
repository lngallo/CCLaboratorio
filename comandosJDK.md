#### Fecha de actualización: 02.02.2024

Nota: Para que no marquen error las instrucciones ejemplo tienen que estar dentro de la carpeta de su almacén. Las rutas usadas por los siguientes comandos suponen que la ruta relativa (la posición actual) es dentro de ../LeonardoGallo/.

Para compilar la clase _Numeros.java_, recuerda tener el árbol de directorios sugerido, ejecuta el siguiente comando:

```
javac -d build/ src/algebra/Numeros.java
```

La carpeta _build/_ debe ser creada previamente. Recuerda poner en los archivos _.java_ el nombre del paquete, en el ejemplo el paquete es 'algebra'.

Desde la misma ubicación de compilación ejecuta la clase o clases compiladas:

```
java -cp build/ algebra.Numeros
```

-cp es el classpath (ruta donde java buscará las clases)

En caso de necesitar alguna otra clase previamente compilada, debes incluir dónde se encuentra el _.class_, por lo que quedaría de la siguiente manera:

```
javac -d build/ -cp build/ src/algebra/Numeros.java
```

Para generar la documentación ejecuta:

```
javadoc -d javadoc/ -version -author src/algebra/Numeros
```

-d javadoc/ indica el lugar donde será guardada la documentación.

-version: Al ser generada la documentación se incluye el número de versión, de ser definido en la Clase.

-author : En caso de ser definido el parámetro autor, este aparecerá en la documentación.
