package polimorfismoejemplo;

public class Circunferencia extends Figura{
     private double pi=3.1416;
    protected double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double CalcularArea(){
        resultado =pi* Math.pow(radio,2);
        return resultado;
    }

}
