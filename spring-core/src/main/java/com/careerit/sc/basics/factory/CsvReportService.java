package com.careerit.sc.basics.factory;

public class CsvReportService implements ReportService{
  @Override
  public void generateReport(String data) {
    System.out.println("Csv report generated with data :"+data);
  }
}
