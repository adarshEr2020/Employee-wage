package empwage;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program :");
		// constants
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		// variable
		int empHrs = 0;
		int empWage = 0;
		//computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else
			empHrs = 0;

		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage :" +empWage);
	}
}


