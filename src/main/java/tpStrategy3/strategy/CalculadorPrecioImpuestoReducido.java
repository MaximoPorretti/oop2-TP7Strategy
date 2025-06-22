package tpStrategy3.strategy;

public class CalculadorPrecioImpuestoReducido implements CalculadorDePrecios {
    @Override
    public double calcular(double precioBase, double impuesto, double descuento) {
        // Lógica de ejemplo: el impuesto se reduce a la mitad.
        return precioBase * (1 + (impuesto / 2));
    }
} 