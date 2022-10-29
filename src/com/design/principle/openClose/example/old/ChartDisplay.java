package com.design.principle.openClose.example.old;

import java.util.Scanner;

/**
 * @date 2022/10/29
 **/
public class ChartDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();

        //输入1，则打印饼状报表
        if(i==1){
            PieChart chart = new PieChart();
            chart.display();
            //输入2，则打印柱状报表
        }else if(i==2){
            BarChart chart = new BarChart();
            chart.display();
        }
    }

}