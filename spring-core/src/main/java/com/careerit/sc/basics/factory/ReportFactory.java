package com.careerit.sc.basics.factory;

import org.springframework.stereotype.Component;

@Component
public class ReportFactory {


      public ReportService getReportService(ReportType reportType){
            if(reportType == ReportType.EXCEL){
                  return new ExcelReportService();
            }else if(reportType == ReportType.PDF){
                  return new PdfReportService();
            }else if(reportType == ReportType.CSV) {
              return new CsvReportService();
            }
            return new ExcelReportService();
      }
}
