package ejemplo2Herencia.sistemaventa;

public class Departamento extends Juguete {
    private String nombre;
    private String tipo;

    public Departamento(int idJuquete, String nombre, boolean existe, double precio, String nombre1, String tipo) {
        super(idJuquete, nombre, existe, precio);
        this.nombre = nombre1;
        this.tipo = tipo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
