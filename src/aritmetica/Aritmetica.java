package aritmetica;

public class Aritmetica {

    //Atributos de la clase

    int a;
    int b;
    //Constructor Vacio
    //Recordar que si agregamos un constructor distinto al vacio
    //Ya que no se crea este constructor y nosostros debemos de crear si lo necesitamos
    Aritmetica(){}

    //Constructror con 2 argumentos
    Aritmetica(int a, int b){
        //Uso del operador this
        this.a=a;
        this.b=b;
    }
    //Este metodo toma los atributos de la clases hacer la suma
    int sumar(){
        return a+b;
    }
    //Este metodo toma los atributos de la clases hacer la restar
    int restar(){
        return a-b;
    }
    //Este metodo toma los atributos de la clases hacer la multiplicar
    int multiplicar(){
        return a*b;
    }
    //Este metodo toma los atributos de la clases hacer la division
    int dividir(){
        return a/b;
    }
}
