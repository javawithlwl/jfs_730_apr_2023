package com.careerit.cms.repo;

import com.careerit.cms.dto.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface AppUserRepo extends MongoRepository<AppUser, String> {
  Optional<AppUser> findByUsername(String username);
}
