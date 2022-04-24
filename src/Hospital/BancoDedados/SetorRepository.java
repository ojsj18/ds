package Hospital.BancoDedados;

import Hospital.Domain.Ala;
import Hospital.Domain.Setor;

public interface SetorRepository {
    Setor buscaSetor(Long Id);

    Setor salvaNoBD(Setor setor);
}
