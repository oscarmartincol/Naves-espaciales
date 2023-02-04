package spaceships;

import java.util.Scanner;

/**
 * Clase que representas un vehículo no tripulado.
 * @ author Oscar David Martinez Benavides
 */
public class UncrewedSpaceship extends Spaceship{

    /**
     * Representa los datos obtenidos del planeta.
     */
    protected String planetData;
    private final Scanner input = new Scanner(System.in);

    /**
     * Constructor para crear intancias de vehiculos no tripulados.
     * @param name Nombre del vehículo
     * @param data Datos del planeta
     */
    public UncrewedSpaceship(String name, String data){
        this.name = name;
        this.planetData = data;
        this.type = "No tripulado";
        this.speed = 140;
    }

    /**
     * Método para iniciar estudio del planeta.
     */
    @Override
    public void startUp() {
        undock();
        endUp();
        System.out.println("Se están analizando muestras de suelo marciano.");
        System.out.println("Los datos de las muestras se han enviado.\n");
        System.out.println("Datos de la superficie del planeta:");
        System.out.println(this.planetData + "\n");
    }

    /**
     * Método para aterrizar vehículo en el planeta
     */
    @Override
    public void endUp() {
        System.out.println("La nave ha aterrizado en Marte.");
    }

    /**
     * Método para seleccionar acciones a realizar.
     */
    @Override
    public void selectAction() {
        System.out.println("Seleccione la acción que desea realizar: ");
        System.out.println("1.Iniciar la exploración de la superficie.");
        System.out.println("2.Desactivar vehículo.");
        System.out.println("3.Cancelar misión.");
        int option = this.input.nextInt();
        if (option == 1){
            startUp();
        } else if (option == 2) {
            deactivate();
        }else {
            if (option == 3){
                System.out.println("La misión ha sido cancelada.");
            }else {
                System.out.println("La opcíon seleccionada no es válida.");
                System.out.println("Misión cancelada.");
            }
        }
    }

    /**
     * Método para desacoplar vehículo.
     */
    @Override
    public void undock() {
        System.out.println("Se ha soltado el vehículo");
    }

    /**
     * Método para destruir vehículo.
     */
    @Override
    public void destroy() {
        System.out.println("El vehículo ha sido destruido.");
    }

    /**
     * Método para desactivar vehículo.
     */
    @Override
    public void deactivate() {

        System.out.println("El vehículo se ha desactivado.");
    }

    @Override
    public String toString() {
        return "Información de la misión:\n" + "Nombre del vehiculo: " + this.name +
                "\nTipo de vehículo: " + this.type + "\nVelocidad: " + this.speed +
                "\nMisión:Estudiar la superficie de Marte.";
    }
}
