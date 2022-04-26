package Hospital.BancoDeDados;

import Hospital.Domain.Leito;
import Hospital.Domain.Paciente;
import Hospital.Domain.Unidade;

public interface UnidadeRepository {
    Unidade buscaUnidade(Long Id);

    Unidade salvaNoBD(Unidade unidade);

}
