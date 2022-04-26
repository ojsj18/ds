package Hospital.Domain;

import java.util.List;
import Hospital.Domain.Enum.tipoDeUrgencia;

public class ProntuarioEletronico {
    private Long codigo_cid;
    private Boolean cirurgia_eletiva;
    private tipoDeUrgencia urgencia;

    //Getter and setter
    public Long getCodigoCID() {
        return codigo_cid;
    }

    public void setCodigoCID(Long codigo_cid) {
        this.codigo_cid = codigo_cid;
    }

    public Boolean getCirurgiaEletiva() {
        return cirurgia_eletiva;
    }

    public void setCirurgiaEletiva(Boolean cirurgia_eletiva) {
        this.cirurgia_eletiva = cirurgia_eletiva;
    }

    public tipoDeUrgencia getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(tipoDeUrgencia urgencia) {
        this.urgencia = urgencia;
    }
}
