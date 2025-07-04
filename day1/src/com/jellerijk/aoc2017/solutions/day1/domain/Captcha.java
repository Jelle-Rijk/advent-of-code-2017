package com.jellerijk.aoc2017.solutions.day1.domain;

public class Captcha {
	private String content;

	public Captcha(String content) {
		setContent(content);
	}

	private void setContent(String content) {
		if (content == null || content.isBlank())
			throw new IllegalArgumentException("The captcha's content cannot be blank.");
		if (!content.trim().matches("\\d+"))
			throw new IllegalArgumentException("Captcha's content should consist entirely out of digits.");
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}
