package tpStrategy2.model;

import tpStrategy2.dateFormat.DateFormatStrategy;
import java.time.LocalDate;

public class Persona {
    private LocalDate fechaNacimiento;
    public Persona(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String fechaNacimiento(DateFormatStrategy strategy) {
        return strategy.formatear(this.fechaNacimiento);
    }
} 