package operadores;

public class ManejoOperadores {
    public static void main(String[] args) {
        System.out.println("Operadores Aritmeticos");
        int a=1+2;
        int b=a*4;
        int c=b/2;
        int d=c-a;
        int e=-d;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println("e = "+e);

        System.out.println("\nOperadores Modulo (Residuo)");
        System.out.println("x mod 10 = " +a % 2);

        System.out.println("\nOperador Compuesto");
        //a = a+4
        a+=2;
        b-=4;
        c*=a;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);

        System.out.println("Operador Incremento");
        //int a = a+1;
        //Puede reescribirse como a++
        System.out.println("a ="+a);

        //preincremento/decremento (se incrementa antes  de asignar el valor)
        c=++a;
        //Postincremento/decremento (se incrementa despues  de asignar el valor)
        d= b++;

        System.out.println("\nDecremento relacional");
        //a es menor que b
        boolean res=a<b;
        System.out.println("res = " +res);

        System.out.println("\nOperador Ternario");
        int min= (a<b)? a:b;
        System.out.println("min = "+min);


        System.out.println("\nOperador de Asignacion");
        int i,j,k;
        //Cadena de asignacion
        i= j = k =100; // Valor de x, y , y z igual 100
        System.out.println("i = "+i);
        System.out.println("j = "+j);
        System.out.println("k = "+k);

        //Envia la variable precio al metodo CalIva y luego imprime el resultado
        double precio = 12.50;
        double calIva = CalIva(precio);
        System.out.println(calIva);
        //Imprime el metodo vacio
        CalcIva();
        int date =2022;
        System.out.println();
    }
    static  int CalcEdad(int date){
        int edad= date-2003;
        return edad;
    }

    static double CalIva(double dato){

        double iva=dato*0.13;
        return iva;
    }
    static  void CalcIva(){
        double precio = 12.50;
        double iva;
        System.out.println(iva=precio*0.13);
    }
}
