package br.com.thiaago.calculadora.controller;

import br.com.thiaago.calculadora.operation.Operation;
import br.com.thiaago.calculadora.operation.impl.AdditionOperation;
import br.com.thiaago.calculadora.operation.impl.MultiplicationOperation;
import br.com.thiaago.calculadora.operation.impl.SubtractionOperation;

import java.util.List;

public class OperationController {

    private List<Operation> operations;

    public OperationController(List<Operation> operations) {
        this.operations = operations;
        this.operations.add(new AdditionOperation());
        this.operations.add(new SubtractionOperation());
        this.operations.add(new MultiplicationOperation());
        this.operations.add(new SubtractionOperation());
    }

    public List<Operation> getOperations() {
        return operations;
    }
}
