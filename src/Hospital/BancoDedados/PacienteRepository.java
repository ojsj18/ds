package Hospital.BancoDedados;

import Hospital.Domain.Paciente;

public interface PacienteRepository {
    Paciente buscaPaciente(Long Id);
}
