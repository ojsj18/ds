package Hospital;

import java.util.List;

import Hospital.Domain.*;
import Hospital.Domain.Enum.tipoDeLeito;
import Hospital.Domain.Enum.tipoDeUrgencia;
/*
Casos de Uso:
• 3. Solicitar leito.
• 5. Vincular paciente a um leito.
• 6. Alterar estado do paciente.
• 8. Liberar hospital.Leito.
• 14. Criar alas
*/

public interface Menu {
    public Bool solicitaLeito(String identificacao_paciente, tipoDeUrgencia urgencia, tipoDeLeito tipo_leito); //3. Solicitar leito.

    public Bool pacienteParaLeito(String identificacao_paciente, Long identificacao_leito); //5. Vincular paciente a um leito.
    
    public Bool atualizaEstado(Long alaId, Long setorId, String andarId, Long unidadeId, Long idInternoPaciente, tipoDePaciente statusPaciente); //6. Alterar estado do paciente.

    public Bool liberaLeito(String identificacao_paciente, Long identificacao_leito); //8. Liberar hospital.Leito.
}