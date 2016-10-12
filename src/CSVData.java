import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * A class to read/wrote numerical CSV files and allow easy access to values
 * @author schen625
 *
 */
public class CSVData {
	private double[][] data;
	private String[] columnNames;
	
	public static void main(String[] args){
		double[][] tester={{1,2,3},{4,5,6},{23,8,9}};
		System.out.println(Arrays.toString(getRows(tester, 0,2)));
	}
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
	
	public static double[] getRow(double[][]arr, String columnName){
		return null;
	}
	/***
	 * Returns a 2d array representing the rows of arr starting with startRow up to but
	 * not including endRow
	 * @param arr
	 * 			the array to extract rows from
	 * @param startRow
	 * 			index of starting row
	 * @param endRow
	 * 			index of ending row (return value does not include this row)
	 * @return a 2D array whose size is (endRow-startRow) by arr[0].length that
	 * 			represents the row of arr starting with startRow up to but not including
	 *			endRow
	 */
	public static double[][] getRows(double[][] arr, int startRow, int endRow){
		double[][] rows=new double[endRow-startRow][arr[0].length];
		int rowIndex=0;
		for(int row=startRow; row<endRow; row++){
			double[] singleRow=getRow(arr, row);
			rows=addRowValue(rows,singleRow,rowIndex);
			System.out.println(Arrays.toString(rows));
			rowIndex++;
		}
		return rows;
	}
	/**
	 * Returns a 2d array in String
	 * @param arr	
	 * 			the array to convert to String
	 * @return 
	 * 			String array 
	 */
	public static String[][] toString(double[][] arr){
		String[][]values=new String[arr.length][arr[0].length];
		int rowCounter=0;
		for(int col=0; col<arr.length; col++){
			
			values[col][col]=Arrays.toString(arr[col][col]);
		}
	}
	/**
	 * Adds a row of values in a 1d double array to 2d double array
	 * @param arr	2d array to add a row of values to
	 * @param values	1d double array of values to add to 2d array
	 * @param row	the row index of the 2d array to add the row values to
	 * @return	2d double array with the added row of values
	 */
	public static double[][] addRowValue(double[][] arr, double[] values, int row){
		for(int i=0; i<values.length; i++){
			arr[row][i]=values[i];
		}
		return arr;
	}
	/**
	 * Return a 2d array representing the cols of arr starting with startCol up to but not
	 * including endCol.
	 * @param arr
	 * 			the array to extract columns from
	 * @param startCol
	 * 			index of starting column
	 * @param endCol
	 * 			index of ending column (return value does not include this column)
	 * @return	a 2d array whose size is arr.length by (endCol-startCol) that represents the 
	 * columns of arr starting with startCol up to but not including endCol
	 */
	public static double[][] getCols(double[][] arr, int startCol, int endCol){
		return null;
	}
	/**
	 *  Return a 2d array representing the cols of arr in the column indexes from the int input 
	 *  array.
	 * @param arr
	 * 			the array to extract columns from
	 * @param colIndexes
	 * 			the column indexes from the int input
	 * @return a 2d array that represents the 
	 * columns of arr indexes
	 * 
	 */
	public static double[][] getCols(double[][] arr, int[] colIndexes){
		return null;
	}
	/**
	 *  Return a 2d array representing the cols of arr in the column indexes from the int input 
	 *  array.
	 * @param colNames 
	 * 			String of column Names to extract column data from
	 * @return a 2d array that represents the columns of String colNames indexes
	 */
	public static double[][] getCols(String[] colNames){
		return null;
	}
	
	public static void setColumn(double[][] arr, int columnIndex, double[] vals){
	
	}
	
	public static void setRow(double[][] arr, int rowIndex, double[] vals){
		
	}
	
	public static void setValue(double[][] arr, int rowIndex, int columnIndex){
	
	}
	
	public static String[] getColumnTitles(double[][] arr){
		return null;
	}
	
	public static double[][] setCSVData(double[][] arr){
		return null;
	}
	public static void saveToFile(String filename){
		
	}
}
