package domain;

public class DomainController {
	Spreadsheet spreadsheet;

	public void enterInput(String puzzleInput) {
		spreadsheet = new Spreadsheet();
		InputParser.processInput(spreadsheet, puzzleInput);
	}

	public int getChecksum() {
		return spreadsheet.calculateChecksum();
	}

	public int getUserOutput() {
		return spreadsheet.calculateUserOutput();
	}
}
