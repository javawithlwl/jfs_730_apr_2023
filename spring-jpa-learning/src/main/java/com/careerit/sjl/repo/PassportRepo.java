package com.careerit.sjl.repo;

import com.careerit.sjl.domain.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepo extends JpaRepository<Passport,Long> {
}
