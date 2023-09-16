package br.com.thiaago.calculadora.operation.impl;

import br.com.thiaago.calculadora.operation.Operation;

import java.util.List;

public class DivisionOperation implements Operation {
    @Override
    public String getName() {
        return "Divisão";
    }

    @Override
    public char getSymbol() {
        return 'D';
    }

    @Override
    public double resolveOperation(List<Double> numbers) {
        double division = 0;
        for (Double number : numbers) {
            division /= number;
        }
        return division;
    }
}
