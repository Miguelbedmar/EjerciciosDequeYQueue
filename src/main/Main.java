package main;
import modelo.*;
public class Main {

    public static void main(String[] args) {

    Cola<String> c= new Cola<>();
    c.encolar("Elemento 1");
    c.encolar("Elmento 2");    
    
    System.out.println(c);
    
    Pila<String> p = new Pila<>();
    p.apilar("Elemento 1");
    p.apilar("Elmento 2");

    System.out.println(p);
    
}

}
