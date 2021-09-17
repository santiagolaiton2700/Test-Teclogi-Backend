package teclogi.prueba.backend.punto1.Service.impl;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import teclogi.prueba.backend.punto1.Service.WeatherService;
import teclogi.prueba.backend.punto1.httpConnection.ConsultApi;
import teclogi.prueba.backend.punto1.model.City;

@Service("WeatherService")
public class WeatherServiceImpl implements WeatherService {
    @Autowired
    @Qualifier("ConsultarApiImpl")

    ConsultApi consultApi;
    @Override
    public City getCityByname(String name) throws JsonSyntaxException, UnirestException {
        City city;
        Gson gson=new Gson();
        city=gson.fromJson(consultApi.getDataByCity(name),City.class);
        return city;
    }
}