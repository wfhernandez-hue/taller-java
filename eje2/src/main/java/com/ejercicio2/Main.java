package com.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura(20.0);
        temperatura.mostrar();

        System.out.println("Aumentando temperatura en 15 °C...");
        temperatura.aumentar(15.0);
        temperatura.mostrar();

        System.out.println("Disminuyendo temperatura en 50 °C...");
        temperatura.disminuir(50.0);
        temperatura.mostrar();

        System.out.println("Intentando disminuir por debajo del cero absoluto...");
        temperatura.disminuir(250.0);
        temperatura.mostrar();
    }
}