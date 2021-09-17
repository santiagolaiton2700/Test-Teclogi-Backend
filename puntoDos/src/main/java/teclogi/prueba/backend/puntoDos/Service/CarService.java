package teclogi.prueba.backend.puntoDos.Service;

import com.mashape.unirest.http.exceptions.UnirestException;
import teclogi.prueba.backend.puntoDos.Model.Car;

import java.util.ArrayList;

public interface CarService {
    public void saveCar(Car car) throws UnirestException;
    public void saveCarList(Car car);
    public ArrayList<Car> getCars();
}
