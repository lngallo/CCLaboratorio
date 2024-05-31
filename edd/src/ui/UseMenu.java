package ui;

import java.util.Scanner;

/**
 * Ejemplo de menú y limpieza de pantall.
 * @author Leonardo Gallo
 */
public class UseMenu {

    /**
     * Método para limpiar pantalla
     */
    public static void cleanScreen() {
	System.out.print("\033[H\033[2J");
	System.out.flush();
    }

    public static void muestraMenu() {
	System.out.println(
			   "Ingresa el número de una de las siguientes opciones:"
			   + "\n1. Agregar"
			   + "\n2. Actualizar"
			   + "\n3. Eliminar"
			   + "\n4. Buscar");
    }

    /**
     * Método principal
     */
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean flag = false;
	int opcion;
	do {
	cleanScreen();
	muestraMenu();

	System.out.print("Opción: ");
	opcion = sc.nextInt();
	if (opcion != 5) {
	    flag = true;
	} else {
	    flag = false;
	}
	
	}while (flag);
	cleanScreen();
    }
}
