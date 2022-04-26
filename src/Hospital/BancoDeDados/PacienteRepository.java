package Hospital.BancoDeDados;

import Hospital.Domain.Leito;
import Hospital.Domain.Paciente;
import Hospital.Domain.Unidade;

public interface PacienteRepository {
    Paciente buscaPaciente(Long Id);

    Paciente salvaNoBD(Paciente paciente);

    Paciente salvaPedidoLeito(Paciente paciente, Leito leito);
}
