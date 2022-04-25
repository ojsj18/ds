package Hospital.BancoDeDados;

import Hospital.Domain.EquipeMedica;

public interface EquipeMedicaRepository {
    EquipeMedica buscaEquipeMedica(Long IdEquipeMedica);

    EquipeMedica salvaNoBD(EquipeMedica equipeMedica);
}
