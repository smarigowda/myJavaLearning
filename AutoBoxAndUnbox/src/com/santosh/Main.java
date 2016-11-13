package com.santosh;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;

public class Main {

    public static void main(String[] args) {
        ArrayList<Double> myDoubleAList = new ArrayList<>();
        for(double d = 0.0; d< 10.0; d+=0.5) {
            myDoubleAList.add(Double.valueOf(d));
        }
        for(int i=0; i<myDoubleAList.size(); i++) {
            System.out.println(myDoubleAList.get(i).doubleValue());
        }
    }
}
