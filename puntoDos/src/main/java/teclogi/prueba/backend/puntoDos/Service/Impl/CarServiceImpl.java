package teclogi.prueba.backend.puntoDos.Service.Impl;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import teclogi.prueba.backend.puntoDos.HttpConnection.ConsultApi;
import teclogi.prueba.backend.puntoDos.Model.Car;
import teclogi.prueba.backend.puntoDos.Service.CarService;

import java.util.ArrayList;


@Service("CarService")
public class CarServiceImpl implements CarService {
    private ArrayList<Car> cars=new ArrayList<>();
    @Autowired
    @Qualifier("ConsultarApiImpl")
    ConsultApi consultApi;
    @Override
    public void saveCar(Car car) throws UnirestException {
        try{
            consultApi.saveCar(car);
        }catch (UnirestException e){
            new UnirestException("No se pudo enviar el carro");
        }
    }
    @Override
    public void saveCarList(Car car){
        cars.add(car);
    }
    @Override
    public ArrayList<Car> getCars(){
        return cars;
    }
}
