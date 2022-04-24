package Hospital.BancoDedados;

import Hospital.Domain.Ala;
import Hospital.Domain.Paciente;

public interface PacienteRepository {
    Paciente buscaPaciente(Long Id);

    Paciente salvaNoBD(Paciente paciente);
}
