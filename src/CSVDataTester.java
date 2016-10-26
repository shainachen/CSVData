import java.util.Arrays;

public class CSVDataTester {
	public static void main(String[] args){
		String[] columnNames={"time", "gyro-x", "gyro-y", "gyro-z"};
		CSVData test=new CSVData("E:\\Shaina\\11th grade\\AP Comp Sci\\GyroTest2out.csv",columnNames,1 );
		
		System.out.println(Arrays.toString(test.getCol(3)));
	}
}
