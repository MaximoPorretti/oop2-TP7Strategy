package tpStrategy.shipping;

import tpStrategy.model.CarritoDeCompras;

public interface ShippingStrategy {
    double calcularCosto(CarritoDeCompras carrito, String destino);
} 