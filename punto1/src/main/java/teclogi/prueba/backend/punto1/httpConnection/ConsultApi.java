package teclogi.prueba.backend.punto1.httpConnection;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Component;


public interface ConsultApi  {
    public String getDataByCity(String cityName)throws UnirestException;
}

