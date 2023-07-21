package org.example.gb.op6.SinglePrinciple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SumCalculator calc = new SumCalculator();
        MultCalculator multCalc = new MultCalculator();
        DevCalculator devCalc = new DevCalculator();
        List<Double> data1 = new ArrayList<>(Arrays.asList(1.3, 5.6, 3.1));
        List<Integer> data2 = new ArrayList<>(Arrays.asList(1, 6, 9));
        List<Integer> data3 = new ArrayList<>(Arrays.asList(2, 5, 6));
        System.out.println();
        System.out.println("Суммирование");
        System.out.println("calc.sum(data1) = " + calc.sum(data1));
        System.out.println("calc.sum(data2) = " + calc.sum(data2));
        System.out.println();
        System.out.println("Умноженме");
        System.out.println("calc.multiplication(data2) = " + multCalc.multiplication(data2));
        System.out.println("calc.multiplication(data1) = " + multCalc.multiplication(data1));
        System.out.println();
        System.out.println("Деление");
        System.out.println("calc.devision(data2) = " + devCalc.devision(data2));
        System.out.println("calc.devision(data3) = " + devCalc.devision(data3));
    }
}
