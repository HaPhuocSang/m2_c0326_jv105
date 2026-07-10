package ss10.bai_tap.lesson4.service.motorbike;

import ss10.bai_tap.lesson4.entity.Motorbike;
import ss10.bai_tap.lesson4.repository.motorbike.IMotorbikeRepository;
import ss10.bai_tap.lesson4.repository.motorbike.MotorbikeRepository;
import ss10.bai_tap.lesson4.untils.InputUntil;
import ss10.bai_tap.lesson4.untils.ListUtil;

import java.util.List;
import java.util.Scanner;

public class MotorBikeService implements IMotorBikeService {
    private final IMotorbikeRepository motorbikeRepository = new MotorbikeRepository();
    private final List<Motorbike> motorbikes = motorbikeRepository.findAll();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public List<Motorbike> findAll() {
        return motorbikes;
    }

    @Override
    public void add(Motorbike motorbike) {
        if (ListUtil.checkId(motorbikes, motorbike.getLicensePlate())) {
            System.out.println("------ Biển kiểm soát đã tồn tại! ------");
            return;
        }
        motorbikeRepository.add(motorbike);
        System.out.println("------ Thêm thành công! ------");
    }

    @Override
    public void edit(Motorbike motorbike) {
        if (!ListUtil.checkId(motorbikes, motorbike.getLicensePlate())) {
            System.out.println("------ Id không tồn tại! ------");
            return;
        }
        motorbikeRepository.edit(ListUtil.findIndex(motorbikes, motorbike.getLicensePlate()), motorbike);
        System.out.println("------ Sửa thành công! ------");
    }

    @Override
    public void delete(String licensePlate) {
        if (!ListUtil.checkId(motorbikes, licensePlate)) {
            System.out.println("------ Id không tồn tại! ------");
            return;
        }
        if (InputUntil.confirmDelete()) {
            motorbikeRepository.delete(ListUtil.findIndex(motorbikes, licensePlate));
            System.out.println("------ Xóa thành công! ------");
            scanner.nextLine();
        }
    }
}
