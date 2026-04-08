package eje3;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Camiseta", 25.0, 12);

        System.out.println("Información inicial del producto:");
        producto.mostrarInfo();

        System.out.println("\nIntentando actualizar el precio a 30.0:");
        producto.setPrecio(30.0);
        producto.mostrarInfo();

        System.out.println("\nIntentando actualizar el precio a -5.0 (inválido):");
        producto.setPrecio(-5.0);
        producto.mostrarInfo();
    }
}