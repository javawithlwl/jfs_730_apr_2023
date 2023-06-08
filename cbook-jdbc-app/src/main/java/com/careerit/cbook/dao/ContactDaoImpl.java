package com.careerit.cbook.dao;


import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ContactDaoImpl implements ContactDao {


  @Override
  public Contact insertContact(Contact contact) {
    Connection con = null;
    PreparedStatement pst = null;
    try {
      con = ConnectionUtil.getConnection();
      pst = con.prepareStatement(QueryUtil.ADD_CONTACT, new String[]{"id"});
      pst.setString(1, contact.getName());
      pst.setString(2, contact.getEmail());
      pst.setString(3, contact.getMobile());
      pst.executeUpdate();
      ResultSet resultSet = pst.getGeneratedKeys();
      if (resultSet.next()) {
        long id = resultSet.getLong("id");
        contact.setId(id);
      }
    } catch (SQLException e) {
      System.out.println("While adding contact " + e);
    }
    return contact;
  }

  @Override
  public Contact updateContact(Contact contact) throws SQLException {
    Connection con = null;
    PreparedStatement pst = null;
    try {
      con = ConnectionUtil.getConnection();
      pst = con.prepareStatement(QueryUtil.UPDATE_CONTACT);
      pst.setString(1, contact.getName());
      pst.setString(2, contact.getEmail());
      pst.setString(3, contact.getMobile());
      pst.setLong(4, contact.getId());
      pst.executeUpdate();
    } catch (SQLException e) {
      System.out.println("While updating contact " + e);
      throw e;
    } finally {
      ConnectionUtil.close(pst, con);
    }
    return contact;
  }

  @Override
  public List<Contact> search(String str) {
    Connection con = null;
    PreparedStatement pst = null;
    List<Contact> list = new ArrayList<>();
    try {
      con = ConnectionUtil.getConnection();
      pst = con.prepareStatement(QueryUtil.SEARCH_CONTACT);
      pst.setString(1, "%" + str.toLowerCase() + "%");
      pst.setString(2, "%" + str.toLowerCase() + "%");
      pst.setString(3, "%" + str + "%");
      ResultSet rs = pst.executeQuery();
      while (rs.next()) {
        long id = rs.getLong("id");
        String name = rs.getString("name");
        String email = rs.getString("email");
        String mobile = rs.getString("mobile");
        Contact contact = getContact(id, name, email, mobile);
        list.add(contact);
      }
    } catch (SQLException e) {
      System.out.println("While searching contact " + e);
    }
    return list;

  }

  private Contact getContact(long id, String name, String email, String mobile) {
    Contact contact = new Contact();
    contact.setId(id);
    contact.setName(name);
    contact.setEmail(email);
    contact.setMobile(mobile);
    return contact;
  }

  @Override
  public boolean deleteContact(long id) {
    Connection con = null;
    PreparedStatement pst = null;
    try {
      con = ConnectionUtil.getConnection();
      pst = con.prepareStatement(QueryUtil.DELETE_CONTACT);
      pst.setLong(1, id);
      int count = pst.executeUpdate();
      if (count == 1) {
        return true;
      }
    } catch (SQLException e) {
      System.out.println("While deleting contact " + e);
    } finally {
      ConnectionUtil.close(pst, con);
    }
    return false;
  }

  @Override
  public Optional<Contact> selectContact(long id) {
    Connection con = null;
    PreparedStatement pst = null;
    try {
      con = ConnectionUtil.getConnection();
      pst = con.prepareStatement(QueryUtil.SELECT_CONTACT);
      pst.setLong(1, id);
      ResultSet rs = pst.executeQuery();
      if (rs.next()) {
        String name = rs.getString("name");
        String email = rs.getString("email");
        String mobile = rs.getString("mobile");
        Contact contact = getContact(id, name, email, mobile);
        return Optional.of(contact);
      }
    } catch (SQLException e) {
      System.out.println("While selecting contact " + e);
    }finally {
      ConnectionUtil.close(pst,con);
    }
    return Optional.empty();
  }

  @Override
  public boolean isContactExists(String mobile) {
    Connection con = null;
    PreparedStatement pst = null;
    try {
      con = ConnectionUtil.getConnection();
      pst = con.prepareStatement(QueryUtil.IS_CONTACT_EXISTS);
      pst.setString(1, mobile);
      ResultSet rs = pst.executeQuery();
      if (rs.next()) {
          if(rs.getInt(1) != 0){
            return true;
          }
      }
    } catch (SQLException e) {
      System.out.println("While checking contact " + e);
    } finally {
      ConnectionUtil.close(pst, con);
    }
    return false;
  }

  @Override
  public List<Contact> selectAllContacts() {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    List<Contact> list = new ArrayList<>();
    try {
      con = ConnectionUtil.getConnection();
      st = con.createStatement();
      rs = st.executeQuery(QueryUtil.GET_ALL_CONTACTS);
      while (rs.next()) {
        long id = rs.getLong("id");
        String name = rs.getString("name");
        String email = rs.getString("email");
        String mobile = rs.getString("mobile");
        Contact contact = getContact(id, name, email, mobile);
        list.add(contact);
      }
    } catch (SQLException e) {
      System.out.println("While selecting all contacts " + e);
    } finally {
      ConnectionUtil.close(rs, st, con);
    }
    return list;
  }

  @Override
  public List<Contact> insertContacts(List<Contact> contacts) {
    return null;
  }
}
