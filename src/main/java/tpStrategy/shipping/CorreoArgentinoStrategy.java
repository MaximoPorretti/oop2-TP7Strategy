package tpStrategy.shipping;

import tpStrategy.external.DistanciaService;
import tpStrategy.model.CarritoDeCompras;

public class CorreoArgentinoStrategy implements ShippingStrategy {
    private final DistanciaService distanciaService;

    public CorreoArgentinoStrategy(DistanciaService distanciaService) {
        this.distanciaService = distanciaService;
    }

    @Override
    public double calcularCosto(CarritoDeCompras carrito, String destino) {
        if ("Capital Federal".equalsIgnoreCase(destino)) {
            return 500;
        }

        double distancia = distanciaService.getDistancia("Capital Federal", destino);
        return 800 + (5 * distancia);
    }
} 