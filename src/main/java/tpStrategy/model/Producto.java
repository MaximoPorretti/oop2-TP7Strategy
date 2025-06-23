package tpStrategy.model;

public class Producto {
    private double precio;
    private double peso;

    public Producto(double precio, double peso) {
        this.precio = precio;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }
    public double getPeso() {
        return peso;
    }
} 