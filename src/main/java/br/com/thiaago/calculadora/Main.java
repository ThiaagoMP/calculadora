package br.com.thiaago.calculadora;

import br.com.thiaago.calculadora.controller.OperationController;
import br.com.thiaago.calculadora.operation.Operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OperationController operationController = new OperationController(new ArrayList<>());
        List<Operation> operations = operationController.getOperations();

        System.out.println("Digite a operação que deseja realizar: ");

        System.out.println("Digite 'A' para adição");
        System.out.println("Digite 'S' para subtração");
        System.out.println("Digite 'M' para multiplicação");
        System.out.println("Digite 'D' para divisão");

        String inputOperation = scanner.nextLine();

        Optional<Operation> optionalOperation = operations.stream().filter(operation -> operation.getSymbol() == inputOperation.charAt(0)).findFirst();

        if (optionalOperation.isEmpty()) {
            System.out.println("Operação invalida;");
            return;
        }

        Operation operation = optionalOperation.get();

        List<Double> numbers = new ArrayList<>();

        System.out.println("Digite os numeros que deseja realizar na operação: ");
        System.out.println("Digite 'exit' para finalizar o programa.");

        while (true) {
            try {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("EXIT"))
                    break;
                numbers.add(Double.parseDouble(input));
            } catch (NumberFormatException exception) {
            }
        }

        double result = operation.resolveOperation(numbers);

        System.out.println("O resultado da operação é: " + result);
    }

}
