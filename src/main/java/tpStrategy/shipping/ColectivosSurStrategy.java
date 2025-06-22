package tpStrategy.shipping;

import tpStrategy.model.CarritoDeCompras;

public class ColectivosSurStrategy implements ShippingStrategy {
    @Override
    public double calcularCosto(CarritoDeCompras carrito, String destino) {
        double costo = 0;
        double pesoTotal = carrito.getTotalPeso();

        if ("Capital Federal".equalsIgnoreCase(destino)) {
            costo = 1000;
        } else if ("Gran Buenos Aires".equalsIgnoreCase(destino)) {
            costo = 1500;
        } else {
            costo = 3000;
        }

        if (pesoTotal > 5 && pesoTotal <= 30) {
            costo += 500;
        } else if (pesoTotal > 30) {
            costo += 2000;
        }

        return costo;
    }
} 