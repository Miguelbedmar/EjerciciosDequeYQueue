package controlador;

import java.util.NoSuchElementException;
import java.util.Scanner;
import modelo.Pila;

public class Ejercicio4 {

    public String conversorBinario(int numero) {
        if (numero == 0) { // comrpobamos si el numero es cero 
            return "0";
        }
        Pila<Integer> pIn = new Pila<>(); 

        while (numero > 0) { 
            pIn.apilar(numero % 2); // apilamos el resto mientras  el numero sea mayor que cero 
            numero = numero / 2;
        } // si el usuario ingresa diez deberia dar 1010 como resultado
        StringBuilder strbP = new StringBuilder();
        while (!pIn.estaVacio()) {
            strbP.append(pIn.desapilar()); 
        }

        return strbP.toString();
    }

    public void imprimirResultado(Scanner sc) { 

        int numero = 0;
        boolean controladorContinuar = true;

        while (controladorContinuar) {
            try {
                System.out.println("Ingrese un numero");
                String entradaValidar = sc.nextLine();
                numero = Integer.parseInt(entradaValidar);
                if (numero < 0) {
                    System.err.println("ERROR! debes ingresar un numero positivo");
                } else {
                    System.out.println("Numero binario: " + conversorBinario(numero));
                    controladorContinuar = false;
                }

            } catch (NumberFormatException e) {
                System.err.println("Numer Inválido");
            } catch (NoSuchElementException e) {
                System.err.println("ERROR!: Has accedido al final del archivo finalizando");
                controladorContinuar = false;
            }
        }
    }

}
