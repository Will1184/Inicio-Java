package pruebas;
import java.util.Scanner;
import arreglo.Persona;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animales[];

        animales=new Animal[5];
        animales[0]=new Animal("Sofia", 'H',"Leon");
        animales[1]=new Animal("Kylo", 'V',"Pantera");
        animales[2]=new Animal("Erick", 'V',"Pato");
        animales[3]=new Animal("Susan", 'H',"Perro");
        animales[4]=new Animal("Sara", 'H',"Gato");


        for (int i=0;i< animales.length;i++){

            System.out.println(i+") "+animales[i].toString());
        }
    }
}
