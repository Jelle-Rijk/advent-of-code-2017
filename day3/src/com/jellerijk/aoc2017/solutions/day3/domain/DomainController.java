package com.jellerijk.aoc2017.solutions.day3.domain;

import com.jellerijk.aoc2017.common.java.interfaces.Subscriber;
import com.jellerijk.aoc2017.common.java.utils.outputs.IntegerOutput;

public class DomainController {
	private IntegerOutput manhattanDistanceToTarget;
	private IntegerOutput minStressTestValue;

	public DomainController() {
		manhattanDistanceToTarget = new IntegerOutput();
		minStressTestValue = new IntegerOutput();
	}

	public void inputTargetSquare(int target) {
		TileFinder finder = new TileFinder(target);
		finder.findTarget();
		manhattanDistanceToTarget.setOutput(finder.calculateManhattanDistance());

		StressTester stressTester = new StressTester(target);
		minStressTestValue.setOutput(stressTester.findFirstAboveTarget());
	}

	public void subscribeToManhattanDistance(Subscriber sub) {
		manhattanDistanceToTarget.addSubscriber(sub);
	}

	public void subscribeToMinStressTestValue(Subscriber sub) {
		minStressTestValue.addSubscriber(sub);
	}

}
