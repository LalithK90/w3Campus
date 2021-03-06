package w3Campus.asset.semester.service;

import w3Campus.asset.semester.entity.Semester;

import java.util.List;

public interface SemesterService {
    List<Semester> findAll();

    Semester findById(Long id);

    Semester persist(Semester semester);

    boolean delete(Long id);

    List<Semester> search(Semester semester);
}
