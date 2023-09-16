package br.com.thiaago.calculadora.operation;

import java.util.List;

public interface Operation {

    String getName();

    char getSymbol();

    double resolveOperation(List<Double> numbers);

}
