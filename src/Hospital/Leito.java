package Hospital;

import Hospital.Enum.tipoDeLeito;

public class Leito {
    private Long id;
    private Boolean disponibilidade;
    private tipoDeLeito tipo;
    private Paciente paciente;
    private Ala ala;

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setTipo(tipoDeLeito tipo) {
        this.tipo = tipo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public tipoDeLeito getTipo() {
        return tipo;
    }

    public void setAla(Ala ala) {
        this.ala = ala;
    }

    public Ala getAla() {
        return ala;
    }




}
