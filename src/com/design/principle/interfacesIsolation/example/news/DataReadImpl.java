package com.design.principle.interfacesIsolation.example.news;



public class DataReadImpl implements ReportInterface{

    @Override
    public void reportExcel() {
        System.out.println("导出Excel报表");
    }
}
