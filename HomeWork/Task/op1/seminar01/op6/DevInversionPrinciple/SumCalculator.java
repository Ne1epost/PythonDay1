package org.example.gb.op6.DevInversionPrinciple;

import java.util.List;

public class SumCalculator implements MultSumClass {
    public double operation(List<? extends Number> numbers) {
        double res = 0.0;
        for (Number n : numbers) {
            res += n.doubleValue();
        }
        return res;
    }
}