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

    public void mapaLeitosOcupados(Long alaId, Long setorId) {
        List<Leito> leitos_encontrados = new ArrayList<>();
        
        for(Setor setor : this.setores) { 
            // busca setor correto
            if(setor.getId() == setorId) { 
                for (Ala ala : setor.getAlas()){
                    // busca setor correto
                    if(ala.getId() == alaId){
                        // adiciona os leitos deste setor à lista que será retornada
                        for (Leito leito : ala.getLeitos()){
                            leitos_encontrados.add(leito);
                        }
                        
                    }
                }

            }
        }
        
        return leitos_encontrados;
    }
}
