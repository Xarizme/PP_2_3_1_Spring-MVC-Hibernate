package web.CarService;

import web.model.Car;

import java.util.List;

public interface Service {

    List<Car> getCars(int count);
}
