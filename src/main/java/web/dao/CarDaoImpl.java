package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    {
        save(new Car("Audi","A6", 9700000));
        save(new Car("BMW","X5", 17200000));
        save(new Car("Renault","Sandero", 1152900));
        save(new Car("Hyundai","Solaris", 1550000));
        save(new Car("Ford","Focus", 509500));
    }

    @Override
    public void save(Car car) {
        list.add(car);
    }

    @Override
    public List<Car> getCarsCount(int count) {
        return list.stream()
                .limit(count)
                .toList();
    }
}
