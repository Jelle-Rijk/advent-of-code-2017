package com.jellerijk.aoc2017.solutions.day3.domain;

import com.jellerijk.aoc2017.solutions.day3.utils.Direction;

public class Tile {
	private int value;
	private int x;
	private int y;

	public Tile(int x, int y, int value) {
		setX(x);
		setY(y);
		setValue(value);
	}

	public Tile findTileInDirection(Direction dir, int distance) {
		int newX = x;
		int newY = y;
		int newValue = value + distance;

		switch (dir) {
		case DOWN -> newY -= distance;
		case LEFT -> newX -= distance;
		case RIGHT -> newX += distance;
		case UP -> newY += distance;
		default -> throw new IllegalArgumentException("Unexpected value: " + dir);
		}

		return new Tile(newX, newY, newValue);
	}

	@Override
	public String toString() {
		return String.format("%s at x=%d y=%d with value %d", getClass().getSimpleName(), x, y, value);
	}

	/*
	 * GETTERS / SETTERS
	 */

	public final int getValue() {
		return value;
	}

	public final void setValue(int value) {
		this.value = value;
	}

	public final int getX() {
		return x;
	}

	public final void setX(int x) {
		this.x = x;
	}

	public final int getY() {
		return y;
	}

	public final void setY(int y) {
		this.y = y;
	}

}
