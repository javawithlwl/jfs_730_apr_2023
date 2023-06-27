package com.careerit.sjl.repo;

import com.careerit.sjl.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {
}
