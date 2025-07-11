package com.jellerijk.aoc2017.solutions.day1.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptchaSolver {
	private final Captcha c;

	public CaptchaSolver(Captcha c) {
		if (c == null)
			throw new IllegalArgumentException("No captcha was set");
		this.c = c;
	}

	public int calculateSumOfDoubleDigits() {
		String content = c.getContent();
		Pattern pattern = Pattern.compile("(\\d)(?=\\1)");
		Matcher doubleMatcher = pattern.matcher(content);

		int sum = 0;
		while (doubleMatcher.find()) {
			sum += Integer.parseInt(doubleMatcher.group());
		}
		if (content.charAt(0) == content.charAt(content.length() - 1))
			sum += Character.getNumericValue(content.charAt(0));
		return sum;
	}

	public int calculateSumOfOpposites() {
		String content = c.getContent();
		int steps = content.length() / 2;

		int sum = 0;
		for (int i = 0; i < content.length(); i++) {
			if (content.charAt(i) == content.charAt((i + steps) % content.length()))
				sum += Character.getNumericValue(content.charAt(i));
		}
		return sum;
	}
}
