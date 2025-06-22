package tpStrategy3;

import tpStrategy3.model.Producto;
import tpStrategy3.strategy.CalculadorPrecioDescuento;
import tpStrategy3.strategy.CalculadorPrecioImpuestoReducido;
import tpStrategy3.strategy.CalculadorPrecioRegular;

public class Main {
    public static void main(String[] args) {
        // Se instancian los productos con su estrategia de cálculo específica.
        Producto p1 = new Producto(100, 0.21, 0, 50, new CalculadorPrecioRegular());
        Producto p2 = new Producto(100, 0.21, 0.1, 50, new CalculadorPrecioDescuento());
        Producto p3 = new Producto(100, 0.21, 0, 50, new CalculadorPrecioImpuestoReducido());

        System.out.println("Precio Regular: " + p1.calcularPrecioFinal());
        System.out.println("Precio Descuento: " + p2.calcularPrecioFinal());
        System.out.println("Precio Impuesto Reducido: " + p3.calcularPrecioFinal());
    }
} 