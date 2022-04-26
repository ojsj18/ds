package Hospital.Domain;

import java.util.List;

public class Setor {
    private String id;
    private String nome;
    private List<Ala> alas;

    //Getter and setter
    public String getId() {
        return id;
    }

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

    public Ala criarAla(Ala ala){
        this.alas.add(ala);
        
        return ala;
    }
}
