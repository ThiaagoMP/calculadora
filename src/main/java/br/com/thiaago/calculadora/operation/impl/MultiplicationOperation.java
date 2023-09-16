package br.com.thiaago.calculadora.operation.impl;

import br.com.thiaago.calculadora.operation.Operation;

import java.util.List;

public class MultiplicationOperation implements Operation {
    @Override
    public String getName() {
        return "Multiplicação";
    }

    @Override
    public char getSymbol() {
        return 'M';
    }

    @Override
    public double resolveOperation(List<Double> numbers) {
        double multiplication = 0;
        for (Double number : numbers) {
            multiplication *= number;
        }
        return multiplication;
    }
}
