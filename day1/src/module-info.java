
module day1 {
	requires org.junit.jupiter.api;
	requires transitive javafx.controls;
	requires org.junit.jupiter.params;

	opens gui to javafx.graphics;
	opens main to javafx.graphics;
}