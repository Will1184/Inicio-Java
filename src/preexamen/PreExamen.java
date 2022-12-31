package preexamen;

public class PreExamen {
    public static void main(String[] args) {
        int [] numeros= {21,9,5,134,6};
        int contador=numeros[0];
        for(int i = 0; i <numeros.length; i++){
           if (numeros[i]>=contador){
               contador=numeros[i];
           }
        }
        System.out.println("El numero mayor es: "+contador);
    }
}
