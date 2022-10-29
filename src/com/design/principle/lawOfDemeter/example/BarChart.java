package com.design.principle.lawOfDemeter.example;


public class BarChart extends AbstractChart {

    @Override
    public void display(){
        System.out.println("柱状报表展示");
    }
}
