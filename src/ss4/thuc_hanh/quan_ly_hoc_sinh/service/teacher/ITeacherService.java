package ss4.thuc_hanh.quan_ly_hoc_sinh.service.teacher;

import ss4.thuc_hanh.quan_ly_hoc_sinh.entity.Teacher;

public interface ITeacherService {
    Teacher[] findAll();

    void add(Teacher teacher);

    void edit(Teacher newTeacher);

    void delete(int id);
}
