package ss4.thuc_hanh.quan_ly_hoc_sinh.repository.student;

import ss4.thuc_hanh.quan_ly_hoc_sinh.entity.Student;

public interface IStudentRepository {
    Student[] findAll();

    void add(Student student);

    void edit(Student newStudent);

    void delete(int index);
}
