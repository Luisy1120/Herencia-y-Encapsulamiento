public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Crear instancias de cada tipo de vehiculo
        Auto auto = new Auto("Toyota","Corolla", 2020, 15000, 5, "Gasolina");
        
        Camion camion = new Camion("Volvo", "FH", 2019, 750000, 20000, 4);
    
        // Mostrar la informacion de cada vehiculo
        System.out.println("Informacion del Auto");
        auto.mostrarInfo();
        auto.realizarMantenimiento();
        auto.calcularCostoMantenimiento(0.10, 15000);

        System.out.println("\nInformacion del camion:");
        camion.mostrarInfo();
        camion.realizarMantenimiento();
        
        
    }
}
