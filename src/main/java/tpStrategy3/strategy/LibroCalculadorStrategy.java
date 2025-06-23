package tpStrategy3.strategy;

public class LibroCalculadorStrategy implements CalculadorPrecioStrategy {
    @Override
    public double calcularPrecio(double precioBase) {
        double impuestos = 0.1;
        double descuentos = 0.1;
        boolean envioGratis = (precioBase > 100);

        double total = precioBase * (1 + impuestos) * (1 - descuentos);
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }
} 