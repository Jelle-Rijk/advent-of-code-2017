/**
 * 
 */
/**
 * 
 */
module UtilsTest {
	requires javafx.graphics;
	requires transitive com.jellerijk.aoc2017.common;

	opens main to javafx.graphics;

	exports main;
}