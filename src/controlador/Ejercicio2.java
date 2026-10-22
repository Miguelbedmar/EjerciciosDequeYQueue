package controlador;

import java.util.NoSuchElementException;
import java.util.Scanner;
import modelo.Cola;

public class Ejercicio2 {
    private final static String MENSAJE_ERROR="ERROR! VALOR NO VÁLIDO"; // constante para evitar duplicar los sysos de error
    private int opcion = 0;
    private Scanner sc; 
    private boolean salir = false; // Controla el bucle do while

    public void controlCola(Scanner sc) { // Metodo para gestionar la cola 
        Cola<String> c = new Cola<>();

        try {
            do {
                try {

                    System.out.println("<====Gestor Cola==============>");
                    System.out.println("<====1).Llegada Cliente=======>");
                    System.out.println("<====2).Atender Cliente=======>");
                    System.out.println("<====3).Mostar estado cola====>");
                    if (!sc.hasNextInt()) {

                    }

                } catch (Exception e) { // Control de errores generales
                    System.out.println(MENSAJE_ERROR);
                }

            } while (!salir);

        } catch (NoSuchElementException e) { // Controlar errores de fin de archivo 
            System.err.println("ERROR! has entrado al fin del archivo");

        }

    }

}
