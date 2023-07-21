package org.example.gb.op6.SinglePrinciple;


import java.util.List;

public class MultCalculator {
    public double multiplication(List<? extends Number> numbers) {
        double res = 1.0;
        for (Number n : numbers) {
            res *= n.doubleValue();
        }
        return res;
    }
}
