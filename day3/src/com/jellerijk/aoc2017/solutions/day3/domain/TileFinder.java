package com.jellerijk.aoc2017.solutions.day3.domain;

import com.jellerijk.aoc2017.solutions.day3.utils.Direction;

public class TileFinder {

	private int targetValue;
	final private Tile accessPort;
	Tile target;

	public TileFinder(int targetValue) {
		this.accessPort = new Tile(0, 0, 1);
		setTargetValue(targetValue);
	}

	public void findTarget() {
		Direction dir = Direction.RIGHT;
		int distance = 1;
		Tile currentTile = accessPort;
		boolean incrementDistance = false;

		// FIND A VALUE BIGGER THAN TARGET
		while (currentTile.getValue() < targetValue) {
			currentTile = currentTile.findTileInDirection(dir, distance);

			if (incrementDistance)
				distance += 1;
			incrementDistance = !incrementDistance;

			dir = Direction.next(dir);
		}

		int backtrackDistance = targetValue - currentTile.getValue();
		target = currentTile.findTileInDirection(Direction.previous(dir), backtrackDistance);
	}

	public int calculateManhattanDistance() {
		return Math.abs(accessPort.getX() - target.getX()) + Math.abs(accessPort.getY() - target.getY());
	}

	private void setTargetValue(int targetValue) {
		if (targetValue <= 0)
			throw new IllegalArgumentException("Target Value needs to be a positive integer");
		this.targetValue = targetValue;
	}
}
