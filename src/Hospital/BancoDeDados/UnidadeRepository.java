package Hospital.BancoDeDados;
import Hospital.Domain.Unidade;

public interface UnidadeRepository {
    Unidade buscaUnidade(Long Id);

    Unidade salvaNoBD(Unidade unidade);

}
