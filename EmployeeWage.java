package empwage;

public class EmployeeWage {
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public EmployeeWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth =  maxHoursPerMonth;
	}

	// Method for calculate EmployeeWage
	public void computeEmpWage()
	{
		// Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		// Computation
		while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
		{
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck)
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
			System.out.println("Day#:" +totalWorkingDays +" Emp Hour :" + empHrs);
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}

	@Override
	public String toString() {
		return "Total Employee Wage for company:" +company+ " is : "+ totalEmpWage;
	}
	// Main method here
	public static void main(String[] args)
	{
		EmployeeWage dmart = new EmployeeWage("Dmart", 20,2,10);
		EmployeeWage reliance = new EmployeeWage("Reliance",10,4,20);
		dmart.computeEmpWage();
		System.out.println(dmart);
		reliance.computeEmpWage();
		System.out.println(reliance);
	}
}
