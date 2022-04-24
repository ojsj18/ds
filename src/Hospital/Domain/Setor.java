package Hospital.Domain;

import Hospital.BancoDedados.SetorRepository;

import java.util.List;

public class Setor {
    private Long id;
    private String nome;
    private List<Ala> alas;

    //Getter and setter
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
