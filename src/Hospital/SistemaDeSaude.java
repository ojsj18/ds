package Hospital;

import java.util.List;

import Hospital.Enum.tipoDeLeito;

/*
Casos de Uso:
• 3. Solicitar leito.
• 10. Criar leitos,
• 11. Modificar leitos,
• 17. Vincular equipe à unidade.
• 18. Criar nova equipe.
• 23. Consultar mapa de leitos.
*/

public interface SistemaDeSaude {

    public Paciente entraPaciente(Pessoa pessoa); //2. Dar entrada do paciente.

    public Leito criarleito(int quantidade, tipoDeLeito tipo, Ala ala); //10. Criar leitos.

    public Leito modificaLeito(Leito leito, tipoDeLeito novoTipo, Ala novaAla); //11. Modificar leitos.

    public EquipeMedica equipeParaUnidade(EquipeMedica equipeMedica, Ala ala);  //17. Vincular equipe à unidade.

    public EquipeMedica criaEquipe(String nome, Funcionario[] funcionario); //18. Criar nova equipe.

    public List<Leito> mapaLeitos(Ala ala); //23. Consultar mapa de leitos.

}
