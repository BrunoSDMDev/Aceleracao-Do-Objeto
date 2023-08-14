public class Objeto {

    private double forca;
    private double massa;
    private double aceleracao;

    public Objeto (double forca, double massa){
        this.forca = forca;
        this.massa = massa;
        this.aceleracao = this.forca / this.massa;
    }
    public double getAceleracaoObjeto() {
        return this.aceleracao;
    }
}
