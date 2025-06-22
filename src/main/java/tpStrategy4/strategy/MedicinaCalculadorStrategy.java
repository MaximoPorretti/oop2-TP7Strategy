package tpStrategy4.strategy;

public class MedicinaCalculadorStrategy implements CalculadorPrecioStrategy {
    @Override
    public double calcularPrecio(double precioBase) {
        double impuestos = 0;
        double descuentos = (precioBase > 50) ? 0.1 : 0;
        boolean envioGratis = (precioBase > 100);

        double total = precioBase * (1 + impuestos) * (1 - descuentos);
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }
} 