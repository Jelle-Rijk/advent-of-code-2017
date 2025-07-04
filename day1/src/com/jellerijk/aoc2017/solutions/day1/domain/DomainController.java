package com.jellerijk.aoc2017.solutions.day1.domain;

import com.jellerijk.aoc2017.common.java.interfaces.OutputSubscriber;
import com.jellerijk.aoc2017.common.java.utils.outputs.IntegerOutput;

public class DomainController {
	private Captcha captcha;

	private IntegerOutput part1;
	private IntegerOutput part2;

	public DomainController() {
		part1 = new IntegerOutput();
		part2 = new IntegerOutput();
	}

	public void enterPuzzleInput(String input) throws IllegalArgumentException {
		captcha = new Captcha(input);
		CaptchaSolver solver = new CaptchaSolver(captcha);
		part1.setOutput(solver.calculateSumOfDoubleDigits());
		part2.setOutput(solver.calculateSumOfOpposites());
	}

	public void subscribetoPart1(OutputSubscriber sub) {
		part1.addSubscriber(sub);
	}

	public void subscribetoPart2(OutputSubscriber sub) {
		part2.addSubscriber(sub);
	}
}
