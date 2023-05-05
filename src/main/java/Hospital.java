import java.util.Iterator;

public class Hospital {
    public static Integer contarPacientesAtivosPorMedico(Medico medico) {
        int quantidade = 0;
        for (Paciente paciente : medico) {
            if (paciente.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalPacientesPorMedico(Medico medico) {
        int quantidade = 0;
        for (Iterator a = medico.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
