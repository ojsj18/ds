package Hospital.BancoDedados;

import Hospital.Domain.Leito;

public interface LeitoRepository {
    Leito buscaLeito(Long Id);
}
