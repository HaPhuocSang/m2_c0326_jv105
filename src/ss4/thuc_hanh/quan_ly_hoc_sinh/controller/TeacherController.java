package ss4.thuc_hanh.quan_ly_hoc_sinh.controller;

import ss4.thuc_hanh.quan_ly_hoc_sinh.entity.Teacher;
import ss4.thuc_hanh.quan_ly_hoc_sinh.service.teacher.ITeacherService;
import ss4.thuc_hanh.quan_ly_hoc_sinh.service.teacher.TeacherService;
import ss4.thuc_hanh.quan_ly_hoc_sinh.untils.InputUntil;
import ss4.thuc_hanh.quan_ly_hoc_sinh.view.TeacherView;

public class TeacherController {
    private final ITeacherService teacherService = new TeacherService();
    private final int DISPLAYLIST = 1;
    private final int ADD = 2;
    private final int EDIT = 3;
    private final int DELETE = 4;
    private final int EXIT = 5;

    public void showMenu() {
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("""
                        ======== Quản lý giáo viên =========
                         1. Danh sách
                         2. Thêm mới
                         3. Sửa
                         4. Xoá
                         5. Quay lại
                    """);
            int choice = InputUntil.inputInt("------ Chọn chức năng ------");
            switch (choice) {
                case DISPLAYLIST:
                    Teacher[] teachers = teacherService.findAll();
                    TeacherView.displayList(teachers);
                    break;
                case ADD:
                    teacherService.add(TeacherView.inputNewData());
                    break;
                case EDIT:
                    teacherService.edit(TeacherView.editData());
                    break;
                case DELETE:
                    teacherService.delete(TeacherView.deleteData());
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
