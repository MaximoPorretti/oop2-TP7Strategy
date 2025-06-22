package tpStrategy3.strategy;

public class CalculadorPrecioDescuento implements CalculadorDePrecios {
    @Override
    public double calcular(double precioBase, double impuesto, double descuento) {
        double precioConImpuesto = precioBase * (1 + impuesto);
        return precioConImpuesto * (1 - descuento);
    }
} 