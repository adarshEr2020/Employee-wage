
public class EmployeeWage {
	//Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    // Method for calculate EmployeeWage
    public static int computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth )
    {
            // Variables
            int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
            // Computation
            while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
            {
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
                    System.out.println("Day#:" +totalWorkingDays +" Emp Hour :" + empHrs);
            }
            int totalEmpWage = totalEmpHrs * empRatePerHour;
            System.out.println("Total Employee Wage for compuny:" +company+ "is : "+ totalEmpWage);
            return totalEmpWage;
    }

    // Main method here
    public static void main(String args[])
    {
            computeEmpWage("DMart", 20, 2, 10);
            computeEmpWage("DMart", 20, 2, 10);
    }
}
