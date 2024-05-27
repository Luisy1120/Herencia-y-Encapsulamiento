public class Auto extends VehiculoPasajeros {
    private String tipoCombustible;

    // Constructor
    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible) {
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }
    
    // Getter y Setter para tipoCombustible
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    // Metodo calcularCostoMantenimiento
    public double calcularCostoMantenimiento(double costoporkilometro, int kilometrorecorridos) {
        double costoTotal = 0;
        costoTotal = costoporkilometro * kilometrorecorridos;
        System.out.println("Costo de Mantenimiento: $ " + costoTotal);
        return costoTotal;
    }

    // Sobrescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de Combustible: " + tipoCombustible);
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
