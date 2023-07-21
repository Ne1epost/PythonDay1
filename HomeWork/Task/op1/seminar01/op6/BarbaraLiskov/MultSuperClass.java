package org.example.gb.op6.BarbaraLiskov;

import java.util.List;

public class MultSuperClass extends MultCalculator{
    protected double plus = 100.0;

    public double operation(List<? extends Number> numbers) {
        double res = 1.0;
        for (Number n : numbers) {
            res *= n.doubleValue();
        }
        return res + plus;
    }
}