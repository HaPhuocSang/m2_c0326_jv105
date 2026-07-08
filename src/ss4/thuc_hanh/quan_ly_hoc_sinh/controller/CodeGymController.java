package ss4.thuc_hanh.quan_ly_hoc_sinh.controller;

import ss4.thuc_hanh.quan_ly_hoc_sinh.untils.InputUntil;

public class CodeGymController {
    private final StudentController studentController = new StudentController();
    private final TeacherController teacherController = new TeacherController();
    private final int STUDENT = 1;
    private final int TEACHER = 2;
    private final int EXIT = 3;
    public void showMenu(){
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("""
                        ======== Quản lý giáo viên =========
                         1. Quản lý sinh viên
                         2. Quản lý giáo viên
                         3. Thoát
                    """);
            int choice = InputUntil.inputInt("------ Chọn chức năng ------");
            switch (choice) {
                case STUDENT:
                    studentController.showMenu();
                    break;
                case TEACHER:
                    teacherController.showMenu();
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
