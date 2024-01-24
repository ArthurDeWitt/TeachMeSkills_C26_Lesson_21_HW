package by.tms.lesson21.calculator.service;

import by.tms.lesson21.calculator.model.Operation;

/**
 * @author Simon Pirko on 22.01.24
 */


// alw by value
public class OperationService {

	public Operation calculate(Operation operation) {
		switch (operation.getOperation()) {
			case "SUM":
				operation.setResult(operation.getNum1() + operation.getNum2());
				break;
			case "SUB":
				operation.setResult(subtract(operation.getNum1(), operation.getNum2()));
				break;
			case "MULTI":
				operation.setResult(operation.getNum1() * operation.getNum2());
				break;
			case "DIV":
				operation.setResult(divide(operation.getNum1(), operation.getNum2()));
				break;
			default:
				throw new IllegalArgumentException("Invalid operation.");
		}
		return operation;
	}

	public double subtract(double num1, double num2) {
		return num1 - num2;
	}

	public double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public double divide(double num1, double num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("Division by zero is not allowed.");
		}
		return num1 / num2;
	}
}
