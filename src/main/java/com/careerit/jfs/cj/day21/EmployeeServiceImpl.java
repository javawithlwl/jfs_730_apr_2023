package com.careerit.jfs.cj.day21;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

  private List<Employee> empList;

  public EmployeeServiceImpl() {
    empList = JsonUtil.loadFromJSON();
  }

  @Override
  public List<String> getCountryNames() {
    return null;
  }

  @Override
  public List<Employee> getTopPaidEmployees(int n) {
    return null;
  }

  @Override
  public List<Employee> getEmployeesByCountry(String country) {
    return null;
  }

  @Override
  public List<EmpCountryStats> getEmpStatsByCountry() {
    return null;
  }

  @Override
  public List<Employee> search(String str) {
    return null;
  }
}
