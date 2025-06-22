package tpStrategy.model;

import tpStrategy.shipping.ShippingStrategy;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public double getSumaPrecios() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public double getTotalPeso() {
        return productos.stream().mapToDouble(Producto::getPeso).sum();
    }

    public double calcularCostoTotal(ShippingStrategy strategy, String destino) {
        double costoEnvio = strategy.calcularCosto(this, destino);
        return getSumaPrecios() + costoEnvio;
    }
} 