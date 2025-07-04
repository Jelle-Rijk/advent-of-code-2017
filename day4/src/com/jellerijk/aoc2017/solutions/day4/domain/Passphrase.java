package com.jellerijk.aoc2017.solutions.day4.domain;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Passphrase {
	String[] passwords;

	public Passphrase(String phrase) {
		setPasswords(phrase.split(" "));
	}

	public boolean hasDuplicates() {
		int uniqueWords = (int) Arrays.stream(passwords).distinct().count();
		return uniqueWords != passwords.length;
	}

	public boolean hasAnagrams() {
		String[] sortedLetters = new String[passwords.length];
		int index = 0;
		for (String s : passwords) {
			sortedLetters[index] = Arrays.stream(s.split("")).sorted().collect(Collectors.joining(""));
			index++;
		}

		return passwords.length != Arrays.stream(sortedLetters).distinct().count();
	}

	private void setPasswords(String[] passwords) {
		if (passwords == null || passwords.length == 0)
			throw new IllegalArgumentException("Every passphrase needs at least one password.");
		this.passwords = passwords;
	}

}
