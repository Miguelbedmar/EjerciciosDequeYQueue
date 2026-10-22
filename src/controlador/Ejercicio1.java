package controlador;

import java.util.NoSuchElementException;
import java.util.Scanner;
import modelo.Pila;

public class Ejercicio1 {

    public static String invertirTexto(String texto) {
        Pila<Character> dtCha = new Pila<>();

        for (int i = 0; i < texto.length(); i++) {
            dtCha.apilar(texto.charAt(i));
        }
        StringBuilder invertir = new StringBuilder();
        while (!dtCha.estaVacio()) {
            invertir.append("[").append(dtCha.desapilar()).append("]");
        }

        return invertir.toString();

    }

    public static void imprimirResultado(Scanner sc) {
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Introduzca un texto o frase");

                String texto = sc.nextLine();
                if (texto.isEmpty()) {
                    System.out.println("No puedes ingresar un texto vacío");
                    continue;
                }
                if (texto.length() < 2) {
                    System.out.println("Longitud no válida");
                    continue;
                }
                valido = true;
                String textoInvertido = invertirTexto(texto); // Llamamos al metodo invertirTexto

                System.out.println("Texto sin invertir:" + texto);
                System.out.println("Texto invertido: " + textoInvertido);

            } catch (NoSuchElementException e) { // Con la excepción NoSuchElement impedimos que el usuario ingrese más allá del programa.
                System.out.println("ERROR!: Has accedido al final del archivo finalizando ejercicio 1...");
                break;
            }
        }
    }
}
