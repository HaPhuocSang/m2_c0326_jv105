package ss4.thuc_hanh.quan_ly_hoc_sinh.repository.teacher;

import ss4.thuc_hanh.quan_ly_hoc_sinh.entity.Teacher;

public interface ITeacherRepository {
    Teacher[] findAll();

    void add(Teacher teacher);

    void edit(Teacher newTeacher);

    void delete(int index);
}
