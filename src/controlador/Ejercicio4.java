package controlador;

import java.util.Scanner;
import modelo.Pila;

public class Ejercicio4 {

    public String conversorBinario(int numero) {
        if (numero == 0) {
            return "0";
        }
        Pila<Integer> pIn = new Pila<>();

        while (numero > 0) {
            pIn.apilar(numero % 2);
            numero = numero / 2;
        }
        StringBuilder strbP = new StringBuilder();

        return "";
    }

}
