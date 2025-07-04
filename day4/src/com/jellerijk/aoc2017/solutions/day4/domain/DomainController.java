package com.jellerijk.aoc2017.solutions.day4.domain;

import com.jellerijk.aoc2017.common.java.interfaces.Subscriber;
import com.jellerijk.aoc2017.common.java.utils.outputs.IntegerOutput;

public class DomainController {
	IntegerOutput validPhrases;
	IntegerOutput withoutAnagrams;

	public DomainController() {
		validPhrases = new IntegerOutput();
		withoutAnagrams = new IntegerOutput();
	}

	public void enterInput(String input) {
		int valid = 0;
		int noAnagrams = 0;
		for (String line : input.split("\n")) {
			Passphrase pp = new Passphrase(line);
			valid += pp.hasDuplicates() ? 0 : 1;
			noAnagrams += pp.hasAnagrams() ? 0 : 1;
		}
		validPhrases.setOutput(valid);
		withoutAnagrams.setOutput(noAnagrams);
	}

	public void subscribeToPart1(Subscriber sub) {
		validPhrases.addSubscriber(sub);
	}

	public void subscribeToPart2(Subscriber sub) {
		withoutAnagrams.addSubscriber(sub);
	}

}
