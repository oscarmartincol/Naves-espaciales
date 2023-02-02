import spaceships.ShuttleShip;
import spaceships.Spaceship;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Scanner inputString = new Scanner(System.in);
    public static void main(String[] args) {

        int option;
        Spaceship spaceship;
        spaceship = null;
        do {
            System.out.println("Sistema listo para una nueva misión");
            System.out.println("Seleccione la misión que desea realizar con el tipo de nave correspondiente:");
            System.out.println("1.Lanzar carga útil al espacio (Nave de tipo lanzadera).");
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
            System.out.println("Oprima enter para continuar.");
            inputString.nextLine();
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
        }
        return spaceship;
    }
}