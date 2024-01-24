package by.tms.lesson21.calculator.console;

import by.tms.lesson21.calculator.model.Operation;
import by.tms.lesson21.calculator.service.OperationService;

/**
 * @author Simon Pirko on 22.01.24
 */
public class ConsoleApplication {

	private final OperationService operationService = new OperationService();
	private final ConsoleReader consoleReader = new ConsoleReader();
	private final ConsoleWriter consoleWriter = new ConsoleWriter();

	public void run() {
		while (true) {
			consoleWriter.write("Enter num 1");
			double num1 = consoleReader.readNum();
			consoleWriter.write("Enter num 2");
			double num2 = consoleReader.readNum();
			consoleWriter.write("Enter operation type ('+', '-', '*', '/', 'q')");
			String type = consoleReader.readOperationType();
			if (type.equalsIgnoreCase("q")) {
				break;
			}
			Operation operation = new Operation(num1, num2, type);
			Operation calculate = operationService.calculate(operation);
			consoleWriter.write("Result = " + calculate.getResult());
		}
	}
}
