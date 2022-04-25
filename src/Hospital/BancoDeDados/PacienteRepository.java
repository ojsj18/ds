package Hospital.BancoDeDados;

import Hospital.Domain.Paciente;

public interface PacienteRepository {
    Paciente buscaPaciente(Long Id);

    Paciente salvaNoBD(Paciente paciente);
}
