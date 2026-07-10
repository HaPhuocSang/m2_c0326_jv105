package ss10.bai_tap.lesson4.service.truck;

import ss10.bai_tap.lesson4.entity.Truck;
import ss10.bai_tap.lesson4.repository.truck.ITruckRepository;
import ss10.bai_tap.lesson4.repository.truck.TruckRepository;
import ss10.bai_tap.lesson4.untils.InputUntil;
import ss10.bai_tap.lesson4.untils.ListUtil;

import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private final ITruckRepository truckRepository = new TruckRepository();
    private final List<Truck> trucks = truckRepository.findAll();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public List<Truck> findAll() {
        return trucks;
    }

    @Override
    public void add(Truck truck) {
        if (ListUtil.checkId(trucks, truck.getLicensePlate())) {
            System.out.println("------ Biển kiểm soát đã tồn tại! ------");
            return;
        }
        truckRepository.add(truck);
        System.out.println("------ Thêm thành công! ------");
    }

    @Override
    public void edit(Truck truck) {
        if (!ListUtil.checkId(trucks, truck.getLicensePlate())) {
            System.out.println("------ Id không tồn tại! ------");
            return;
        }
        truckRepository.edit(ListUtil.findIndex(trucks, truck.getLicensePlate()), truck);
        System.out.println("------ Sửa thành công! ------");
    }

    @Override
    public void delete(String licensePlate) {
        if (!ListUtil.checkId(trucks, licensePlate)) {
            System.out.println("------ Id không tồn tại! ------");
            return;
        }
        if (InputUntil.confirmDelete()) {
            truckRepository.delete(ListUtil.findIndex(trucks, licensePlate));
            System.out.println("------ Xóa thành công! ------");
            scanner.nextLine();
        }
    }
}
