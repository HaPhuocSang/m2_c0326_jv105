package ss10.bai_tap.lesson4.service.car;

import ss10.bai_tap.lesson4.entity.Car;
import ss10.bai_tap.lesson4.repository.car.CarRepository;
import ss10.bai_tap.lesson4.repository.car.ICarRepository;
import ss10.bai_tap.lesson4.untils.InputUntil;
import ss10.bai_tap.lesson4.untils.ListUtil;

import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private final ICarRepository carRepository = new CarRepository();
    private final List<Car> cars = carRepository.findAll();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public void add(Car car) {
        if (ListUtil.checkId(cars, car.getLicensePlate())) {
            System.out.println("------ Biển kiểm soát đã tồn tại! ------");
            return;
        }
        carRepository.add(car);
        System.out.println("------ Thêm thành công! ------");
    }

    @Override
    public void edit(Car car) {
        if (!ListUtil.checkId(cars, car.getLicensePlate())) {
            System.out.println("------ Id không tồn tại! ------");
            return;
        }
        carRepository.edit(ListUtil.findIndex(cars, car.getLicensePlate()), car);
        System.out.println("------ Sửa thành công! ------");
    }

    @Override
    public void delete(String licensePlate) {
        if (!ListUtil.checkId(cars, licensePlate)) {
            System.out.println("------ Id không tồn tại! ------");
            return;
        }
        if (InputUntil.confirmDelete()) {
            carRepository.delete(ListUtil.findIndex(cars, licensePlate));
            System.out.println("------ Xóa thành công! ------");
            scanner.nextLine();
        }
    }
}
