package domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SpreadsheetRow {
	List<Integer> numbers;

	public SpreadsheetRow(List<Integer> numbers) {
		setNumbers(numbers);
	}

	public SpreadsheetRow(String numbersString) {
		this(convertStringToInts(numbersString));
	}

	/*
	 * PUBLIC
	 */
	public int calculateDifferenceBetweenMinAndMax() {
		return findMax(numbers) - findMin(numbers);
	}

	public int calculateEvenlyDivisible() {
		List<Integer> numbers = new ArrayList<Integer>(this.numbers);

		int dividend = 0;
		while (!numbers.isEmpty()) {
			dividend = findMax(numbers);
			numbers.remove(numbers.indexOf(dividend));
			for (int divisor : numbers) {
				if (dividend % divisor == 0)
					return dividend / divisor;
			}
		}
		throw new IllegalArgumentException(String.format("Did not find evenly divisible pair: %s", this.toString()));
	}

	/*
	 * HELPERS
	 */
	private static List<Integer> convertStringToInts(String input) {
		Pattern numberPattern = Pattern.compile("\\d+");
		Matcher numberMatcher = numberPattern.matcher(input);

		List<Integer> ints = new ArrayList<Integer>();

		while (numberMatcher.find()) {
			try {
				ints.add(Integer.parseInt(numberMatcher.group()));
			} catch (NumberFormatException nfe) {
				System.err.println("Wrong pattern");
			}
		}
		return ints;
	}

	private Integer findMax(List<Integer> numbers) {
		return numbers.stream().max(Comparator.naturalOrder()).orElseThrow();
	}

	private Integer findMin(List<Integer> numbers) {
		return numbers.stream().min(Comparator.naturalOrder()).orElseThrow();
	}

	/*
	 * GETTERS / SETTERS
	 */

	public void setNumbers(List<Integer> numbers) {
		if (numbers.isEmpty())
			throw new IllegalArgumentException("A SpreadsheetRow needs numbers");
		this.numbers = numbers;
	}

	/*
	 * OBJECT OVERRIDE
	 */

	@Override
	public String toString() {
		return numbers.stream().map(number -> number.toString()).collect(Collectors.joining("\t"));
	}

}
