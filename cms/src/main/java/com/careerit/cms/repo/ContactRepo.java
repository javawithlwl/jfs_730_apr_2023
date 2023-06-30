package com.careerit.cms.repo;

import com.careerit.cms.domain.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ContactRepo extends MongoRepository<Contact,String> {

      Optional<Contact> findByMobile(String mobile);

      @Query("{'name': {$regex: ?0 }}")
      List<Contact> search(String str);
}
