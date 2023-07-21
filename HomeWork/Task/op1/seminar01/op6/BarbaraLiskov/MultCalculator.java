package org.example.gb.op6.BarbaraLiskov;

import java.util.List;

public class MultCalculator implements MultSumClass {
    public double operation(List<? extends Number> numbers) {
        double res = 1.0;
        for (Number n : numbers) {
            res *= n.doubleValue();
        }
        return res;
    }

}