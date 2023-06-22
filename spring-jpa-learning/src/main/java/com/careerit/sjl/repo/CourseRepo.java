package com.careerit.sjl.repo;

import com.careerit.sjl.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CourseRepo extends JpaRepository<Course, Long> {

        List<Course> findByFeeGreaterThanEqual(double fee);

        List<Course> findByFeeBetween(double min,double max);

        @Query("select c from Course c where c.fee between ?1 and ?2")
        List<Course> feeBetween(double min,double max);
}
