package polimorfismoejemplo;

import polimorfismo2.Operacion;
import polimorfismo2.Resta;
import polimorfismo2.Suma;

import java.util.ArrayList;

public class MainPrueba {
    public static void main(String[] args) {
        ArrayList<Figura> lista1=new ArrayList<>();
        lista1.add(new Rectangulo(8,9));
        lista1.add(new Triangulo(10,5));
        lista1.add(new Circunferencia(5));
        for(Figura op : lista1){
            op.CalcularArea();
            op.Imprimir();
        }
    }
}
