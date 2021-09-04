public class Ponto {

    private Integer x;
    private Integer y;

    public Ponto() {
    }

    public Ponto(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    //Método para calcular a distância entre os pontos A e B;
    public double calculaDistanciaEntrePontos(Ponto ponto) {
        return Math.sqrt((Math.pow(this.x - ponto.x, 2)) + (Math.pow(this.y - ponto.y, 2)));
    }

    //Verifica se os pontos são iguais;
    public boolean comparaPontos(Ponto ponto) {
        return (this.x == ponto.x && this.y == ponto.y);
    }

}