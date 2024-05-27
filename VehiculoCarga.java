public class VehiculoCarga extends Vehiculo {
    private int capacidadCarga;

    // Constructor 
    public VehiculoCarga(String marca, String modelo, int año, int Kilometraje, int capacidadCarga) {
        super(marca, modelo, año, Kilometraje);
        this.capacidadCarga = capacidadCarga;
    }

    // Getter y Setter para capacidadCarga
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    // Sobrescribir el metido mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de Carga: " + capacidadCarga + "kg");
    }

    // Sobreescribir el metodo realizarMantenimiento()
    @Override
    public void realizarMantenimiento() {
     super.realizarMantenimiento();
    }


}
