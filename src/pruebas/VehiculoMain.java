package pruebas;

public class VehiculoMain {
    public static void main(String[] args) {
        Vehiculo vehiculos[];
        vehiculos=new Vehiculo[4];
        vehiculos[0]=new Vehiculo("Corolla", "Sedan",2020);
        vehiculos[1]=new Vehiculo("Yaris", "Sedan",2003);
        vehiculos[2]=new Vehiculo("Hilux", "Pick-up",2015);
        vehiculos[3]=new Vehiculo("Prius", "Sedan",2022);
        for (int i=0;i< vehiculos.length;i++){
            System.out.println(i+") "+vehiculos[i].toString());
        }
    }
}
