package controlador;

import java.util.NoSuchElementException;
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
        while (!pIn.estaVacio()) {
            strbP.append(pIn.desapilar());
        }

        return strbP.toString();
    }

    public void ejecutar(Scanner sc) {

        int numero = 0;
        boolean controladorContinuar = false;

        while (!controladorContinuar) {
            try {
              System.out.println("Ingrese un numero");  
                String entradaValidar= sc.nextLine();
                numero=Integer.parseInt(entradaValidar);


            } catch (NumberFormatException e) {
                System.err.println("Numer Inválido");
            } catch (NoSuchElementException e) {
                System.err.println("ERROR!: Has accedido al final del archivo finalizando");
                controladorContinuar = false;
            }
        }
    }

}
