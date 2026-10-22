package controlador;
//Importaciones

import java.util.NoSuchElementException;
import java.util.Scanner;
import modelo.Cola;
import modelo.Pila;

public class Ejercicio3 {

    public boolean esPalindromo(String texto) {

        String validado = texto.toLowerCase().replace(" ", "");

        Pila<Character> pCh = new Pila<>();
        Cola<Character> cCh = new Cola<>();

        for (int i = 0; i < validado.length(); i++) { // Apilamos y encolamos
            pCh.apilar(validado.charAt(i));
            cCh.encolar(validado.charAt(i));
        }

        while (!pCh.estaVacio()) { // Mientras la pila no este vacia

            if (!pCh.desapilar().equals(cCh.desencolar())) { // Comparamos al desencolar y al desapilar  mientras la pila no este vacía 
                return false;
            }
        }
        return true;
    }
    /**Al igual que en los ejercicios anteriores utilizamos este metodo para
     * pedir e imprimir el resultado y para identificar si la palabra es
     * Palindromo o no, se realiza una compararación al desencolar  y desapilar
     * 
     */
    public void imprimirResultado(Scanner sc) {
        try {
            System.out.println("Ingrese el texto");
            String texto = sc.nextLine();

            if (texto.isEmpty()) {
                System.err.println("ERRO!: No puedes ingresar un texto");
                return;
            }
            if (esPalindromo(texto)) { // Llamada al metodo esPalindromo
                System.out.println("Es palíndromo");
            } else {
                System.out.println("No es palíndromo");
            }

        } catch (NoSuchElementException e) { // Control de errores fin de archivo
            System.err.println("ERROR!: Has accedido al final del archivo finalizando");
            return;
        }

    }

}
