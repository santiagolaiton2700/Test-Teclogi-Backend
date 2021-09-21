package teclogi.prueba.backend.puntoDos.Model;

/**
 * Esta clase define el objeto carro la cuanto tiene dos tipos mas los cuales son el conductor del carro y el dueño
 * @author Santiago Agustin Laiton Cubides
 * @version 20/09/2021
 */

public class Car {
    private Owner owner;
    private Driver driver;
    private String id;

    public Car() {
    }

    /**
     * Contructor de la clase car 
     * @param owner
     * @param driver
     * @param id
     */
    public Car(Owner owner, Driver driver, String id) {
        this.owner = owner;
        this.driver = driver;
        this.id = id;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
