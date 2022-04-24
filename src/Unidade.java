import CHCUUFPR.CHCUFPR;
import Enum.tipoDeUnidade;
import Enum.tipoDeLeito;

import java.util.ArrayList;
import java.util.List;

public class Unidade implements SistemaDeSaude {
    private Long id;
    private String nome;
    private tipoDeUnidade tipo;
    private List<Setor> setores = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Leito> leitos = new ArrayList<>();
    private CHCUFPR chcufpr;

    @Override
    public Paciente entraPaciente(Pessoa pessoa) {
        Paciente paciente = chcufpr.buscarPaciente(pessoa.getCpf());
        return paciente;
    }

    @Override
    public EquipeMedica equipeParaUnidade(EquipeMedica equipeMedica,Ala ala) {
        equipeMedica.setAla(ala);
        ala.setEquipesMedicas(equipeMedica);
        return equipeMedica;
    }

    @Override
    public EquipeMedica criaEquipe(String nome, Funcionario[] funcionario) {
        EquipeMedica equipeMedica = new EquipeMedica();
        List<Funcionario> list = new ArrayList<>();

        for(int i=0;i<funcionario.length;i++){
                list.add(funcionario[i]);
        }
        equipeMedica.setEquipe(list);
        equipeMedica.setNome(nome);

        return equipeMedica;
    }

    @Override
    public List<Leito> mapaLeitos(Ala ala) {
        return ala.getLeitos();
    }

    @Override
    public Leito modificaLeito(Leito leito, tipoDeLeito novoTipo, Ala novaAla) {
        leito.setTipo(novoTipo);
        leito.setAla(novaAla);
        return leito;
    }

    @Override
    public Leito criarleito(int quantidade, tipoDeLeito tipo, Ala ala) {
        Leito novoLeito = new Leito();
        novoLeito.setAla(ala);
        novoLeito.setTipo(tipo);
        return novoLeito;
    }
}
