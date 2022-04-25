package Hospital.BancoDeDados;

import Hospital.Domain.Leito;
import Hospital.Domain.Enum.tipoDeLeito;

public interface LeitoRepository {
    Leito buscaLeito(Long Id);

    Leito requereLeitoVago(tipoDeLeito tipo_leito);

    Leito salvaNoBD(Leito leito);
}
