package com.careerit.sc.basics.factory;

public class PdfReportService implements ReportService{
  @Override
  public void generateReport(String data) {
    System.out.println("Pdf report generated with data :"+data);
  }
}
