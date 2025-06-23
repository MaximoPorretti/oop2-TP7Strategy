package tpStrategy.external;

import java.util.Map;

public class MockDistanciaService implements DistanciaService {
    private static final Map<String, Double> distancias = Map.of(
            "La Plata", 60.0,
            "Rosario", 300.0,
            "Mar del Plata", 400.0
    );

    @Override
    public double getDistancia(String origen, String destino) {
        if (!"Capital Federal".equalsIgnoreCase(origen)) {
            throw new IllegalArgumentException("El origen debe ser 'Capital Federal'");
        }
        return distancias.getOrDefault(destino, 1000.0);
    }
} 