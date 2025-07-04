package com.jellerijk.aoc2017.solutions.day3.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import com.jellerijk.aoc2017.solutions.day3.utils.Direction;

public class StressTester {
	final int targetValue;

	final List<Tile> calculatedTiles;

	public StressTester(int targetValue) {
		if (targetValue <= 0)
			throw new IllegalArgumentException("Stress test target must be at least 1.");
		this.targetValue = targetValue;
		this.calculatedTiles = new ArrayList<Tile>();
	}

	public int findFirstAboveTarget() {
		Tile currentTile = new Tile(0, 0, 1);
		calculatedTiles.add(currentTile);
		Direction dir = Direction.RIGHT;

		int distance = 1;
		int traversedDistance = 0;
		boolean incrementDistance = false;

		while (currentTile.getValue() <= targetValue) {
			currentTile = calculateNewTile(dir, currentTile);
			traversedDistance++;

			// Corner reached, turn around
			if (traversedDistance == distance) {
				traversedDistance = 0;
				dir = Direction.next(dir);
				if (incrementDistance)
					distance++;
				incrementDistance = !incrementDistance; // Distance should go up by 1 every other corner.
			}
		}
		return currentTile.getValue();
	}

	private Tile calculateNewTile(Direction dir, Tile prevTile) {
		Tile tile = prevTile.findTileInDirection(dir, 1);
		tile.setValue(findAdjacentValue(tile));
		System.out.println(tile);
		calculatedTiles.add(tile);
		return tile;
	}

	private int findAdjacentValue(Tile tile) {
		int adjacentValue = 0;

		for (int x = -1; x < 2; x++) {
			for (int y = -1; y < 2; y++) {
				if (x == 0 && y == 0)
					continue;
				adjacentValue += getTileValue(tile.getX() + x, tile.getY() + y);
			}
		}
		return adjacentValue;
	}

	private int getTileValue(int x, int y) {
		int value;
		try {
			Tile tile = calculatedTiles.stream().filter(t -> t.getX() == x && t.getY() == y).findFirst().orElseThrow();
			value = tile.getValue();
		} catch (NoSuchElementException nse) {
			value = 0;
		}
		return value;
	}

}
