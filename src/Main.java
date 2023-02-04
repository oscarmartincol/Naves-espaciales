import spaceships.*;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Scanner inputString = new Scanner(System.in);
    public static void main(String[] args) {

        int option;
        Spaceship spaceship;
        do {
            System.out.println("Sistema listo para una nueva misión");
            System.out.println("Seleccione la misión que desea realizar con el tipo de nave correspondiente:");
            System.out.println("1.Lanzar carga útil al espacio (nave de tipo lanzadera).");
            System.out.println("2.Limpiar y regular elevación de la estación espacial internacional (ATV).");
            System.out.println("3.Estudiar la superficie de Marte (nave no tripulada).");
            System.out.println("4.Mantenimiento de satélite (nave tripulada).");
            System.out.println("5.Salir del sistema.");
            option = input.nextInt();
            if(option > 0 && option < 5){
                spaceship = createShip(option);
                spaceship.selectAction();
                System.out.println(spaceship);
            }else{
                if(option == 5)
                    System.out.println("Ha salido del sistema.");
                else
                    System.out.println("La opción seleccionada no es válida.");
            }
            if (option != 5){
                System.out.println("Oprima enter para continuar.");
                inputString.nextLine();
            }

        }while (option != 5);
    }

    /**
     * Método que crea un tipo de nave según la misión que el usuario escoja.
     * @param option Misión seleccionada
     * @return Nave espacial que realiza la misión.
     */
    public static Spaceship createShip(int option) {
        String name;
        int charginCapability;
        System.out.println("Ingrese el nombre de la nave.");
        name = inputString.nextLine();
        Spaceship spaceship = null;
        switch (option) {
            case 1:
                System.out.println("Ingrese la capacidad de carga.");
                charginCapability = input.nextInt();
                spaceship = new ShuttleShip(name, charginCapability);
                break;
            case 2:
                spaceship = new AutomatedTransferVehicle(name,400);
                break;
            case 3:
                spaceship = new UncrewedSpaceship(name, marsData());
                break;
            case 4:
                int crewNumber;
                System.out.println("Ingrese el número de personas que componen la tripulación.");
                crewNumber = input.nextInt();
                spaceship = new CrewedSpaceship(name, crewNumber);
        }
        return spaceship;
    }

    /**
     * Método con los datos de la superficie de marte.
     * @return Datos de Marte.
     */
    public static String marsData(){
        String information;
        information = "Se encuentra evidencia de Carbono liviano sobre rocas, que indica presencia de vida bacteriana en el " +
                "pasado. \nSe detecta la generación de metano de un origen desconocido.";
        return information;
    }
}