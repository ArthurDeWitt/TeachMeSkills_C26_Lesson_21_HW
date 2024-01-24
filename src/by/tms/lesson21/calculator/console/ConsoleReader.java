package by.tms.lesson21.calculator.console;

import java.util.Scanner;

/**
 * @author Simon Pirko on 22.01.24
 */
public class ConsoleReader {
	private final Scanner scanner = new Scanner(System.in);

	public String readOperationType() {
		return scanner.next(); // "SUM"
	}

	public double readNum() {
		return scanner.nextDouble();
	}
}
