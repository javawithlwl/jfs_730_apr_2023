package com.careerit.sc.basics.factory;

public class ExcelReportService implements ReportService{
  @Override
  public void generateReport(String data) {
    System.out.println("Excel report generated with data :"+data);
  }
}
