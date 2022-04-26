package Hospital.Domain;

import java.util.List;

public class Ala {
    private Long id;
    private String nome;
    private List<Leito> leitos;

    //Getter and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLeitos(List<Leito> leitos) {
        this.leitos = leitos;
    }

    public List<Leito> getLeitos() {
        return leitos;
    }

    public Long getId() {
        return id;
    }
}
