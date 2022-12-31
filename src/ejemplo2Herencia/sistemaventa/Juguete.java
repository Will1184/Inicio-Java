package ejemplo2Herencia.sistemaventa;

public class Juguete {
    private int idJuquete;
    private String nombre;
    private boolean existe;
    private double precio;

    public Juguete(int idJuquete, String nombre, boolean existe, double precio) {
        this.idJuquete = idJuquete;
        this.nombre = nombre;
        this.existe = existe;
        this.precio = precio;
    }

    public int getIdJuquete() {
        return idJuquete;
    }

    public void setIdJuquete(int idJuquete) {
        this.idJuquete = idJuquete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "idJuquete=" + idJuquete +
                ", nombre='" + nombre + '\'' +
                ", existe=" + existe +
                ", precio=" + precio +
                '}';
    }
}
