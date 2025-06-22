package tpStrategy3.strategy;

public interface CalculadorDePrecios {
    /**
     * Calcula el precio de un producto, aplicando la lógica de impuestos y descuentos que corresponda.
     * No incluye el costo de envío.
     */
    double calcular(double precioBase, double impuesto, double descuento);
} 