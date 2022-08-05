package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceIml implements CarService{
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(3, "Audi", "Q"));
        carList.add(new Car(1, "Lada", "Granta"));
        carList.add(new Car(11, "Nissan", "Qashqai"));
        carList.add(new Car(2, "Nissan", "Juke"));
        carList.add(new Car(5, "Lada", "Vesta"));
    }

    @Override
    public List<Car> getCarList(String count) {
        if (count == null) {
            return carList;
        } else {
            int i = Integer.parseInt(count);
            return carList.stream().limit(i).toList();
        }
    }
}
