module com.jellerijk.aoc17.launcher {
	requires transitive javafx.controls;

	requires com.jellerijk.aoc17.day1;
	requires javafx.graphics;

	exports com.jellerijk.aoc17.launcher.java.main to javafx.graphics;
	exports com.jellerijk.aoc17.launcher.java.gui to javafx.graphics;
}