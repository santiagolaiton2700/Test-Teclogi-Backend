package teclogi.prueba.backend.punto1.Controller;

import com.google.gson.JsonSyntaxException;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teclogi.prueba.backend.punto1.Service.WeatherService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/weather")
public class WeatherController {
    @Autowired
    @Qualifier("WeatherService")
    private WeatherService weatherService;

    /**
     * EndPoint que se obtiene la informacion de la ciudad
     * @param cityName nombre de la ciudad a obtener informacion
     * @return Ciudad encontrada
     */

    @RequestMapping (method = RequestMethod.GET,value = "/{cityName}")
    public ResponseEntity<?> getCiudad(@PathVariable String cityName){
        try{
            return new ResponseEntity(weatherService.getCityByname(cityName), HttpStatus.OK);
        }catch (JsonSyntaxException | UnirestException e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }


}
