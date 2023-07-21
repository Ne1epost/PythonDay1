package org.example.gb.op6.InterfaceSubPrinciple;

import java.util.List;

public interface DevClass {
    double operation(List<? extends Number> numbers);
}