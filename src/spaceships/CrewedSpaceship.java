package spaceships;

import java.util.Scanner;

/**
 * Representa una nave espacial tripulada.
 * @ author Oscar David Martinez Benavides
 */
public class CrewedSpaceship extends Spaceship{

    /**
     * Representa el número de personas que componen la tripulación.
     */
    protected int crewNumber;

    /**
     * Constructor para crear instancias de naves tripuladas.
     * @param name Nombre de la nave
     * @param crewNumber Número de personas que componen la tripulación.
     */
    public CrewedSpaceship(String name, int crewNumber){
        this.name = name;
        this.crewNumber = crewNumber;
        this.type = "Tripulada";
        this.weight = 1500;
    }

    /**
     * Método para iniciar despegue
     */
    @Override
    public void startUp() {
        System.out.println("La nave ha despegado");
    }

    /**
     * Método para aterrizar nave
     */
    @Override
    public void endUp() {
        System.out.println("La nave ha aterrizado en la tierra");
    }

    /**
     * Método para seleccionar la operación a realizar.
     */
    @Override
    public void selectAction() {
        int option;
        Scanner input = new Scanner(System.in);
        System.out.println("Seleccione la acción que desea realizar:");
        System.out.println("1.Iniciar mantenimiento de satélite");
        System.out.println("2.Cancelar misión");
        System.out.println("3.Destruir vehículo");
        System.out.println("4.Desactivar nave");
        option = input.nextInt();
        if(option == 1){
            startMaintenance();
        } else if (option == 2) {
            System.out.println("Misión cancelada");
            endUp();
        }else if (option == 3){
            destroy();
        }else {
            deactivate();
        }
    }

    public void startMaintenance(){
        System.out.println("Se ha acoplado el satélite");
        System.out.println("Mantenimiento del satélite terminado.");
        undock();
        endUp();
    }

    /**
     * Método para desacoplar satélite.
     */
    @Override
    public void undock() {
        System.out.println("Se ha soltado el satélite");
    }

    @Override
    public void destroy() {
        System.out.println("Se ha destruido la nave.");
    }

    @Override
    public void deactivate() {
        System.out.println("Se ha desactivado la nave.");
    }

    @Override
    public String toString() {
        return "Datos de la misión:\n" + "Nombre de la nave: " + this.name +
                "\nTipo: " + this.type + "\nPeso: " + this.weight + "\nNúmero de tripulantes: "
                + this.crewNumber;
    }
}
