import Hospital.BancoDeDados.CHCUFPR;
import Hospital.BancoDeDados.EquipeMedicaRepository;
import Hospital.BancoDeDados.LeitoRepository;
import Hospital.BancoDeDados.PacienteRepository;
import Hospital.BancoDeDados.UnidadeRepository;
import Hospital.BancoDeDados.AlaRepository;
import Hospital.Domain.*;
import Hospital.*;
import Hospital.Domain.Enum.*;

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
    private AlaRepository alaRepository;


    @Override
    public Paciente solicitaLeito(String identificacao_paciente, tipoDeUrgencia urgencia, tipoDeLeito tipo_leito) {
        Paciente paciente = chcufpr.buscarPaciente(identificacao_paciente);
        paciente.getProntuarioEletronico().setUrgencia(urgencia);
        
        Leito leito_vago = leitoRepository.requereLeitoVago(tipo_leito);
        leito_vago.setDisponibilidade(false);
        
        paciente.setLeito(leito_vago);

        return pacienteRepository.salvaPedidoLeito(paciente,leito_vago);
    }

    @Override
    public Paciente pacienteParaLeito(String identificacao_paciente, Long identificacao_leito){
        Leito leito = leitoRepository.buscaLeito(identificacao_leito);
        Paciente paciente = chcufpr.buscarPaciente(identificacao_paciente);

        leito.setPaciente(paciente);
        return pacienteRepository.salvaNoBD(paciente);
    }

    @Override
    public Paciente atualizaEstado(Long alaId, String setorId, String andarId, Long unidadeId, String idInternoPaciente, tipoDePaciente statusPaciente){
        Unidade unidade = unidadeRepository.buscaUnidade(unidadeId);
        List<Leito> leitos = mapaLeitosOcupados(alaId,setorId,uni);

        for(Leito leito : leitos){ 
            // busca setor correto
            Paciente paciente = leito.getPaciente();
            if(paciente.getIdInterno() == idInternoPaciente) { 
                paciente.setTipoDePaciente(statusPaciente);
                return pacienteRepository.salvaNoBD(paciente);
            }
        }
        return null;
    }

    @Override
    public Leito liberaLeito(String identificacao_paciente, Long identificacao_leito){
        Paciente paciente = chcufpr.buscarPaciente(identificacao_paciente);
        Leito leito = paciente.getLeito();
        leito.setPaciente(null);
        paciente.setLeito(null);

        pacienteRepository.salvaNoBD(paciente);
        return leitoRepository.salvaNoBD(leito);
    }

    @Override
    public Ala criarAla(String nomeAla, Setor setor){
        Ala ala = new Ala();
        ala.setNome(nomeAla);
        setor.criarAla(ala);

        return alaRepository.salvaNoBD(ala);
    }
    public  List<Leito> mapaLeitosOcupados(Long alaId, String setorId, Long unidadeId) {
        List<Leito> leitos_encontrados = new ArrayList<>();
        Unidade unidade = unidadeRepository.buscaUnidade(unidadeId);
        for(Setor setor : unidade.getSetores() ) {
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
