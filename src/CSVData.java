import java.util.Arrays;

/**
 * A class to read/wrote numerical CSV files and allow easy access to values
 * @author schen625
 *
 */
public class CSVData {
	private double[][] data;
	private String[] columnNames;
	/***
	 * Returns a new CSV Data object for the file, ignoring lines at the top. Input String array
	 * gives the column names.
	 * @param filename the file to read
	 * @param numLinesToIgnore number of lines at the top to ignore
	 * @param columnNames names of the columns
	 * @return a CSVData object for that file
	 */
	public static CSVData readCSVFile(String filename, int numLinesToIgnore, String[] columnNames){
		return null;
	}
	/***
	 * Returns a new CSV Data object for the file, ignoring lines at the top. It uses the first row
	 * as the column names. All other data is stored as doubles.
	 * @param filename the file to read
	 * @param numLinesToIgnore number of lines at the top to ignore
	 * @return a CSVData object for that file
	 */
	public static CSVData readCSVFile(String filename, int numLinesToIgnore){
		return null;
	}
	
	/**
	 * Returns a 1d array representing a column of the 2D array arr.
	 * @param arr
	 * 			the 2D array to extract a column from
	 * @param column
	 * 			the index of the column to extract
	 * @return a 1D array that's a copy of the row at index column.
	 */
	public static double[] getColumn(double[][]arr, int column){
		double[] columnValues=new double[arr.length];
		for(int row=0; row<arr.length; row++){
			columnValues[row]=arr[row][column];
		}
		return columnValues;
	}
	/**
	 * Returns a 1d array representing a row of the 2D array arr.
	 * @param arr
	 * 			the 2D array to extract a row from
	 * @param row
	 * 			the index of the row to extract
	 * @return a 1D array that's a copy of the row at index row.
	 */
	public static double[] getRow(double[][]arr, int row){
		double[] rowValues=new double[arr[0].length];
		for(int column=0; column<arr[0].length; column++){
			rowValues[column]=arr[row][column];
		}
		return rowValues;
	}

}
