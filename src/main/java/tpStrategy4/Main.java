package tpStrategy4;

import tpStrategy4.model.Producto;
import tpStrategy4.strategy.AlimentoCalculadorStrategy;
import tpStrategy4.strategy.LibroCalculadorStrategy;
import tpStrategy4.strategy.MedicinaCalculadorStrategy;
import tpStrategy4.strategy.OtroCalculadorStrategy;

public class Main {
    public static void main(String[] args) {
        var p1 = new Producto(30, new LibroCalculadorStrategy());
        var p2 = new Producto(330, new MedicinaCalculadorStrategy());
        var p3 = new Producto(130, new AlimentoCalculadorStrategy());
        var p4 = new Producto(130, new OtroCalculadorStrategy());

        System.out.println("Libro (30): " + p1.precioFinal());
        System.out.println("Medicina (330): " + p2.precioFinal());
        System.out.println("Alimento (130): " + p3.precioFinal());
        System.out.println("Otro (130): " + p4.precioFinal());
    }
} 