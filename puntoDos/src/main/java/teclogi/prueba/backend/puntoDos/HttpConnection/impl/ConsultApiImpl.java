package teclogi.prueba.backend.puntoDos.HttpConnection.impl;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Component;
import teclogi.prueba.backend.puntoDos.HttpConnection.ConsultApi;
import teclogi.prueba.backend.puntoDos.Model.Car;

@Component("ConsultarApiImpl")
public class ConsultApiImpl implements ConsultApi {
    /**
     * Consulta a el api
     * @param car Ciudad que va a ser consultada
     * @return
     * @throws UnirestException
     */
    @Override
    public void saveCar(Car car)throws UnirestException {
        HttpResponse<JsonNode> jsonResponse = Unirest.post("https://test.teclogi.com/Teclogi/services/vehicle")
                .body(car).asJson();
    }

}
