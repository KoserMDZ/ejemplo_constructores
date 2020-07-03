package com.ejemplo;

public class Main {

    public static void main(String[] args) {
        Clase1 myObject1 = new Clase1();
        Clase1 myObject2 = new Clase1(1);
        Clase1 myObject3 = new Clase1("2");

        Clase1 myObject4 = Clase1.factory99();
    }
}
