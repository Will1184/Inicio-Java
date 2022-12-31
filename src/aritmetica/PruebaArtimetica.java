package aritmetica;

public class PruebaArtimetica {
    public static void main(String[] args) {
        //Variables locales
        int operandoA=6;
        int operandoB=2;

        //Creamos un objeto de la clase Aritmetica
        Aritmetica obj1=new Aritmetica(operandoA,operandoB);

        //Imprimir operandos
        System.out.println("operando a: "+operandoA+" y operando: "+ operandoB);
        //Resultado de la suma
        System.out.println("\nResultado suma: "+obj1.sumar());

        //Resultado de la resta
        System.out.println("\nResultado restar: "+obj1.restar());

        //Resultado de la multiplicar
        System.out.println("\nResultado multiplicacion: "+obj1.multiplicar());

        //Resultado de la dividir
        System.out.println("\nResultado division: "+obj1.dividir());
        System.out.println(otroMetodo(operandoA));
    }
    static int otroMetodo(int operandoA){
        //No se puede acceder a una variable local declarado en otro metodo
        return operandoA;
    }
}
