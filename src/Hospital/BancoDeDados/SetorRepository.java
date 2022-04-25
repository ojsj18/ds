package Hospital.BancoDeDados;

import Hospital.Domain.Setor;

public interface SetorRepository {
    Setor buscaSetor(Long Id);

    Setor salvaNoBD(Setor setor);
}
