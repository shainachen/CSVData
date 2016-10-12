import java.util.Arrays;

/**
 * A class to read/wrote numerical CSV files and allow easy access to values
 * @author schen625
 *
 */
public class CSVData {
	public static void main(String[] args){
		double[][]arr={{1,2,3},{4,5,6},{23,8,9}};
		System.out.println(Arrays.toString(getRow(arr, 1)));
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
