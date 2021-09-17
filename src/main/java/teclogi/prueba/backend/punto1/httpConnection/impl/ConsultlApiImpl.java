package teclogi.prueba.backend.punto1.httpConnection.impl;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Component;
import teclogi.prueba.backend.punto1.httpConnection.ConsultApi;

@Component("ConsultarApiImpl")

public class ConsultlApiImpl implements ConsultApi {
    /**
     * Consulta a el api
     * @param cityName Ciudad que va a ser consultada
     * @return
     * @throws UnirestException
     */
    public String getDataByCity(String cityName)throws UnirestException{
        HttpResponse<String> response= Unirest.get("https://api.openweathermap.org/data/2.5/weather?q="+cityName+"&appid=cce6551c50d06bfb5867740f1428723a").asString();
        return response.getBody();
    }
}
