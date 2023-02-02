package spaceships;

import java.util.Scanner;

/**
 * Clase que representa una nave de tipo lanzadera.
 * @ author Oscar David Martinez Benavides
 */
public class ShuttleShip extends Spaceship{
    /**
     * Representa el peso máximo de la carga que puede llevar al espacio.
     */
    protected int charginCapability;

    /**
     * Variable que representa si la nave se emcuentra en órbita.
     */
    protected boolean orbitingSpacecraft;

    private int option;
    private final Scanner input = new Scanner(System.in);

    /**
     * Constructor que crea una nueva instancia de una nave de tipo lanzadera.
     * @param name Nombre de la nave
     * @param charginCapability Peso máximo de la carga que puede transportar.
     */
    public ShuttleShip(String name, int charginCapability){
        this.type = "Lanzadera";
        this.name = name;
        this.charginCapability = charginCapability;
        this.weight = 3500;
        this.orbitingSpacecraft = false;
    }

    /**
     * Método para desacoplar carga de la nave.
     */
    @Override
    public void undock() {
        System.out.println("La carga ha sido liberada en el espacio.\n");
    }

    /**
     * Método para destruir la nave.
     */
    @Override
    public void destroy() {
        System.out.println("La nave ha sido destruida\n");
    }

    /**
     * Método para desactivar nave.
     */
    @Override
    public void deactivate() {
        System.out.println("La nave se ha desactivado.\n");

    }

    /**
     * Método para arrancar nave.
     */
    @Override
    public void startUp() {
        System.out.println("La nave ha llegado con la carga a la órbita baja terrestre.");
        System.out.println("Seleccione la acción a ejecutar.");
        System.out.println("1.Desacoplar carga y aterrizar nave.");
        System.out.println("2.Destruir nave con su carga.");
        System.out.println("3.Desactivar nave.");
        this.option = input.nextInt();
        switch (option){
            case 1:
                undock();
                endUp();
            case 2:
                destroy();
            case 3:
                deactivate();
            default:
                System.out.println("La opción seleccionada no es válida la nave regresara a la tierra.\n");
                endUp();
        }

    }

    /**
     * Método para detener nave.
     */
    @Override
    public void endUp() {
        System.out.println("La nave ha aterrizado.\n");
    }

    /**
     * Método para seleccionar la acción a realizar.
     */
    @Override
    public void selectAction() {
        if (!this.orbitingSpacecraft){
            System.out.println("Seleccione la acción que quiere realizar para la misión:");
            System.out.println("1.Lanzar carga al espacio.");
            System.out.println("2.Cancelar misión.");
            this.option = input.nextInt();
            if (this.option == 1){
                this.orbitingSpacecraft = true;
                startUp();
            } else if (this.option == 2) {
                System.out.println("La misión ha sido cancelada.\n");
            }else{
                System.out.println("Opción no válida");
                System.out.println("La misión ha sido cancelada.\n");
            }
        }else {
            startUp();
        }

    }

    @Override
    public String toString() {
        return "Información de la misión:\n" + "Nombre de la nave: " + this.name +
                "\nTipo: " + this.type + "\nCapacidad de carga: " + this.charginCapability +
                "\nPeso: " + this.weight + "Toneladas." + "\nMisión: Lanzar carga al espacio.\n";
    }
}
