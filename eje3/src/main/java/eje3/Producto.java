package eje3;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void setPrecio(double nuevoPrecio) {
        if (nuevoPrecio < 0) {
            System.out.println("Error: el precio no puede ser negativo. No se realizó el cambio.");
        } else {
            this.precio = nuevoPrecio;
            System.out.println("Precio actualizado a: " + this.precio);
        }
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad en inventario: " + cantidad);
    }
}
