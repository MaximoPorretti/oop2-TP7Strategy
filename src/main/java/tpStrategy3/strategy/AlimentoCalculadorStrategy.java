package tpStrategy3.strategy;

public class AlimentoCalculadorStrategy implements CalculadorPrecioStrategy {
    @Override
    public double calcularPrecio(double precioBase) {
        double impuestos = 0.05;
        double descuentos = (precioBase > 100) ? 0.15 : 0;
        boolean envioGratis = (precioBase > 200);

        double total = precioBase * (1 + impuestos) * (1 - descuentos);
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }
} 