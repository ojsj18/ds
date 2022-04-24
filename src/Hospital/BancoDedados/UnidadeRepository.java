package Hospital.BancoDedados;

import Hospital.Domain.Ala;
import Hospital.Domain.Unidade;

public interface UnidadeRepository {
    Unidade buscaUnidade(Long Id);

    Unidade salvaNoBD(Unidade unidade);
}
