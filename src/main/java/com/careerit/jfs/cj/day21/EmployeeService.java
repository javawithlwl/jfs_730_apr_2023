package com.careerit.jfs.cj.day21;

import java.util.List;

public interface EmployeeService {

      List<String> getCountryNames();
      List<Employee> getTopPaidEmployees(int n);
      List<Employee> getEmployeesByCountry(String country);
      List<EmpCountryStats> getEmpStatsByCountry();
      List<Employee> search(String str);
}
