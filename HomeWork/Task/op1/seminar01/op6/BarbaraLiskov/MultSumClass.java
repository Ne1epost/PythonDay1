package org.example.gb.op6.BarbaraLiskov;

import java.util.List;

public interface MultSumClass {
    double operation(List<? extends Number> numbers);
}