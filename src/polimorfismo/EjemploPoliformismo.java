package polimorfismo;

public class EjemploPoliformismo {
    public static void main(String[] args) {
        Empleado emp= new Empleado("Juan",1500);
        System.out.println(emp.obtenerDetalles());
        emp=new Gerente("Raul",1500, "Desarrollador");
        System.out.println(emp.obtenerDetalles());
        emp=new Gerente("Sveet",2500, "Desarrolladora");
        Imprimir(emp);
    }
    public static void Imprimir(Empleado emp){
        System.out.println(emp.obtenerDetalles());
    }
}
