import Enum.tipoDeLeito;
public class Leito {
    private Long id;
    private Boolean disponibilidade;
    private tipoDeLeito tipo;

    private Paciente paciente;
    private Ala ala;

    public void setTipo(tipoDeLeito tipo) {
        this.tipo = tipo;
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
