import Hospital.BancoDeDados.CHCUFPR;
import Hospital.BancoDeDados.EquipeMedicaRepository;
import Hospital.BancoDeDados.LeitoRepository;
import Hospital.BancoDeDados.PacienteRepository;
import Hospital.BancoDeDados.UnidadeRepository;
import Hospital.Domain.*;
import Hospital.*;

import java.util.ArrayList;
import java.util.List;

//Foi utilizado neste projeto Padroes Gof
//O pacote Hospital contem as classes que se relaconam entre si
//O controle delas é gerenciado pela interface disponibilizada e implementada nesta classe principal
//O acesso ao Banco de dados tambem fica restrito apenas a este arquivo
//Isso permite que as classes nao precisem conhecer quem as gerencia no banco de dados
//permite tambem a modularidade do programa pois utilizamos interfaces que podem ser alteradas

public class InterfaceHospital implements Menu {
    private CHCUFPR chcufpr;
    private PacienteRepository pacienteRepository;
    private LeitoRepository leitoRepository;
    private EquipeMedicaRepository equipeMedicaRepository;
    private UnidadeRepository unidadeRepository;

    @Override
    public Bool solicitaLeito(String identificacao_paciente, tipoDeUrgencia urgencia, tipoDeLeito tipo_leito) {
        Paciente paciente = chcufpr.buscarPaciente(identificacao_paciente);
        paciente.getProntuarioEletronico().setUrgencia(urgencia);
        
        Leito leito_vago = leitoRepository.requereLeitoVago(tipo_leito);
        leito_vago.setDisponibilidade(false);
        
        paciente.setLeito(leito_vago);

        return pacienteRepository.salvaPedidoLeito(Paciente paciente, Leito leito);
    }

    @Override
    public Bool pacienteParaLeito(String identificacao_paciente, Long identificacao_leito){
        Leito leito = leitoRepository.buscaLeito(identificacao_leito);
        Paciente paciente = chcufpr.buscarPaciente(identificacao_paciente);

        leito.setPaciente(leito);
    }

    @Override
    public Bool atualizaEstado(Long alaId, Long setorId, String andarId, Long unidadeId, Long idInternoPaciente, tipoDePaciente statusPaciente){
        Unidade unidade = unidadeRepository.buscaUnidade(unidadeId);
        List<Leito> leitos = unidade.mapaLeitosOcupados();

        for(Leito leito : leitos) { 
            // busca setor correto
            Paciente paciente = leito.getPaciente();
            if(paciente.getIdInterno() == idInternoPaciente) { 
                paciente.setTipoDePaciente(statusPaciente);
            }
        }
    }

    @Override
    public Bool liberaLeito(String identificacao_paciente, Long identificacao_leito){
        Paciente paciente = chcufpr.buscarPaciente(identificacao_paciente);
        Leito leito = paciente.getLeito();
        leito.setPaciente(null);
        paciente.setLeito(null);
    }

    @Override
    public Bool criarAla(String identificacao_paciente, Long identificacao_leito){
        Paciente paciente = chcufpr.buscarPaciente(identificacao_paciente);
        Leito leito = paciente.getLeito();
        leito.setPaciente(null);
        paciente.setLeito(null);
    }

}
