package org.example.gb.Calculate.calculator;

public interface ICalculableFactory {
    Calculable create(int primaryArg, boolean logFlag);
}