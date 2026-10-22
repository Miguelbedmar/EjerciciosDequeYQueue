package controlador;

import java.util.NoSuchElementException;
import java.util.Scanner;
import modelo.Cola;

public class Ejercicio2 {

    private final static String MENSAJE_ERROR = "ERROR! VALOR NO VÁLIDO"; // constante para evitar duplicar los sysos de error
    private int opcion = 0;
    private Scanner sc;
    private boolean salir = false; // Controla el bucle do while

    public void controlCola(Scanner sc) { // Metodo para gestionar la cola 
        Cola<String> c = new Cola<>();

        try {
            do {
                try {
                    //MENU GESTOR COLA
                    System.out.println("<====Gestor Cola==============>");
                    System.out.println("<====1).Llegada Cliente=======>");
                    System.out.println("<====2).Atender Cliente=======>");
                    System.out.println("<====3).Mostar estado cola====>");
                    System.out.println("<====4). Salir Programa ======>");
                    if (!sc.hasNextInt()) { // comprobamos si el siguiente  no es entero
                        sc.next();
                        System.out.println(MENSAJE_ERROR);
                        continue;
                    }

                    switch (opcion = sc.nextInt()) {

                        case 1:
                            System.out.println("Ingrese el nombre del cliente");
                            String nombre = sc.nextLine();
                            if (nombre.isEmpty()) {
                                System.out.println("El nombre no puede estar vacio");
                                continue;
                            }
                            c.encolar(nombre);
                            System.out.println("El cliente está en cola existosamente");
                            break;
                        case 2:
                            if (c.estaVacio()) {
                                System.out.println("La cola está vacia");
                                continue;
                            }
                            System.out.println(c.desencolar());
                            break;
                        case 3:
                            System.out.println("Hay " + c.getTamanio() + " clientes en cola");
                            break;
                        case 4:
                            System.out.println("Saliendo del programa");
                            salir = true;
                            break;
                        default:
                            System.out.println("Opción no disponible");
                            break;
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
