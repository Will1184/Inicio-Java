package ciclowhile;

public class BreakWhile {
    public static void main(String[] args) {
        int c = 0;
        while (c <= 10){
            System.out.println(c);
            c++;
            if (c == 5){
                System.out.println("Detener el ciclo while");
                //Rompe el ciclo while
                break;
            }
        }
    }
}
