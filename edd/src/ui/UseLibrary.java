package ui;

import apps.Library;
import java.util.Scanner;

/**
 *
 *
 */
public class UseLibrary {


    /**
     *
     */
    private static void getMenu() {
	System.out.println("Bienvenida...."
			   + "Seleccione la opción..."
			   + "\n[1] Llena acervo...");

    }

    public static void main(String[] args) {

	Library<String> alejandria = new Library<>();

	Scanner sc = new Scanner(System.in);

	do {
	    getMenu();

	    // manejo de caso u opcion seleccionada 
	} while(false);

	System.out.println("Vuelve pronto...");
    }
}
