package com.design.principle.interfacesIsolation.example.news;


public class ReportExcelClient {
    public static void main(String[] args) {
        ReportInterface reportInterface= new DataReadImpl();
        reportInterface.reportExcel();
    }
}
