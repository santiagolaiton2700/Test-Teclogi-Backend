package teclogi.prueba.backend.puntoDos.HttpConnection.impl;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import jdk.nashorn.internal.ir.ObjectNode;
import org.springframework.stereotype.Component;
import teclogi.prueba.backend.puntoDos.HttpConnection.ConsultApi;
import teclogi.prueba.backend.puntoDos.Model.Car;

@Component("ConsultarApiImpl")
public class ConsultApiImpl implements ConsultApi {

    @Override
    /**
     * Consulta a el api
     * @param Car carro que va ser guardado
     * @return el estado de la petición 
     * @throws UnirestException
     */
    public int saveCar(Car car)throws UnirestException {
        System.out.println(car.getId());
        HttpResponse<JsonNode> postResponse = Unirest.post("https://test.teclogi.com/Teclogi/services/vehicle")
                .header("tokenUser", "E630C3F619EC42164D17FBA99731D8624D332936D43420845CC214E501D122B3")
                .body(car)
                .asJson();
        System.out.println(postResponse.getHeaders());
        return postResponse.getStatus();
        /**
        HttpResponse<JsonNode> jsonNodeHttpResponse=Unirest.post("https://test.teclogi.com/Teclogi/services/vehicle")
                .header("Accept", "application/json")
                .header("tokenUser","E630C3F619EC42164D17FBA99731D8624D332936D43420845CC214E501D122B3")
                .body(car)
                .asJson();
         **/
    }

}
