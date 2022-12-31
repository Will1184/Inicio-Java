package polimorfismo2;

public abstract class Operacion {
    protected int valor1, valor2,resultado;

    public Operacion(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void Imprimir(){
        System.out.println(resultado);
    }
    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }


    public abstract void operar();

}
