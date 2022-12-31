package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        //Declaro las variables
        int a,b;
        //inicializo
        Scanner leer= new Scanner(System.in);
        //Escribo el primer numero y se asigne la variable a
        System.out.println("Ingrese el primer numero");
        a=leer.nextInt();
        //Escribo el segundo numero y se asigne la variable b
        System.out.println("Ingrese el segundo numero");
        b=leer.nextInt();
        //Llamo al metodo "Suma" y lo guardo en la variable suma
        int suma=Suma(a,b);
        //Imprimo el total de la suma
        System.out.println("El total es: "+suma);
    }
    //Metodo que hace lasuma entre los dos numeros
    static int Suma(int a, int b){
        int total= a+b;
        return  total;
    }
}
