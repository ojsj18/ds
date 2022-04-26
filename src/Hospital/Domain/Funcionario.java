package Hospital.Domain;

import Hospital.Domain.Enum.tipoDeCargo;
import Hospital.Domain.Enum.tipoDePermissao;

public class Funcionario extends Pessoa {
    private Long idFuncionario;
    private tipoDePermissao permissao;
    private tipoDeCargo cargo;

    //Getter and setter
    public tipoDePermissao getPermissao() {
        return permissao;
    }

    public void setPermissao(tipoDePermissao permissao) {
        this.permissao = permissao;
    }

    public tipoDeCargo getCargo() {
        return cargo;
    }

    public void setCargo(tipoDeCargo cargo) {
        this.cargo = cargo;
    }

}
