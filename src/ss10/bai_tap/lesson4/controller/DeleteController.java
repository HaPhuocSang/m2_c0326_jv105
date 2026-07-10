package ss10.bai_tap.lesson4.controller;

import ss10.bai_tap.lesson4.untils.InputUntil;
import ss10.bai_tap.lesson4.service.car.CarService;
import ss10.bai_tap.lesson4.service.car.ICarService;
import ss10.bai_tap.lesson4.service.motorbike.IMotorBikeService;
import ss10.bai_tap.lesson4.service.motorbike.MotorBikeService;
import ss10.bai_tap.lesson4.service.truck.ITruckService;
import ss10.bai_tap.lesson4.service.truck.TruckService;
import ss10.bai_tap.lesson4.view.CarView;
import ss10.bai_tap.lesson4.view.MotorbikeView;
import ss10.bai_tap.lesson4.view.TruckView;

public class DeleteController {
    private final ICarService carService = new CarService();
    private final IMotorBikeService motorBikeService = new MotorBikeService();
    private final ITruckService truckService = new TruckService();
    private final int CAR = 1;
    private final int MOTORBIKE = 2;
    private final int TRUCK = 3;
    private final int EXIT = 4;
    public void deleteMenu() {
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("""
                    ======== Xóa phương tiện =========
                         1. Xe ô tô
                         2. Xe máy
                         3. Xe tải
                         4. Quay lai
                    """);
            int choice = InputUntil.inputInt("------ Chọn chức năng ------");
            switch (choice) {
                case CAR:
                    carService.delete(CarView.deleteData());
                    return;
                case MOTORBIKE:
                    motorBikeService.delete(MotorbikeView.deleteData());
                    return;
                case TRUCK:
                    truckService.delete(TruckView.deleteData());
                    return;
                case EXIT:
                    isContinue = false;
                    break;
                default:
                    System.out.println("------ Không có chức năng này! ------");
            }
        }
    }
}
