package ss10.bai_tap.lesson4.controller;

import ss10.bai_tap.lesson4.untils.InputUntil;

public class VehicleController {
    private final int ADD = 1;
    private final int DISPLAY = 2;
    private final int DELETE = 3;
    private final int EXIT = 4;
    public void showMenu() {
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("""
                    ======== CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG =========
                         1. Thêm mới phương tiện
                         2. Hiện thị phương tiện
                         3. Xóa phương tiện
                         4. Thoát
                    """);
            int choice = InputUntil.inputInt("------ Chọn chức năng ------");
            switch (choice) {
                case ADD:
                    AddController addController = new AddController();
                    addController.addMenu();
                    break;
                case DISPLAY:
                    DisplayController displayController = new DisplayController();
                    displayController.displayMenu();
                    break;
                case DELETE:
                    DeleteController deleteController = new DeleteController();
                    deleteController.deleteMenu();
                    break;
                case EXIT:
                    isContinue = false;
                    break;
                default:
                    System.out.println("------ Không có chức năng này! ------");
            }
        }
    }
}
