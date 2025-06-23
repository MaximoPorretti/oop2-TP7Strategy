package tpStrategy3.model;

import tpStrategy3.strategy.CalculadorPrecioStrategy;

public class Producto {
    private double precio;
    private CalculadorPrecioStrategy strategy;
    public Producto(double precio, CalculadorPrecioStrategy strategy) {
        this.precio = precio;
        this.strategy = strategy;
    }
    public double precioFinal() {
        return this.strategy.calcularPrecio(this.precio);
    }
} 