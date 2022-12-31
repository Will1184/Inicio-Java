package pasoporreferencia;

import java.text.StringCharacterIterator;

public class Persona {
    String nombre;

    public void cambiaNombre(String nuevoNombre){

        this.nombre=nuevoNombre;
    }
    public String obtenerNombre(){

        return nombre;
    }
   
}
