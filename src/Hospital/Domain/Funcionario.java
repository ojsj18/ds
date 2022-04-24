package Hospital.Domain;

import Hospital.Enum.tipoDeCargo;
import Hospital.Enum.tipoDePermissao;

public class Funcionario extends Pessoa {
    private Long idFuncionario;
    private Setor setorCargo;
    private tipoDePermissao permissao;
    private tipoDeCargo cargo;
    private EquipeMedica equipeMedica;

    public Setor getSetorCargo() {
        return setorCargo;
    }

    public void setSetorCargo(Setor setorCargo) {
        this.setorCargo = setorCargo;
    }

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

    public EquipeMedica getEquipeMedica() {
        return equipeMedica;
    }

    public void setEquipeMedica(EquipeMedica equipeMedica) {
        this.equipeMedica = equipeMedica;
    }
}
