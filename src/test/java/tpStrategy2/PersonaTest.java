package tpStrategy2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tpStrategy2.dateFormat.FechaCortaStrategy;
import tpStrategy2.dateFormat.FechaLargaStrategy;
import tpStrategy2.model.Persona;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {

    private Persona persona;

    @BeforeEach
    void setUp() {
        this.persona = new Persona(LocalDate.of(1986, 6, 3));
    }

    @Test
    void testFechaNacimientoFormatoCorto() {
        // Ejercitación
        String fechaFormateada = persona.fechaNacimiento(new FechaCortaStrategy());

        // Verificación
        assertEquals("3-06-1986", fechaFormateada);
    }

    @Test
    void testFechaNacimientoFormatoLargo() {
        // Ejercitación
        String fechaFormateada = persona.fechaNacimiento(new FechaLargaStrategy());

        // Verificación
        assertEquals("3 de junio de 1986", fechaFormateada);
    }
} 