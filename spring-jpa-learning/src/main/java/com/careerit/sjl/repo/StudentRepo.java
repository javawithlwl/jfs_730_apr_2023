package com.careerit.sjl.repo;

import com.careerit.sjl.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
