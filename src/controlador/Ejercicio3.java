package controlador;
//Importaciones

import java.util.Scanner;
import modelo.Cola;
import modelo.Pila;
import java.util.NoSuchElementException;

public class Ejercicio3 {

    public boolean esPalindromo(String texto) {
        String validado = "";
        validado = validado.toLowerCase().trim(); //String sin mayusculas utilizando tolowercase y eliminamos posible espacios con trim()
        //se podría utilizar el metodo replace también

        Pila<Character> pCh = new Pila<>();
        Cola<Character> cCh = new Cola<>();

        for (int i = 0; i < validado.length(); i++) { // Apilamos y encolamos
            pCh.apilar(validado.charAt(i));
            cCh.encolar(validado.charAt(i));
        }

        while (!pCh.estaVacio()) {  // Mientras la pila no este vacia 
            Character dentroPila = pCh.desapilar();
            Character dentroCola = cCh.desencolar();
            if (!dentroPila.equals(dentroCola)) { // Comparamos entre ambas 
                return false;
            }
        }
        return true;
    }

    public void imprimirResultado(Scanner sc) {
        try {
            System.out.println("Ingrese el texto");
            String texto;
            

        } catch (NoSuchElementException e) {
            System.err.println("ERROR!: Has accedido al final del archivo finalizando");
        }

    }

}
