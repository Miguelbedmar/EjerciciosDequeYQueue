package main;

import modelo.Cola;

public class Main {

    public static void main(String[] args) {
        Cola<String> c = new Cola<>();

        c.encolar("Elemento 1");
        c.encolar("Elemento 2");
        c.encolar("Elemento 3");

        System.out.println("Tamaño de la cola :" + c.getTamanio());
        System.out.println(c);

        while (!c.estaVacio()) {
            System.out.println(c.desencolar());
        }

    }

}
