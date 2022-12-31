package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona p= new Persona("Juan");
    }
}

class Persona{
    String nombre; //atributo de la clase
    public Persona(String nombre) {
        this.nombre = nombre; // this es el objeto Persona(actual)
        //Imprimir el objeto persona
        Imprimir i= new Imprimir();
        i.imprimir(this); //This es el objeto persona(actual)
        i.imprimir(this.nombre); //este This solo imprime solo el atributo de la clase
    }

}
class Imprimir{
    public void imprimir(Object o){
        System.out.println("Imprimir Parametros: "+o);//el parametro es el objeto persona
        System.out.println("Imprimir el objeto actual(this): "+this);//this es el objeto a imprimir
        //(actual)
    }
}
