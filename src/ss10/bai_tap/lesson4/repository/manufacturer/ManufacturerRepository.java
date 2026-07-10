package ss10.bai_tap.lesson4.repository.manufacturer;

import ss10.bai_tap.lesson4.entity.Manufacturer;

import java.util.ArrayList;
import java.util.List;

public class ManufacturerRepository implements IManufacturerRepository {
    private final static List<Manufacturer> manufacturers = new ArrayList<>();

    static {
        manufacturers.add(new Manufacturer("HSX-001","Yamaha","Nhật Bản"));
        manufacturers.add(new Manufacturer("HSX-002","Honda","Nhật Bản"));
        manufacturers.add(new Manufacturer("HSX-003","Dongfeng","Trung Quốc"));
        manufacturers.add(new Manufacturer("HSX-004","Huyndai","Hàn Quốc"));
        manufacturers.add(new Manufacturer("HSX-005","Ford","Mỹ"));
        manufacturers.add(new Manufacturer("HSX-006","Toyota","Nhật Bản"));
        manufacturers.add(new Manufacturer("HSX-007","Hino","Nhật Bản"));
    }

    @Override
    public List<Manufacturer> findAll() {
        return manufacturers;
    }

    @Override
    public void add(Manufacturer manufacturer) {
        manufacturers.add(manufacturer);
    }

    @Override
    public void edit(int index, Manufacturer manufacturer) {
        manufacturers.set(index, manufacturer);
    }

    @Override
    public void delete(int index) {
        manufacturers.remove(index);
    }
}
