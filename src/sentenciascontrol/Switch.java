package sentenciascontrol;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        int mes; //Mes del año
        String mesSting;

        Scanner leer= new Scanner(System.in);
        Scanner leerSting= new Scanner(System.in);
        String estacion;
        String saludo="Hola mundo";
        System.out.println("Ingrese el mes del año en numero");
        mes= leer.nextInt();
        System.out.println("Ingrese el mes del año en palabras");
        mesSting= leerSting.nextLine();
        switch (mes){
            case 1: case 2: case 12:
            if (mes==1){
                estacion= "Invierno";

                            }
                estacion= "Invierno";
                break;

            case 3: case 4: case 5:
                estacion= "Primavera";
                break;

            case 6: case 7: case 8:
                estacion= "Verano";
                break;

            case 9: case 10: case 11:
                estacion= "Otoño";
                break;
            default:
                estacion="Mes incorrecto";
        }
        switch (mesSting){
            case "Enero": case "Febrero": case "Diciembre":

                estacion= "Invierno";
                break;

            default:
                estacion="Mes incorrecto";
        }
        System.out.println("La estacion para el mes " +mes+ " es: "+estacion);
        System.out.println("La estacion para el mes " +mesSting+ " es: "+estacion);
        System.out.println(saludo);
    }
}
