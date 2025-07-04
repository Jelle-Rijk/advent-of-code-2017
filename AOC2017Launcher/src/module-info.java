module com.jellerijk.aoc2017.launcher {
	requires com.jellerijk.aoc2017.solutions.day1;
	requires com.jellerijk.aoc2017.solutions.day2;

	exports com.jellerijk.aoc2017.launcher.java.main to javafx.graphics;
	exports com.jellerijk.aoc2017.launcher.java.gui to javafx.graphics;
}