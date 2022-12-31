package polimorfismo2;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Operacion> lista1=new ArrayList<>();
        lista1.add(new Suma(2,5));
        lista1.add(new Resta(7,5));
        lista1.add(new Suma(2,5));
        for(Operacion op : lista1){
            op.operar();
            op.Imprimir();
        }
    }
}
