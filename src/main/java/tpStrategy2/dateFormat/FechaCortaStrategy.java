package tpStrategy2.dateFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaCortaStrategy implements DateFormatStrategy {
    @Override
    public String formatear(LocalDate fecha) {
        return fecha.format(DateTimeFormatter.ofPattern("d-MM-yyyy"));
    }
} 