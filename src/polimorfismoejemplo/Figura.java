package polimorfismoejemplo;

public abstract class Figura {
    protected double resultado;


    public void Imprimir(){
        System.out.println(resultado);
    }

    public abstract double CalcularArea();
}
