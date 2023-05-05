import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HospitalTest {


    @Test
    void deveContarPacientesAtivosDoMedico() {
        Medico medico = new Medico(
                new Paciente("Fernanda Barbosa", true),
                new Paciente("Roberto Silva", true),
                new Paciente("Carla Aparecida", false),
                new Paciente("Fernando Pinto", true),
                new Paciente("José Maria", false),
                new Paciente("Carlos Alberto", true)

        );
        assertEquals(4, Hospital.contarPacientesAtivosPorMedico(medico));
    }

    @Test
    void deveContarTotalAlunosCurso() {
        Medico medico = new Medico(
                new Paciente("Fernanda Barbosa", true),
                new Paciente("Roberto Silva", true),
                new Paciente("Carla Aparecida", false),
                new Paciente("Fernando Pinto", true),
                new Paciente("José Maria", false),
                new Paciente("Carlos Alberto", true)
        );
        assertEquals(6, Hospital.contarTotalPacientesPorMedico(medico));
    }
}
