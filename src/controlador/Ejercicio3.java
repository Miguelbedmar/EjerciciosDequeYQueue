package controlador;
//Importaciones

import java.util.Scanner;
import modelo.Cola;
import modelo.Pila;

public class Ejercicio3 {

    public boolean esPalindromo(String texto) {
        String validado = "";
        validado = validado.toLowerCase().trim(); //String sin mayusculas ni espacios

        Pila<Character> pCh = new Pila<>();
        Cola<Character> cCh = new Cola<>();

        for (int i = 0; i < validado.length(); i++) {
            pCh.apilar(validado.charAt(i));
            cCh.encolar(validado.charAt(i));
        }

        while (!pCh.estaVacio()) {
            Character dentroPila = pCh.desapilar();
            Character dentroCola = cCh.desencolar();
            if (!dentroPila.equals(dentroCola)) {
                return false;
            }
        }
        return true;
    }

    public void ejecutar(Scanner sc) {

    }

}
