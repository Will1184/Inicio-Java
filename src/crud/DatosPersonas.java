package crud;

//-----------PROYECTO CREADO POR BRANDON GOMEZ--------//
//-----------brandonwilliammg@gmail.com---------------//
import java.util.ArrayList;
import java.util.Scanner;
public class DatosPersonas {
    public static void main(String[] args) {


        //Se crea un arraylist para guardar toda la informacion
        ArrayList<Persona> personas= new ArrayList<>();
        //Se crea una variable que almacenara los nombres en los metodos
        String nombre="";
        int edad=0;
        //Se crea una variable de tipo int para que almacene el número que corresponde a la funcion del switch
        int caso;
        //Se crea una variable de tipo string que almacenara si o no ; al escoger si el programa hace un bucle y al escoger no el programa termina
        String resp;

        Scanner leer = new Scanner(System.in);
        Scanner leerC = new Scanner(System.in);

        do {
            //El usuario debe digitar valores numericos para acceder a las diferentes funciones del sistema
            System.out.println("\nDigite el numero correspondiente a su peticion");
            System.out.println("1) Crear datos | 2) Leer Cantidad de datos digitados | 3) Leer un dato | 4) Actualizar un dato | 5) Eliminar un dato | 6) Leer Todos los datos | 7) Salir");
            caso= leerC.nextInt();

            switch (caso){
                //Metodo que crea un dato
                case 1 -> Persona.creaDato(personas, leerC, leer, nombre,edad);

                //Metodo que lee el tamaño de la lista
                case 2 -> Persona.leeSize(personas);

                //Metodo que lee un dato
                case 3 -> Persona.leeDato(personas, leerC);

                //Metodo que actualiza un dato
                case 4 -> Persona.actualizaDato(personas, leerC, leer);

                //Metodo que elimina un dato
                case 5 -> Persona.eliminaDato(personas, leerC, leer);

                //Metodo que lee todos los datos
                case 6 -> Persona.leeDatos(personas);

                //Metodo sale del programa
                case 7 -> Persona.salir(leer);

                //Si el usuario hace algo mal le sale el texto
                default -> System.out.println("Proceso invalido");
            }
            //Codigo que pregunta al usuario si quiere continuar en el sistema o quiere salir
            System.out.println("\n¿QUIERE CONTINUAR? Escriba Si o No");
            resp = leer.next().toUpperCase();
        }
        //Codigo que hace compara el dato almacenado en la variable resp; al escoger si el programa hace un bucle y si escoge no entonces el programa se cierra
        while (resp.equals("SI"));
    }


}
  /*  ArrayList<Persona> personas= new ArrayList<>();
    String n="";
    int datos,caso;
    String resp;
    Scanner leer = new Scanner(System.in);
    Scanner leerC = new Scanner(System.in);

        do {
                System.out.println("\nDigite el numero correspondiente a su peticion");
                System.out.println("1) Crear datos || 2) Leer Cantidad de datos digitados || 3) Leer un dato || 4) Actualizar un dato || 5) Eliminar un dato || 6) Leer Todos los datos");
                caso= leerC.nextInt();
                switch (caso){
                case 1:
                System.out.println("Cantidad de datos a ingresar");
                datos= leerC.nextInt();

                for (int i =0; i<datos;i++){
        System.out.println("Ingrese el nombre");
        n= leer.next();
        Persona nombre= new Persona(n,i);
        personas.add(nombre);
        }
        break;

        case 2:
        System.out.println("\nLa cantidad de datos es: "+personas.size());
        break;

        case 3:
        int numDato;
        System.out.println("\nDato que quiere imprimir");
        numDato= leerC.nextInt();
        System.out.println(personas.get(numDato));
        break;

        case 4:
        System.out.println();
        int modDato;
        String modNomDato;

        System.out.println("\nDato que quiere modifcar");
        modDato= leerC.nextInt();
        System.out.println("Ingrese nombre");
        modNomDato= leer.next();
        Persona nombre= new Persona(modNomDato,modDato);
        personas.set(modDato,nombre);
        break;

        case 5:
        int elimDato;
        String seguridad;

        System.out.println("\nDato que quiere eliminar");
        elimDato= leerC.nextInt();

        System.out.println("¿Esta seguro de querer eliminar el dato? Escriba Si o no");
        seguridad=leer.nextLine().toUpperCase();
        if (seguridad.equals("SI"))
        {
        personas.remove(elimDato);
        } else {
        System.out.println("Dato no eliminado");
        }
        break;

        case 6:
        leeDatos(personas);
        break;
        }
        System.out.println("\n¿QUIERE CONTINUAR? Escriba Si o No");
        resp = leer.next().toUpperCase();
        }
        while (resp.equals("SI"));
        }*/