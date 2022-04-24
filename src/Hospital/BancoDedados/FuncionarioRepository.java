package Hospital.BancoDedados;

import Hospital.Domain.Funcionario;

public interface FuncionarioRepository {
    Funcionario buscaFuncionario(Long IdFuncionario);

    Funcionario salvaNoBD(Funcionario funcionario);
}
