package matriz.matrices;

import matriz.ejemplomatrices.Persona;

public class EjemploMatrices {
    public static void main(String[] args) {
        //1.Declaramos una matriz de eneteros
        int edades[][];
        //2. Instanciamos la matriz de enteros
        edades=new int[3][2];
        //3. Inicializamos los valores de la matriz de enteros
        edades[0][0]=30;
        edades[0][1]=15;
        edades[1][0]=20;
        edades[1][1]=45;
        edades[2][0]=5;
        edades[2][1]=38;

        //Imprimimos los valores de la salida estandar
        //4.Leemos todos los valores de cada elemento de la matriz

        System.out.println("Matriz de eneteros indice 0-0: "+edades[0][0]);
        System.out.println("Matriz de eneteros indice 0-1: "+edades[0][1]);
        System.out.println("Matriz de eneteros indice 1-0: "+edades[1][0]);
        System.out.println("Matriz de eneteros indice 1-1: "+edades[1][1]);
        System.out.println("Matriz de eneteros indice 2-0: "+edades[2][0]);
        System.out.println("Matriz de eneteros indice 2-1: "+edades[2][1]);

        //1.Declaramos e instanciamos una matriz de personas
        Persona personas[][]=new Persona[3][2];
        //2. Iniciliazamos los valores de la matriz de personas
        personas[0][0]=new Persona("Juan");
        personas[0][1]=new Persona("Armando");
        personas[1][0]=new Persona("Karla");
        personas[1][1]=new Persona("Laura");
        personas[2][0]=new Persona("Pedro");
        personas[2][1]=new Persona("Javier");

        //3. Leamos los valores de cada elemento de la matriz con un ciclo for anindado
        System.out.println(" ");
        for (int i=0; i< personas.length;i++){
            for (int j=0; j< personas[i].length;j++){
                if (personas[i]==personas[2] & personas[j]==personas[0]){
                    personas[2][0]=new Persona("Carlos");
                }
                System.out.println("Matriz personas indice : "+i+","+j+" : "+personas[i][j]);
            }
        }

        //1. Matriz de tipo string. Notacion simplificada
        String nombres[][]={{"Teresa","Cesar","William"},{"Yesenia", "Esteban","Maria"}};
        System.out.println("");
        System.out.println("Largo matriz reglones : "+ nombres.length);
        //Seleccionamos cualquier reglon valido nos regresa numero de columnas
        System.out.println("Largo matriz columnas : "+ nombres[0].length);

        //Imprimimos los valores a la salida estandar
        //2.Iteramos la matrizx de string en un for aninado
        System.out.println(" ");
        for (int i=0; i< nombres.length;i++){
            for (int j=0; j< nombres[i].length;j++){
                if (personas[i]==personas[1] & personas[j]==personas[0]){
                    nombres[1][0]=("Carolina");
                }
                System.out.println("Matriz String  indice : "+i+","+j+" : "+nombres[i][j]);
            }
        }
    }
}
