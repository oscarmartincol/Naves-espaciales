package spaceships;

/**
 *Clase abstracta que contiene las propiedades principales de una nave espacial.
 * @ author Oscar David Martinez Benavides
 */
public abstract class Spaceship implements ISpaceship{
    /**
     * Variable que representa el tipo de nave espacial.
     */
    protected String type;
    /**
     * Variable con el nombre de la nave.
     */
    protected String name;
    /**
     * Variable que describe la velocidad.
     */
    protected int speed;

    /**
     * Variable que representa el peso.
     */
    protected int weight;

    /**
     * Método para acceder al valor de la variable type.
     * @return Tipo de nave.
     */
    public String getType() {
        return type;
    }

    /**
     * Método para acceder al valor de la variable name.
     * @return Nombre de la nave.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para acceder al valor de la variable speed.
     * @return Velocidad de la nave.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Método para acceder al valor de la variable weight.
     * @return Peso de la nave.
     */
    public int getWeight() {
        return weight;
    }


    // Clases abstractas

    public abstract void undock();

    public abstract void destroy();

    public abstract void deactivate();

}
