package com.jellerijk.aoc2017.solutions.day2.domain;

import com.jellerijk.aoc2017.common.java.interfaces.Subscriber;
import com.jellerijk.aoc2017.common.java.utils.outputs.IntegerOutput;

public class DomainController {
	Spreadsheet spreadsheet;

	IntegerOutput part1;
	IntegerOutput part2;

	public DomainController() {
		part1 = new IntegerOutput();
		part2 = new IntegerOutput();
	}

	public void enterInput(String puzzleInput) {
		spreadsheet = new Spreadsheet();
		InputParser.processInput(spreadsheet, puzzleInput);
		part1.setOutput(spreadsheet.calculateChecksum());
		part2.setOutput(spreadsheet.calculateUserOutput());
	}

	public void subscribeToPart1(Subscriber sub) {
		part1.addSubscriber(sub);
	}

	public void subscribeToPart2(Subscriber sub) {
		part2.addSubscriber(sub);
	}
}
