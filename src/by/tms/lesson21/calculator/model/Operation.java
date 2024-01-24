package by.tms.lesson21.calculator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @author Simon Pirko on 22.01.24
 */

//lombok

	@Data
	@RequiredArgsConstructor
public class Operation {
	private final double num1;
	private final double num2;
	private final String operation;
	private double result;
}
