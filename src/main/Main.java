package main;

import java.util.Scanner;
import modelo.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila<String> p = new Pila<>();


            System.out.println("Ingrese los elementos de la pila");
            String e = sc.nextLine();

            p.apilar(e);
            System.out.println(p.getTamanio());

            System.out.println(p);
        

    }

}
