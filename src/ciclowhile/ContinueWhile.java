package ciclowhile;

public class ContinueWhile {
    public static void main(String[] args) {
        int c = 0;
        while (c <= 10){
            c++;
            System.out.println("Ejecución "+ c);

            if (c == 5){
                System.out.println("Saltar a la siguiente ejecución");
                //Saltar a la siguiente
                continue;
            }

            System.out.println("No me ejecutare en 5");
        }
    }
}
