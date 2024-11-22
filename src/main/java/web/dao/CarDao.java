package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarDao {
    List<Car> list = new ArrayList<>();

    void save(Car car);

    List<Car> getCarsCount(int count);
}
