package br.com.thiaago.calculadora.operation.impl;

import br.com.thiaago.calculadora.operation.Operation;

import java.util.List;

public class AdditionOperation implements Operation {
    @Override
    public String getName() {
        return "Adição";
    }

    @Override
    public char getSymbol() {
        return 'A';
    }

    @Override
    public double resolveOperation(List<Double> numbers) {
        double sum = 0;
        for (Double number : numbers) {
            sum += number;
        }
        return sum;
    }
}
