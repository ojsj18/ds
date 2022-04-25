package Hospital.BancoDeDados;

import Hospital.Domain.Ala;

public interface AlaRepository {
    Ala buscaAla(Long IdAla);

    Ala salvaNoBD(Ala ala);
}
