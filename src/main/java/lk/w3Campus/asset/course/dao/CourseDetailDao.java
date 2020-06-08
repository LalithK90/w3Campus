package lk.w3Campus.asset.course.dao;

import lk.w3Campus.asset.course.entity.CourseDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDetailDao extends JpaRepository<CourseDetail, Long> {
}
