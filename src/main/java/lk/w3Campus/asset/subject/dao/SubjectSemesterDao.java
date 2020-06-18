package lk.w3Campus.asset.subject.dao;

import lk.w3Campus.asset.subject.entity.SubjectSemester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectSemesterDao extends JpaRepository<SubjectSemester, Long> {
}
