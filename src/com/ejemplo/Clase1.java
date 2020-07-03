package com.ejemplo;

public class Clase1 {
    int myInt = 0;

    public Clase1(){
        //Esto es un Constructor sin parámetros.
        System.out.println("El constructor sin parámetros se ha ejecutado. El valor de myInt es " + myInt + "; el valor por defecto.");
    }

    public Clase1(int initialValue){
        //Esto es un Constructor con parámetros.
        myInt = initialValue;
        System.out.println("El constructor con parámetro int se ha ejecutado. El valor de myInt será " + myInt);
    }

    public Clase1(String initialValue){
        //Esto es un Constructor con parámetros.
        myInt = Integer.parseInt(initialValue);
        System.out.println("El constructor con parámetros String se ha ejecutado. El valor de myInt será " + myInt);
    }

    public static Clase1 factory99(){
        return new Clase1(99);
    }
}
