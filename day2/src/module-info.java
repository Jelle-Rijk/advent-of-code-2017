
module day2 {
	requires transitive javafx.controls;

	opens main to javafx.graphics;
	opens gui to javafx.graphics;
}