import Hospital.BancoDeDados.CHCUFPR;
import Hospital.BancoDeDados.EquipeMedicaRepository;
import Hospital.BancoDeDados.LeitoRepository;
import Hospital.BancoDeDados.PacienteRepository;
import Hospital.Domain.*;
import Hospital.Domain.Enum.tipoDeLeito;
import Hospital.*;

import java.util.ArrayList;
import java.util.List;

//Foi utilizado neste projeto Padroes Gof
//O pacote Hospital contem as classes que se relaconam entre si
//O controle delas é gerenciado pela interface disponibilizada e implementada nesta classe principal
//O acesso ao Banco de dados tambem fica restrito apenas a este arquivo
//Isso permite que as classes nao precisem conhecer quem as gerencia no banco de dados
//permite tambem a modularidade do programa pois utilizamos interfaces que podem ser alteradas

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
