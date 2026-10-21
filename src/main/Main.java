package main;

import modelo.*;

public class Main {

    public static void main(String[] args) {
        Pila<String> p = new Pila<>();

        p.apilar("Elemento 1");
        p.apilar("Elemento 2");
        p.apilar("Elemento 3");
        System.out.println("\nTamaño de la  Pila" + p.getTamanio() + p);

        while (!p.estaVacio()) {
            System.out.println(p.desapilar());
        }

    }

}
