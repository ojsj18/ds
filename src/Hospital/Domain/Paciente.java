package Hospital.Domain;

import Hospital.Domain.Enum.tipoDePaciente;

public class Paciente extends Pessoa {
    private String idInterno;
    private ProntuarioEletronico prontuario;
    private Leito leito;
    private tipoDePaciente statusPaciente;
    //Getter and setter
    public String getIdInterno() {
        return this.idInterno;
    }

    public ProntuarioEletronico getProntuarioEletronico() {
        return this.prontuario;
    }

    public void setProntuarioEletronico(ProntuarioEletronico prontuario) {
        this.prontuario = prontuario;
    }

    public Leito getLeito() {
        return this.leito;
    }
    
    public void setLeito(Leito leito) {
        this.leito = leito;
    }

    public tipoDePaciente getTipoDePaciente(){
        return this.statusPaciente;
    }

    public tipoDePaciente setTipoDePaciente(tipoDePaciente statusPaciente){
        return this.statusPaciente = statusPaciente;
    }
}
