package ciclowhile;

public class EjercicioContinue {
    public static void main(String[] args) {
        int c = 0;
        int num1=0,num2=0,num3=0;
        while (c < 100){
            c++;
            if (c == 25){
                num1=c;
                continue;

            }else if (c == 50){
                num2=c;

                continue;
            }else if (c == 75){
                num3=c;
               continue;
            }
            System.out.println("Numeros: "+c);

        }
        System.out.println("Numeros guardados: "+num1+", "+num2+", "+num3+", ");

    }
}
