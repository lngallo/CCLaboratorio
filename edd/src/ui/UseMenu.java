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
			   + "\n4. Buscar"
			   + "\n0. Salir");
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

	switch (opcion) {
	case 1:
	    do {
		cleanScreen();
		System.out.println("Selecciones una de las siguientes opciones:"
				   + "\n1. Ejecutar"
				   + "\n2. Regresar al menú principal."
				   + "\n0. Salir");
		opcion = sc.nextInt();
		switch (opcion) {
		case 1:
		    flag = false;
		    break;
		case 2:
		    flag = false;
		    break;
		case 0:
		    flag = false;
		    break;
		default:
		    System.out.println("Opción no valida, intenta de nuevo.");
		    flag = true;
		    break;
		}
	    } while (flag);
	case 2:
	    break;
	default:
	    System.out.println("La opción no es válida.");	    
	}
	
	if (opcion == 0) {
	    System.out.println("Vuelve pronto....");
	    // que se viusalice la pantalla 3 segundo.
	    flag = false;
	} else {
	    flag = true;
	}
	
	}while (flag);
	cleanScreen();
    }
}
