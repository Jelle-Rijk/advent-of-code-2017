/**
 * 
 */
/**
 * 
 */
module com.jellerijk.aoc17.day1 {
	requires org.junit.jupiter.api;
	requires transitive javafx.controls;
	requires org.junit.jupiter.params;

	opens gui to javafx.graphics;
	opens com.jellerijk.aoc17.day1.main to javafx.graphics;

	exports com.jellerijk.aoc17.day1.main;
}