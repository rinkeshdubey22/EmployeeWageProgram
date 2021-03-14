
public class EmployeeWage {
	public static void main(String[] args) {
	// Constraints
	int Is_Full_Time = 1;
	int Wage_Per_Hour = 20;
	// Variables
	int empHrs = 0;
	int empWage = 0;
		// Computation
		double empCheck = Math.floor(Math.random() * 10) %2;
		if (empCheck == Is_Full_Time) {
			 empHrs = 8;
		}
		else {
			empHrs = 0;
		}
	empWage = empHrs * Wage_Per_Hour;
	System.out.println("Employee Wage: " + empWage);
	}
}
