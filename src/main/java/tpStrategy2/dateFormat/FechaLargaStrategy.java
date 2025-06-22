package tpStrategy2.dateFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FechaLargaStrategy implements DateFormatStrategy {
    @Override
    public String formatear(LocalDate fecha) {
        // Usamos Locale para asegurar que el mes se escriba en español
        return fecha.format(DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy", new Locale("es", "ES")));
    }
} 