package com.ejercicio2;

public class Temperatura {
    private double gradosCelsius;

    public Temperatura(double gradosCelsius) {
        if (gradosCelsius < -273.15) {
            this.gradosCelsius = -273.15;
        } else {
            this.gradosCelsius = gradosCelsius;
        }
    }

    public void aumentar(double incremento) {
        if (incremento > 0) {
            gradosCelsius += incremento;
        }
    }

    public void disminuir(double decremento) {
        if (decremento > 0) {
            gradosCelsius -= decremento;
            if (gradosCelsius < -273.15) {
                gradosCelsius = -273.15;
            }
        }
    }

    public void mostrar() {
        System.out.printf("Temperatura actual: %.2f °C%n", gradosCelsius);
    }
}
