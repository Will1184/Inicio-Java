package pruebas;

public class Animal {
    private String nombre;
    private char genero;
    private  String especie;

    public Animal(String nombre, char genero, String especie) {
        this.nombre = nombre;
        this.genero = genero;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", especie='" + especie + '\'' +
                '}';
    }
}
