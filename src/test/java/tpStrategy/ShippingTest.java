package tpStrategy;

import org.junit.jupiter.api.Test;
import tpStrategy.external.MockDistanciaService;
import tpStrategy.model.CarritoDeCompras;
import tpStrategy.model.Producto;
import tpStrategy.shipping.ColectivosSurStrategy;
import tpStrategy.shipping.CorreoArgentinoStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingTest {

    @Test
    void testColectivosSurCostoCapitalFederalPesoLigero() {
        // Setup
        CarritoDeCompras carrito = new CarritoDeCompras();
        carrito.agregarProducto(new Producto(1000, 3)); // 3kg
        ColectivosSurStrategy strategy = new ColectivosSurStrategy();

        // Ejercitación
        double costoTotal = carrito.calcularCostoTotal(strategy, "Capital Federal");

        // Verificación
        // costoEsperado = 1000 (producto) + 1000 (envío)
        assertEquals(2000, costoTotal);
    }

    @Test
    void testColectivosSurCostoOtroDestinoPesoPesado() {
        // Setup
        CarritoDeCompras carrito = new CarritoDeCompras();
        carrito.agregarProducto(new Producto(5000, 35)); // 35kg
        ColectivosSurStrategy strategy = new ColectivosSurStrategy();

        // Ejercitación
        double costoTotal = carrito.calcularCostoTotal(strategy, "La Pampa");

        // Verificación
        // costoEsperado = 5000 (producto) + 3000 (envío base) + 2000 (adicional peso)
        assertEquals(10000, costoTotal);
    }

    @Test
    void testCorreoArgentinoCostoCapitalFederal() {
        // Setup
        CarritoDeCompras carrito = new CarritoDeCompras();
        carrito.agregarProducto(new Producto(1000, 2));
        CorreoArgentinoStrategy strategy = new CorreoArgentinoStrategy(new MockDistanciaService());

        // Ejercitación
        double costoTotal = carrito.calcularCostoTotal(strategy, "Capital Federal");

        // Verificación
        // costoEsperado = 1000 (producto) + 500 (envío)
        assertEquals(1500, costoTotal);
    }

    @Test
    void testCorreoArgentinoCostoOtroDestino() {
        // Setup
        CarritoDeCompras carrito = new CarritoDeCompras();
        carrito.agregarProducto(new Producto(2000, 5));
        CorreoArgentinoStrategy strategy = new CorreoArgentinoStrategy(new MockDistanciaService());

        // Ejercitación
        // MockDistanciaService devolverá 300km para Rosario
        double costoTotal = carrito.calcularCostoTotal(strategy, "Rosario");

        // Verificación
        double costoEnvio = 800 + (5 * 300); // 800 + 1500 = 2300
        // double costoEsperado = 2000 + costoEnvio;
        assertEquals(4300, costoTotal);
    }
} 