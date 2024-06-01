package ui;

import java.util.Scanner;

/**
 * Ejemplo de menú y limpieza de pantall.
 * @author Leonardo Gallo
 */
public class UseMenu {

    /** Colores */
    public static final String RESET = "\u001B[0m"; // Restablecer formato predeterminado
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BB = "\033[1m"; // Inicio de negritas
    public static final String EB = "\033[0m"; //Fin de negritas

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
	System.out.print(BLUE + BB
			   + "Ingresa el número de una de las siguientes opciones:"
			   + CYAN
			   + "\n\t1. Agregar"
			   + "\n\t2. Actualizar"
			   + "\n\t3. Eliminar"
			   + "\n\t4. Buscar"
			   + "\n\t0. Salir"
			   + BLUE
			   + "\nOpción: ");
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
	opcion = sc.nextInt();

	switch (opcion) {
	case 1:
	    do {
		cleanScreen();
		System.out.print("Selecciones una de las siguientes opciones:"
				   + CYAN
				   + "\n\t1. Ejecutar"
				   + "\n\t2. Regresar al menú principal."
				   + "\n\t0. Salir"
				   + BLUE
				   + "\nOpción: ");
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
