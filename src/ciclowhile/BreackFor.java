package ciclowhile;

public class BreackFor {
    public static void main(String[] args) {
        for (int i = 0; i<=10; i++){
            System.out.println(i);

            if (i == 5){
                System.out.println("Detener el ciclo for");
                //Rompe el ciclo for
                break;
            }
        }
    }
}
