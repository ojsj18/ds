import java.util.List;

public class Setor {
    private Long id;
    private String nome;
    private List<Ala> alas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ala> getAlas() {
        return alas;
    }

    public void setAlas(List<Ala> alas) {
        this.alas = alas;
    }
}
