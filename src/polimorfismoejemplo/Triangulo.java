package polimorfismoejemplo;

public class Triangulo extends Figura{
    protected double altura, ancho;

    public Triangulo(double altura, double ancho) {
        this.altura = altura;
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double CalcularArea(){
        resultado =(ancho*altura)/2;
        return resultado;
    }
}
