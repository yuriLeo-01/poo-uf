package Polymorphism.Questao02;

import java.util.LinkedList;

public class Consultorio {
    protected ClinicoGeral clinico;
    protected LinkedList<Paciente> listaComum = new LinkedList<>();
    protected LinkedList<Paciente> listaPreferencial = new LinkedList<>();

    public void adicionarPaciente(Paciente p){
        if (p instanceof PacientePreferencial){
            listaPreferencial.add(p);
        } else {
            listaComum.add(p);
        }
    }

    public void chamarProximo(){
        Paciente pacienteRemovido = null;
        if (!listaPreferencial.isEmpty()){
            pacienteRemovido = listaPreferencial.remove(0);
        } else if (!listaComum.isEmpty()){
            pacienteRemovido =listaComum.remove(0);
        }

        if (pacienteRemovido != null){
            System.out.println("Nome: " + pacienteRemovido.nome + " CPF: " + pacienteRemovido.cpf);
        } else {
            System.out.println("Fila vazia.");
        }
    }
}
