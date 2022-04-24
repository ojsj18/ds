package Hospital.Domain;

import Hospital.BancoDedados.AlaRepository;

import java.util.List;

public class Ala {
    private Long id;
    private String nome;
    private Setor setor;
    private EquipeMedica equipeMedica;
    private List<Leito> leitos;

    //Getter and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public EquipeMedica getEquipeMedica() {
        return equipeMedica;
    }

    public void setEquipeMedica(EquipeMedica equipeMedica) {
        this.equipeMedica = equipeMedica;
    }

    public void setLeitos(List<Leito> leitos) {
        this.leitos = leitos;
    }

    public List<Leito> getLeitos() {
        return leitos;
    }

    public void setEquipesMedicas(EquipeMedica equipesMedica) {
        this.equipeMedica = equipesMedica;
    }
}
