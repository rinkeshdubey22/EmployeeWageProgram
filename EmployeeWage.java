
public class EmployeeWage {
	public static final int Is_Full_Time = 1;
	public static final int Is_Part_Time = 2;
	public static final int Wage_Per_Hour = 20;
	public static final int Num_Of_Woking_Days = 20;
	public static void main(String[] args) {
	// Variables
	int empHrs = 0, empWage = 0, totalEmpWage = 0;
		// Computation
		for (int day = 0; day <  Num_Of_Woking_Days; day++) {
		int empCheck = (int) Math.floor(Math.random() * 10) %3;
		switch (empCheck) {
			case Is_Full_Time:
				empHrs = 8;
				break;
			case Is_Part_Time:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
		}
			empWage = empHrs * Wage_Per_Hour;
			totalEmpWage += empWage;
			System.out.println("Employee Wage: " + empWage);
		}
		System.out.println("Total Employee Wage: " + totalEmpWage);
	}
}
