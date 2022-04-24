package Hospital.BancoDedados;

import Hospital.Domain.Ala;
import Hospital.Domain.Leito;

public interface AlaRepository {
    Ala buscaAla(Long IdAla);

    Ala salvaNoBD(Ala ala);
}
