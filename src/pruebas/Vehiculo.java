package pruebas;

public class Vehiculo {
    private String modelo;
    private String tipo;
    private int año;

    public Vehiculo(String modelo, String tipo, int año) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Vehiculo " +
                "modelo: " + modelo +
                ", tipo: " + tipo  +
                ", año: " + año
                ;
    }
}
