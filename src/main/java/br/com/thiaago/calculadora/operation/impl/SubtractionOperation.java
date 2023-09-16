package br.com.thiaago.calculadora.operation.impl;

import br.com.thiaago.calculadora.operation.Operation;

import java.util.List;

public class SubtractionOperation implements Operation {
    @Override
    public String getName() {
        return "Subtração";
    }

    @Override
    public char getSymbol() {
        return 'S';
    }

    @Override
    public double resolveOperation(List<Double> numbers) {
        double subtraction = 0;
        for (Double number : numbers) {
            subtraction -= number;
        }
        return subtraction;
    }
}
