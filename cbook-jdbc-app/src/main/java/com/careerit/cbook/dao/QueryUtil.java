package com.careerit.cbook.dao;

public final class QueryUtil {

  public static final String ADD_CONTACT= "insert into contact(name,email,mobile) values(?,?,?)";
  public static final String UPDATE_CONTACT= "update contact set name=?,email=?,mobile=? where id=?";
  public static final String DELETE_CONTACT= "delete from contact where id=?";
  public static final String SELECT_CONTACT= "select id,name,email,mobile from contact where id=?";
  public static final String SEARCH_CONTACT= "select id,name,email,mobile from contact where lower(name) like ? or lower(email) like ? or mobile like ?";
  public static final String IS_CONTACT_EXISTS= "select count(id) as count from contact where mobile=?";
  public static final String GET_ALL_CONTACTS= "select id,name,email,mobile from contact";
}
