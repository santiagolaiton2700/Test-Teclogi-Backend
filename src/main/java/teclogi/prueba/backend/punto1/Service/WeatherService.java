package teclogi.prueba.backend.punto1.Service;

import com.google.gson.JsonSyntaxException;
import com.mashape.unirest.http.exceptions.UnirestException;
import teclogi.prueba.backend.punto1.model.City;

public interface WeatherService {
    public City getCityByname(String name)throws JsonSyntaxException, UnirestException;
}