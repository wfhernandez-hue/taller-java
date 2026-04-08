package eje4;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 180);

        System.out.println("Simulación de vehículo con encapsulamiento:");
        vehiculo.mostrarEstado();

        vehiculo.acelerar(50);
        vehiculo.mostrarEstado();

        vehiculo.acelerar(80);
        vehiculo.mostrarEstado();

        vehiculo.acelerar(70);
        vehiculo.mostrarEstado();

        vehiculo.frenar(40);
        vehiculo.mostrarEstado();

        vehiculo.frenar(150);
        vehiculo.mostrarEstado();

        vehiculo.acelerar(-20);
        vehiculo.frenar(-15);
        vehiculo.mostrarEstado();
    }
}