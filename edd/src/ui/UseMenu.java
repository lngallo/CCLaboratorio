package ui;

import java.util.Scanner;

/**
 * Ejemplo de menú y limpieza de pantall.
 * @author Leonardo Gallo
 */
public class UseMenu {

    /**
     * Método para limpiar pantalla.
     */
    public static void cleanScreen() {
	System.out.print("\033[H\033[2J");
	System.out.flush();
    }

    /**
     * Despliegue del menú de inicio.
     */
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
     * Muestra un retraso en en millisegundos.
     */
    public static void applyDelay(int millis) {
	try {
	    Thread.sleep(millis);
	} catch(InterruptedException e) {
	}
    }

    /**
     * Método principal, necesario para la JVM.
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
		    System.out.println("\nLa opción no es válida. Intenta de nuevo...");
		    applyDelay(2000);
		    flag = true;
		    break;
		}
	    } while (flag);
	case 2:
	    break;
	case 0: // salir
	    break;
	default:
	    System.out.println("\nLa opción no es válida. Intenta de nuevo...");
	    applyDelay(2000);
	}
	
	if (opcion == 0) {
	    System.out.println("\n.... ¡Vuelve pronto! ....");
	    // que se viusalice la pantalla 3 segundo.
	    applyDelay(2000);
	    flag = false;
	} else {
	    flag = true;
	}
	
	}while (flag);
	cleanScreen();
    }
}
