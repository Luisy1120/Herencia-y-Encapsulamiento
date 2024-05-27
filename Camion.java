public class Camion extends VehiculoCarga {
    private int numEjes;

    // Constructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes) {
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;
    } 

    // Getter y Setter para numEjes
    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    // Sobrescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {  
        super.mostrarInfo();
        System.out.println("Numero de Ejes: " + numEjes);
    }

    // Sobreescribir el metodo realizarMantenimiento()
    @Override
    public void realizarMantenimiento() {
     super.realizarMantenimiento();
     System.out.println("camion: ");
     System.out.println("1. Cambiar luces ");
     System.out.println("2. Revisar neumaticos ");
     System.out.println("3. Verificar frenos ");
     System.out.println("4. Inspeccionar sistema de direccion ");
     System.out.println("5. Cambiar aceite");
    }
    
   

}
