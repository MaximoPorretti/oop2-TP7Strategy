package tpStrategy3.strategy;

public class CalculadorPrecioRegular implements CalculadorDePrecios {
    @Override
    public double calcular(double precioBase, double impuesto, double descuento) {
        return precioBase * (1 + impuesto);
    }
} 