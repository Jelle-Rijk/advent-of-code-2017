package com.jellerijk.aoc2017.solutions.day3.utils;

public enum Direction {
	RIGHT, UP, LEFT, DOWN;

	public static Direction next(Direction dir) {
		switch (dir) {
		case RIGHT:
			return UP;
		case UP:
			return LEFT;
		case LEFT:
			return DOWN;
		case DOWN:
			return RIGHT;
		default:
			throw new IllegalArgumentException("Invalid direction");
		}

	}

	public static Direction reverse(Direction dir) {
		switch (dir) {
		case DOWN:
			return UP;
		case UP:
			return DOWN;
		case LEFT:
			return RIGHT;
		case RIGHT:
			return LEFT;
		default:
			throw new IllegalArgumentException("Invalid direction");
		}
	}

	public static Direction previous(Direction dir) {
		switch (dir) {
		case RIGHT:
			return DOWN;
		case UP:
			return RIGHT;
		case LEFT:
			return UP;
		case DOWN:
			return LEFT;
		default:
			throw new IllegalArgumentException("Invalid direction");
		}
	}
}
