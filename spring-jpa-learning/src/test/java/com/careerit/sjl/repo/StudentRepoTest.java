package com.careerit.sjl.repo;

import com.careerit.sjl.domain.Address;
import com.careerit.sjl.domain.Passport;
import com.careerit.sjl.domain.Student;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
public class StudentRepoTest {

      @Autowired
      private PassportRepo passportRepo;
      @Autowired
      private StudentRepo studentRepo;

      @Autowired
      private AddressRepo addressRepo;

      @BeforeEach
      public void init(){
            passportRepo.deleteAll();
            studentRepo.deleteAll();
      }

      @Test
      @Transactional
      @Rollback(value = false)
      public void testAddStudent(){
            Passport passport = new Passport();
            passport.setIssuedCountry("India");
            passport.setPassportNumber("123456");
            Passport savedPassport = passportRepo.save(passport);
            Student student = new Student();
            student.setEmail("krish.t@gmail.com");
            student.setMobile("9876543210");
            student.setName("Krish");
            student.setPassport(savedPassport);
            studentRepo.save(student);
      }


      @Test
      @Transactional
      public void getStudentById(){
            Passport passport = new Passport();
            passport.setIssuedCountry("India");
            passport.setPassportNumber("123456");
            Passport savedPassport = passportRepo.save(passport);
            Student student = new Student();
            student.setEmail("krish.t@gmail.com");
            student.setMobile("9876543210");
            student.setName("Krish");
            student.setPassport(savedPassport);
            studentRepo.save(student);
            studentRepo.findById(student.getId()).ifPresent(s->{
                  System.out.println(s.getName()+" "+s.getPassport().getPassportNumber()+" "+s.getPassport().getIssuedCountry());
            });

      }

      @Test
      @Transactional
      @Rollback(false)
      public void addStudentWithAddress(){
            Passport passport = new Passport();
            passport.setIssuedCountry("India");
            passport.setPassportNumber("123456");
            Passport savedPassport = passportRepo.save(passport);
            Student student = new Student();
            student.setEmail("krish.t@gmail.com");
            student.setMobile("9876543210");
            student.setName("Krish");
            student.setPassport(savedPassport);
            studentRepo.save(student);
            studentRepo.findById(student.getId()).ifPresent(s->{
                  Address address1 = new Address();
                  address1.setCity("Hyderabad");
                  address1.setCountry("India");
                  address1.setState("Telangana");
                  address1.setStudent(s);
                  addressRepo.save(address1);
                  Address address2 = new Address();
                  address2.setCity("Bangalore");
                  address2.setCountry("India");
                  address2.setState("Karnataka");
                  address2.setStudent(s);
                  addressRepo.save(address2);
            });

      }
}
