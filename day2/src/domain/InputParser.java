package domain;

public abstract class InputParser {
	public static void processInput(Spreadsheet ss, String puzzleInput) {
		for (String line : puzzleInput.split("\n")) {
			SpreadsheetRow row = new SpreadsheetRow(line);
			ss.addRow(row);
			System.out.println(row.toString());
		}
	};
}
