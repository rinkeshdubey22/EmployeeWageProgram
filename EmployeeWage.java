
public class EmployeeWage {
	public static void main(String[] args) {
	// Constraints
	int Is_Full_Time = 1;
	int Is_Part_Time = 2;
	int Wage_Per_Hour = 20;
	// Variables
	int empHrs = 0;
	int empWage = 0;
		// Computation
		double empCheck = Math.floor(Math.random() * 10) %3;
		if (empCheck == Is_Full_Time) {
			 empHrs = 8;
		}
		else if (empCheck == Is_Part_Time) {
			empHrs = 4;
		}
		else {
			empHrs = 0;
		}
	empWage = empHrs * Wage_Per_Hour;
	System.out.println("Employee Wage: " + empWage);
	}
}
