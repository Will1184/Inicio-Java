package ejemplo2Herencia.sistemaventa;

public class Distribuidor extends Juguete{
    private String nombre;
    private String pais;

    public Distribuidor(int idJuquete, String nombre, boolean existe, double precio, String nombre1, String pais) {
        super(idJuquete, nombre, existe, precio);
        this.nombre = nombre1;
        this.pais = pais;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Distribuidor{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
