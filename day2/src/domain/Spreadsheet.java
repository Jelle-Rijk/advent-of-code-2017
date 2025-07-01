package domain;

import java.util.ArrayList;
import java.util.List;

public class Spreadsheet {
	List<SpreadsheetRow> rows;

	public Spreadsheet() {
		setRows(new ArrayList<SpreadsheetRow>());
	}

	/*
	 * PUBLIC
	 */

	public void addRow(SpreadsheetRow row) {
		rows.add(row);
	}

	public int calculateChecksum() {
		return rows.stream().mapToInt(row -> row.calculateDifferenceBetweenMinAndMax()).reduce(0, Integer::sum);
	}

	public int calculateUserOutput() {
		return rows.stream().mapToInt(row -> row.calculateEvenlyDivisible()).reduce(0, Integer::sum);
	}

	/*
	 * GETTERS / SETTERS
	 */

	private final void setRows(List<SpreadsheetRow> rows) {
		this.rows = rows;
	}

}
