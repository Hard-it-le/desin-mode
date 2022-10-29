package com.design.principle.interfacesIsolation.example.old;


public class ReportExcelClient {

    public static void main(String[] args) {
        DataRead dataRead = new DataReadImpl();
        dataRead.reportExcel();
    }
}
