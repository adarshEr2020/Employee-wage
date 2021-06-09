package empwage;

public class EmployeeWage {
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	// Method for calculate EmployeeWage
	public static int computeEmpWage()
	{
		// Variables
		int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;
		// Comptation
		while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
		{
			int empHrs = 0;
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck)
			{
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
				 	empHrs = 0;
			}
			totalEmpHrs += empHrs;
			int empWage = empHrs * EMP_RATE_PER_HOUR ;
			System.out.println("Employee Wage :" + empWage);
			totalEmpWage += empWage;
		}
		System.out.println("Employee Wage :" + totalEmpWage);
		return totalEmpWage;
	}

	// Main method here
	public static void main(String args[])
	{
		computeEmpWage();
	}
}
