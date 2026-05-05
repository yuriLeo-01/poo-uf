package Polymorphism.Questao02;

public class SistemaSaude {
    Consultorio consultorio;
    ConsultorioParticular consultorioParticular;

    public void adicionarPaciente(Paciente p){
        if (p.particular){
            consultorioParticular.adicionarPaciente(p);
        } else {
            consultorio.adicionarPaciente(p);
        }
    }

    public void chamarPublico() {
        consultorio.chamarProximo();
    }

    public void chamarParticular() {
        consultorioParticular.chamarProximo();
    }
}
