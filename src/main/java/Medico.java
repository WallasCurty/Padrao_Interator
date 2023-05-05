import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Medico implements Iterable<Paciente> {
    private List<Paciente> pacientes = new ArrayList<Paciente>();

    public Medico(Paciente... pacientes) {
        this.alunos = Arrays.asList(pacientes);
    }

    @Override
    public Iterator<Paciente> iterator() {
        return alunos.iterator();
    }
}
