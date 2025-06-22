package tpStrategy3.model;

import tpStrategy3.strategy.CalculadorDePrecios;

public class Producto {
    private double precioBase;
    private double impuesto;
    private double descuento;
    private double envio;
    private CalculadorDePrecios calculador;

    public Producto(double precioBase, double impuesto, double descuento, double envio, CalculadorDePrecios calculador) {
        this.precioBase = precioBase;
        this.impuesto = impuesto;
        this.descuento = descuento;
        this.envio = envio;
        this.calculador = calculador;
    }

    public double calcularPrecioFinal() {
        double precioCalculado = this.calculador.calcular(this.precioBase, this.impuesto, this.descuento);
        return precioCalculado + this.envio;
    }
} 