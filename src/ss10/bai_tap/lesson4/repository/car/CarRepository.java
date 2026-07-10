package ss10.bai_tap.lesson4.repository.car;

import ss10.bai_tap.lesson4.entity.Car;
import ss10.bai_tap.lesson4.entity.enums.CarType;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository{
    private final static List<Car> cars = new ArrayList<>();
    static {
        cars.add(new Car("43A-212.56","Toyota",2019,"Nguyễn Văn A",5,CarType.TOURISM));
        cars.add(new Car("43B-453.88","Huyndai",2020,"Nguyễn Văn B",45,CarType.COACH));
        cars.add(new Car("43B-453.89","Ford",2020,"Nguyễn Văn C",16,CarType.COACH));
    }
    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public void edit(int index, Car car) {
        cars.set(index, car);
    }

    @Override
    public void delete(int index) {
        cars.remove(index);
    }
}
