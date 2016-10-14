import java.lang.reflect.Array;
import java.util.ArrayList;
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
		double[][] tester={{1,2,3},{4,5,6},{23,8,9}, {10,9,5}};
		System.out.println(toString(getCols(tester, 0,2)));
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
	public static double[] getCol(double[][]arr, int column){
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
	public double[] getRow(int row){
		double[] rowValues=new double[data[0].length];
		for(int column=0; column<data[0].length; column++){
			rowValues[column]=data[row][column];
		}
		return rowValues;
	}
	
	public double[] getRow(String columnName){
		int row=getIndex(columnNames, columnName);
		return this.getRow(row);
	}
	/**
	 * Returns index of word in a input String array
	 * @param words String array to search word from
	 * @param word Word that is being searched for
	 * @return index location of word in the String array
	 */
	public static int getIndex(String[] words, String word){
		for(int i=0; i<words.length;i++){
			if(word.equals(words[i]))	return i;
		}
		return -1;
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
		double[][] rows=new double[endRow-startRow][arr.length];
		int rowIndex=0;
		for(int row=startRow; row<endRow; row++){
			double[] singleRow=getRow(arr, row);
			rows=addRowValue(rows,singleRow,rowIndex);
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
	public static ArrayList<String> toString(double[][] arr){
		ArrayList<String> values=new ArrayList<String>();
		for(int rowCounter=0; rowCounter<arr.length; rowCounter++){
			values.add(Arrays.toString(getRow(arr,rowCounter)));
		}
		return values;
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
	 * Adds a col of values in a 1d double array to 2d double array
	 * @param arr   2d array to add a row of values to
	 * @param values  1d double array of values to add to 2d array
	 * @param col the col index of the 2d array to add the col values to
	 * @return  2d double array with the added col of values
	 */
	public static double[][] addColValue(double[][] arr, double[] values, int col){
		for(int i=0; i<values.length; i++){
			arr[col][i]=values[i];
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
		double[][] cols=new double[endCol-startCol][arr.length];
		int colIndex=0;
		for(int col=startCol; col<endCol; col++){
			double[] singleCol=getCol(arr, col);
			cols=addColValue(cols,singleCol,colIndex);
			colIndex++;
		}
		return cols;
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
