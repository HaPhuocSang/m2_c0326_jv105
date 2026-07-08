package ss4.thuc_hanh.quan_ly_hoc_sinh.service.teacher;

import ss4.thuc_hanh.quan_ly_hoc_sinh.entity.Teacher;
import ss4.thuc_hanh.quan_ly_hoc_sinh.repository.teacher.ITeacherRepository;
import ss4.thuc_hanh.quan_ly_hoc_sinh.repository.teacher.TeacherRepository;

public class TeacherService implements ITeacherService{
    private final ITeacherRepository teacherRepository = new TeacherRepository();
    private final Teacher[] teachers = teacherRepository.findAll();

    @Override
    public Teacher[] findAll() {
        return teachers;
    }

    @Override
    public void add(Teacher teacher) {
        if (checkId(teacher.getId())) {
            System.out.println("------ Id đã tồn tại! ------");
            return;
        }
        teacherRepository.add(teacher);
        System.out.println("------ Thêm thành công! ------");
    }

    @Override
    public void edit(Teacher newTeacher) {
        if (!checkId(newTeacher.getId())) {
            System.out.println("------ Id không tồn tại! ------");
            return;
        }
        teacherRepository.edit(newTeacher);
        System.out.println("------ Sửa thành công! ------");
    }

    @Override
    public void delete(int id) {
        if (!checkId(id)) {
            System.out.println("------ Id không tồn tại! ------");
            return;
        }
        teacherRepository.delete(findIndex(id));
        System.out.println("------ Xóa thành công! ------");
    }

    public boolean checkId(int id) {
        for (Teacher teacher : teachers) {
            if ((teacher != null) && (teacher.getId() == id)) {
                return true;
            }
        }
        return false;
    }

    public int findIndex(int id) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null && teachers[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
