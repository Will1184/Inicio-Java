package ejemplo2Herencia.venta;

import ejemplo2Herencia.sistemaventa.Departamento;
import ejemplo2Herencia.sistemaventa.Distribuidor;
import ejemplo2Herencia.sistemaventa.Juguete;

public class venta {
    public static void main(String[] args) {
        Juguete j1=new Juguete(1,"Silla",true,2.50);
        Departamento d1=new Departamento(1,"silla",true,2.50,"Infantiles","hogar");
        Distribuidor di1=new Distribuidor(1,"silla",true,2.50,"la naviera","china");
        Juguete j2=new Juguete(2,"Mesa",true,4.50);
        double total=0.0;

        System.out.println("Distribuidora    :"+ di1.getNombre());
        System.out.println("Pais de Origen   :"+di1.getPais());
        System.out.println("------------------------------------");
        System.out.println("Departamento      :"+d1.getNombre());
        System.out.println("Tipo de Juguete   :"+d1.getTipo());
        System.out.println("-------------------------------------");
        System.out.println("          Detalle de Venta");
        System.out.println("-------------------------------------");
        System.out.println("Articulo    : "+j1.getNombre());
        System.out.println("Precio      : $"+j1.getPrecio());
        total=total+j1.getPrecio();
        System.out.println("-------------------------------------");
        System.out.println("Articulo    : "+j2.getNombre());
        System.out.println("Precio      : $"+j2.getPrecio());
        total=total+j2.getPrecio();
        System.out.println("======================================");
        System.out.println("Venta Total  : $"+total);

    }
}
