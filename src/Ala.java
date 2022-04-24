import java.util.ArrayList;
import java.util.List;

public class Ala {
    private Long id;
    private String nome;
    private Setor setor;
    private EquipeMedica equipeMedica;
    private List<Leito> leitos;

    public List<Leito> getLeitos() {
        return leitos;
    }

    public void setEquipesMedicas(EquipeMedica equipesMedica) {
        this.equipeMedica = equipesMedica;
    }
}
