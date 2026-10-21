package controlador;

import java.util.Scanner;
import modelo.Pila;

public class Ejercicio1<T> {

    private Pila<T> dato;
    private Scanner sc;

    public Ejercicio1() {

    }

    public String invertirTexto(String texto) {
        Pila<Character> dtCha = new Pila<>();

        for (int i = 0; i <= texto.length(); i++) {
            dtCha.apilar(texto.charAt(i));
        }
        StringBuilder invertir = new StringBuilder();
        while (!dato.estaVacio()) { 
            invertir.append("[").append(dtCha).append("]");
        }

        return invertir.toString();

    }

    public void imprimirResultado(Scanner sc) {

    }
}
