package spaceships;

/**
 *Clase abtracta que contiene las propiedades principales de una nave espacial.
 * @ author Oscar David Martinez Benavides
 */
public abstract class Spaceship {
    protected String type;
    protected String name;
    protected int thrust;
    protected int speed;

    protected int weight;
    protected float orbitalHeight;

    public abstract void startUp();
    public abstract void endUp();

    public abstract void selectAction();

}
