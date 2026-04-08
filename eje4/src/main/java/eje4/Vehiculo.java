package eje4;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidad;
    private final int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = Math.max(0, velocidadMaxima);
        this.velocidad = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void acelerar(int incremento) {
        if (incremento <= 0) {
            System.out.println("El incremento debe ser mayor que cero.");
            return;
        }

        velocidad += incremento;
        if (velocidad > velocidadMaxima) {
            velocidad = velocidadMaxima;
        }

        System.out.println("Acelerando " + incremento + " km/h...");
    }

    public void frenar(int decremento) {
        if (decremento <= 0) {
            System.out.println("El decremento debe ser mayor que cero.");
            return;
        }

        velocidad -= decremento;
        if (velocidad < 0) {
            velocidad = 0;
        }

        System.out.println("Frenando " + decremento + " km/h...");
    }

    public void mostrarEstado() {
        System.out.println("Vehículo: " + marca + " " + modelo);
        System.out.println("Velocidad actual: " + velocidad + " km/h");
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("-----------------------------");
    }
}
