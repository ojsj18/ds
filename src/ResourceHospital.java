import Hospital.BancoDedados.CHCUFPR;
import Hospital.BancoDedados.EquipeMedicaRepository;
import Hospital.BancoDedados.LeitoRepository;
import Hospital.BancoDedados.PacienteRepository;
import Hospital.Domain.*;
import Hospital.Enum.tipoDeLeito;
import Hospital.*;

import java.util.ArrayList;
import java.util.List;

public class ResourceHospital implements SistemaDeSaude {
    private CHCUFPR chcufpr;
    private PacienteRepository pacienteRepository;
    private LeitoRepository leitoRepository;
    private EquipeMedicaRepository equipeMedicaRepository;

    @Override
    public Paciente entraPaciente(Pessoa pessoa) {
        Paciente paciente = chcufpr.buscarPaciente(pessoa.getCpf());
        return pacienteRepository.salvaNoBD(paciente);
    }

    @Override
    public EquipeMedica equipeParaUnidade(EquipeMedica equipeMedica, Ala ala) {
        equipeMedica.setAla(ala);
        ala.setEquipesMedicas(equipeMedica);
        return equipeMedicaRepository.salvaNoBD(equipeMedica);
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

        return equipeMedicaRepository.salvaNoBD(equipeMedica);
    }

    @Override
    public List<Leito> mapaLeitos(Ala ala) {
        return ala.getLeitos();
    }

    @Override
    public Leito modificaLeito(Leito leito, tipoDeLeito novoTipo, Ala novaAla) {
        leito.setTipo(novoTipo);
        leito.setAla(novaAla);
        return leitoRepository.salvaNoBD(leito);
    }

    @Override
    public Leito criarleito(int quantidade, tipoDeLeito tipo, Ala ala) {
        Leito novoLeito = new Leito();
        novoLeito.setAla(ala);
        novoLeito.setTipo(tipo);
        return leitoRepository.salvaNoBD(novoLeito);
    }
}
