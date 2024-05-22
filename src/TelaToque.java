public class TelaToque {

    private boolean tocada;
    private double toquelocalizacao;

    public boolean getTocada(){
        return this.tocada;
    }
    public double getToqueLocalizacao(){
        return this.toquelocalizacao;
    }
    public void setToqueLocalizacao(double valor){
        this.toquelocalizacao = valor;
    }
    public void setTocada(boolean valor){
        this.tocada = valor;
    }
}
