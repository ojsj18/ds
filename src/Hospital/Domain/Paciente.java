package Hospital.Domain;

import Hospital.Domain.Enum.tipoDePaciente;

public class Paciente extends Pessoa {
    private Long idInterno;
    private ProntuarioEletronico prontuario;
    private Leito leito;
    private tipoDePaciente statusPaciente;
    //Getter and setter
    public String getIdInterno() {
        return this.idInterno;
    }

    public String getProntuarioEletronico() {
        return this.prontuario;
    }

    public String setProntuarioEletronico(ProntuarioEletronico prontuario) {
        this.prontuario = prontuario;
    }

    public String getLeito() {
        return this.leito;
    }
    
    public String setLeito(Leito leito) {
        this.leito = leito;
    }

    public tipoDePaciente getTipoDePaciente(){
        return this.statusPaciente;
    }

    public tipoDePaciente setTipoDePaciente(tipoDePaciente statusPaciente){
        return this.statusPaciente = statusPaciente;
    }
}
