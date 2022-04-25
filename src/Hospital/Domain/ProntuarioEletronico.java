package Hospital.Domain;

import java.util.List;
import Hospital.Domain.Enum.tipoDeUrgencia;

public class ProntuarioEletronico {
    private Long codigo_cid;
    private Bool cirurgia_eletiva;
    private tipoDeUrgencia urgencia;

    //Getter and setter
    public String getCodigoCID() {
        return codigo_cid;
    }

    public void setCodigoCID(Long codigo_cid) {
        this.codigo_cid = codigo_cid;
    }

    public Bool getCirurgiaEletiva() {
        return cirurgia_eletiva;
    }

    public void setCirurgiaEletiva(Bool cirurgia_eletiva) {
        this.cirurgia_eletiva = cirurgia_eletiva;
    }

    public Urgencia getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(tipoDeUrgencia urgencia) {
        this.urgencia = urgencia;
    }
}
