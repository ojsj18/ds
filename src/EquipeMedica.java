import java.util.List;

public class EquipeMedica {
    private Long id;
    private String Nome;
    private Funcionario chefia;
    private List<Funcionario> equipe;
    private Ala ala;

    public void setAla(Ala ala) {
        this.ala = ala;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
    public void setEquipe(List<Funcionario> equipe) {
        this.equipe = equipe;
    }
}
