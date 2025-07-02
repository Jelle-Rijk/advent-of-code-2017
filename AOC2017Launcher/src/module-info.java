module com.jellerijk.aoc2017.launcher {
	requires transitive javafx.controls;

	requires com.jellerijk.aoc17.day1;

	exports com.jellerijk.aoc2017.launcher.java.main to javafx.graphics;
	exports com.jellerijk.aoc2017.launcher.java.gui to javafx.graphics;
}