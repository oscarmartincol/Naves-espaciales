package spaceships;

import java.util.Scanner;

/**
 * Clase que representa un vehículo de transferencia automatizada.
 * @ author Oscar David Martinez Benavides
 */
public class AutomatedTransferVehicle extends Spaceship{
    private final Scanner input = new Scanner(System.in);
    private int option;
    /**
     * Representa la altura de ajuste para la E.E.I.
     */
    protected int height;
    /**
     * Representa la confirmación de que la nave esta acoplada a la E.E.I.
     */
    protected boolean dockedShip;
    public AutomatedTransferVehicle(String name, int height){
        this.name = name;
        this.height = height;
        this.type ="Vehículo de transferencia automatizada";
        this.dockedShip = false;
    }

    /**
     * Método para iniciar proceso de ajustar órbita.
     */
    @Override
    public void startUp() {
        System.out.println("La órbita ha sido ajustada a " + this.height + " kilometros.");
        System.out.println("Que acción desea realizar ahora: ");
        System.out.println("1.Desactivar nave espacial.");
        System.out.println("2.Aterrizar nave.");
        this.option = this.input.nextInt();
        if(option == 1){
            deactivate();
        }else {
            if (option == 2){
                undock();
                endUp();
            }else {
                System.out.println("La opción seleccionada no es válida.");
                deactivate();
            }
        }
    }

    /**
     * Método para finalizar
     */
    @Override
    public void endUp() {

        System.out.println("La nave ha aterrizado en la tierra.");
    }

    /**
     * Método para seleccionar la acción a realizar.
     */
    @Override
    public void selectAction() {

        if(!this.dockedShip){
            System.out.println("Seleccione la acción que desea realizar");
            System.out.println("1.Hacer limpieza de la Estación espacial internacional.");
            System.out.println("2.Ajustar orbitá de la Estación a 400 Kilometros.");
            System.out.println("3.Cancelar misión.");
            this.option = this.input.nextInt();
            if(option == 1){
                clean();
            }else if (option == 2){
                System.out.println("La nave se a acoplado a la Estación espacial internacional.");
                this.dockedShip = true;
                startUp();
            }else {
                System.out.println("La misión ha sido cancelada.");
            }

        }else{
            startUp();
        }
    }

    /**
     * Método para desacoplar la nave.
     */
    @Override
    public void undock() {
        System.out.println("La nave se ha desacoplado de la Estación espacial internacional");
    }

    /**
     * Método para destruir la nave.
     */
    @Override
    public void destroy() {
        System.out.println("La nave ha sido destruida.");

    }

    /**
     * Método para desactivar la nave.
     */
    @Override
    public void deactivate() {

        System.out.println("La nave ha sido desactivada. \n");
    }

    public void clean(){
        System.out.println("La limpieza de la Estación espacial internacional se ha completado.\n");

        System.out.println("Seleccione la siguiente acción: ");
        System.out.println("1.Desactivar nave.");
        System.out.println("2.Destruir nave");
        System.out.println("3.Aterrizar nave en la tierra.");
        this.option = this.input.nextInt();
        if(this.option == 1){
            deactivate();
        } else if (this.option == 2) {
            destroy();
        }else {
            if (option == 3){
                endUp();
            }else {
                System.out.println("La opción seleccionada no es válida.");
                System.out.println("Misión finalizada.");
                deactivate();
            }
        }
    }

    @Override
    public String toString() {
        return "Información de la misión: \n" + "Nombre de la nave: " + this.name +
                "\nTipo de nave: " + this.type + "\nMisión: Limpiar o ajustar órbita de la E.E.I."
                + "\nAltura de la órbita: " + this.height + " kilometros";
    }
}
