package Hospital.BancoDedados;

import Hospital.Domain.Paciente;

//Simula oq seria o sistema externo da UFPR
public interface CHCUFPR {

    public Paciente buscarPaciente(String CPF);
}
