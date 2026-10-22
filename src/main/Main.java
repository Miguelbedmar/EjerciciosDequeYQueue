package main;

import controlador.*;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    private final static String MENSAJE_ERROR = "ERROR! VALOR NO VÁLIDO"; // constante para evitar duplicar los sysos de
                                                                          // error

    private static Ejercicio1 ej1;
    private Ejercicio1 ej1;
    private Ejercicio2 ej2;
    private Ejercicio3 ej3;
    private Ejercicio4 ej4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

    public void menuEjercicios(Scanner sc) {
        boolean salir = false;
        int opcion = 0;
        do {
            try {
                System.out.println("<====GESTOR PILAS Y COLAS=====>");
                System.out.println("<=====1).Ejercicio1===========>");
                System.out.println("<=====2).Ejercicio2===========>");
                System.out.println("<=====3).Ejercicio3===========>");
                System.out.println("<=====4).Ejercicio4===========>");
                System.out.println("<=====5).Salir================>");
                if (!sc.hasNextInt()) { // comprobamos si el siguiente no es entero
                    sc.next();
                    System.out.println(MENSAJE_ERROR);
                    continue;
                }

                switch (opcion = sc.nextInt()) {
                    case 1:
                        ej1.imprimirResultado(sc);
                        break;
                        ej2.controlCola(sc);
                    case 2:
                        break;
                    case 3:
                        ej3.imprimirResultado(sc);
                        break;
                    case 4:
                        ej4.imprimirResultado(sc);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        salir = false;
                        break;    
                    default:
                        System.err.println("Opción no disponible..");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println(MENSAJE_ERROR);
            } catch (NoSuchElementException e) {
                System.err.println("Error! has intentado accder al final del archivo");
            }
        } while (!salir);

    }

}
