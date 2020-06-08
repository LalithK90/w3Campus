package lk.w3Academy.asset.student.service;


import lk.w3Academy.asset.student.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    Student findById(Long id);

    Student persist(Student student);

    boolean delete(Long id);

    List<Student> search(Student student);
    boolean isStudentPresent(Student student);
    Student lastStudent();
    Student findByNic(String nic);

}
