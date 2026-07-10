package ss10.bai_tap.lesson4.repository.truck;

import ss10.bai_tap.lesson4.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository{
    private final static List<Truck> trucks = new ArrayList<>();
    static {
        trucks.add(new Truck("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A", 3));
        trucks.add(new Truck("43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B", 9));
        trucks.add(new Truck("43C-45.235", "Hino", 2021, "Nguyễn Văn C", 12));
    }
    @Override
    public List<Truck> findAll() {
        return trucks;
    }

    @Override
    public void add(Truck truck) {
        trucks.add(truck);
    }

    @Override
    public void edit(int index, Truck truck) {
        trucks.set(index, truck);
    }

    @Override
    public void delete(int index) {
        trucks.remove(index);
    }
}
