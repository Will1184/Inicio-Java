package ciclowhile;

public class EjercicioContinue2 {
    public static void main(String[] args) {
        int c = 0;
        int num1=0,num2=0,num3=0;
        while (c < 100){
            c++;
           switch (c){
               case 25:
                   num1=c;
                   break;
               case 50:
                   num2=c;
                   break;
               case 75:
                   num3=c;
                   break;
               default:

           }

        }
        System.out.println("Numeros guardados: "+num1+", "+num2+", "+num3+", ");

    }
}
