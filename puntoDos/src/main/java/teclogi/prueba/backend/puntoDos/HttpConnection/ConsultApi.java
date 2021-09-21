package teclogi.prueba.backend.puntoDos.HttpConnection;

import com.mashape.unirest.http.exceptions.UnirestException;
import teclogi.prueba.backend.puntoDos.Model.Car;

public interface ConsultApi {
    public int saveCar(Car car) throws UnirestException;
}
