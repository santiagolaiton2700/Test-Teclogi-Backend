package teclogi.prueba.backend.puntoDos.Model;

public class Car {
    private Owner owner;
    private Driver driver;
    private String id;

    public Car() {
    }

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
