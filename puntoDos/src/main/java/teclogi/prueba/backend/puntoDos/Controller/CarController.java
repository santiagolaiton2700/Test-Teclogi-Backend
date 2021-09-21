package teclogi.prueba.backend.puntoDos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import teclogi.prueba.backend.puntoDos.Model.Car;
import teclogi.prueba.backend.puntoDos.Service.CarService;

import java.util.logging.Level;
import java.util.logging.Logger;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/Car/")
public class CarController {
    @Autowired
    @Qualifier("CarService")
    private CarService carService;
    @RequestMapping(value = "/registrar/", headers = "tokenUser=E630C3F619EC42164D17FBA99731D8624D332936D43420845CC214E501D122B3", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> saveCar(@RequestBody Car car) {
        try {
            carService.saveCar(car);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception ex) {
            Logger.getLogger(CarController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se ha podido guardar el carro",
                    HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(method = RequestMethod.POST, path = {"agregarCarro/"})
    public ResponseEntity<?> saveProductlist(@RequestBody Car car) {
        try
        {
            carService.saveCarList(car);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception ex) {
            Logger.getLogger(CarController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se ha podido guardar el carro",
                    HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getCars() {
        try
        {
            return new ResponseEntity<>(carService.getCars(),HttpStatus.OK);
        }catch (Exception ex) {
            Logger.getLogger(CarController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se ha podido guardar el carro",
                    HttpStatus.NOT_FOUND);
        }
    }
}
