package Questao02;

public class ConsultorioParticular extends Consultorio{
    protected Cirurgiao cirurgiao;

    @Override
    public void chamarProximo() {
        super.chamarProximo();
        super.chamarProximo();
    }
}
