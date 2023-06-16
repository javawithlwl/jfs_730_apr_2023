package com.careerit.sbl.dao;

import com.careerit.sbl.domain.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import java.sql.PreparedStatement;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ContactDaoImpl implements ContactDao {

  private final JdbcTemplate jdbcTemplate;

  private static final String ADD_CONTACT = "insert into contact(name,email,mobile) values(?,?,?)";
  private static final String GET_CONTACTS = "select id,name,email,mobile from contact";
  private static final String GET_CONTACT_COUNT = "select count(id) from contact";

  public long getContactCount(){
       return jdbcTemplate.queryForObject(GET_CONTACT_COUNT,Long.class);
  }

  @Override
  public Contact insertContact(Contact contact) {
    KeyHolder keyHolder = new GeneratedKeyHolder();
    jdbcTemplate.update((con)->{
          PreparedStatement ps = con.prepareStatement(ADD_CONTACT, new String[] { "id" });
          ps.setString(1,contact.getName());
          ps.setString(2,contact.getEmail());
          ps.setString(3,contact.getMobile());
          return ps;
      },keyHolder);
    contact.setId(keyHolder.getKey().longValue());
    return contact;
  }

  @Override
  public List<Contact> selectContacts() {
      return jdbcTemplate.query(GET_CONTACTS,(rs,rowNum)->{
          Contact contact = new Contact();
          contact.setId(rs.getLong("id"));
          contact.setName(rs.getString("name"));
          contact.setEmail(rs.getString("email"));
          contact.setMobile(rs.getString("mobile"));
          return contact;
      });
  }
}
