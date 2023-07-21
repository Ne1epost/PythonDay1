package org.example.gb.op6.SinglePrinciple;


import java.util.List;

public class SumCalculator {
    public double sum(List<? extends Number> numbers) {
        double res = 0.0;
        for (Number n : numbers) {
            res += n.doubleValue();
        }
        return res;
    }
}