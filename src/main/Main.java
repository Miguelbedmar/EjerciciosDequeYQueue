package main;

import controlador.*;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    private final static String MENSAJE_ERROR = "ERROR! VALOR NO VÁLIDO"; // constante para evitar duplicar los sysos de
                                                                          // error

    private static Ejercicio1 ej1;
    private static Ejercicio2 ej2;
    private static Ejercicio3 ej3;
    private static Ejercicio4 ej4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ej1 = new Ejercicio1();
        ej2 = new Ejercicio2();
        ej3 = new Ejercicio3();
        ej4 = new Ejercicio4();
        menuEjercicios(sc);
        sc.close();
    }

    public static void menuEjercicios(Scanner sc) {
        boolean salir = true;

        do {
            try {
                System.out.println("<====GESTOR PILAS Y COLAS=====>");
                System.out.println("<=====1) Ejercicio1===========>");
                System.out.println("<=====2).Ejercicio2===========>");
                System.out.println("<=====3) Ejercicio3===========>");
                System.out.println("<=====4) Ejercicio4===========>");
                System.out.println("<=====5) Salir================>");
                if (!sc.hasNextInt()) {
                    sc.next();
                    System.out.println(MENSAJE_ERROR);
                    continue;
                }
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        ej1.imprimirResultado(sc);
                        break;
                    case 2:
                        ej2.controlCola(sc);
                        break;
                    case 3:
                        ej3.imprimirResultado(sc);
                        break;
                    case 4:
                        ej4.imprimirResultado(sc);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        salir = true;
                        break;
                    default:
                        System.err.println("Opción no disponible..");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println(MENSAJE_ERROR);
            } catch (NoSuchElementException e) {
                System.err.println("Error! has intentado acceder al final del archivo");
                System.exit(1);
            }
        } while (!salir);

    }

}
