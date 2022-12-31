package palabranull;

public class PalabraNull {
    public static void main(String[] args) {
        Persona p1=new Persona();
        //Marcar Error
        //No se puede acceder directamente un atributo privado desde otra clase
        //System.out.println(p1.nombre="Pedro");
        //Si es posible accederlo
        System.out.println(p1.obtenerNombre());
    }
}
class Persona{
    private String nombre;//Use de private

    public Persona() {

    }
    public String obtenerNombre(){
        return this.nombre;//Uso Opcional de this
    }
}

