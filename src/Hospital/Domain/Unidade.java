package Hospital.Domain;

import Hospital.Domain.Enum.tipoDeUnidade;

import java.util.List;

public class Unidade{
    private Long id;
    private String nome;
    private tipoDeUnidade tipo;

    private List<Setor> setores;

    //Getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public tipoDeUnidade getTipo() {
        return tipo;
    }

    public void setTipo(tipoDeUnidade tipo) {
        this.tipo = tipo;
    }
}
