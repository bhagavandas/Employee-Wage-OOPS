package employeeWage;

public class UC2 {
	public static void DailyEmpWage()  {
		 WelcomeEmpWage obj = new WelcomeEmpWage();
		//UC2 obj =new UC2();
		int WAGE_PER_HOUR=20;
		int FULL_DAY_HOUR=8;
		int Daily_emp_wage = WAGE_PER_HOUR*FULL_DAY_HOUR;
		System.out.println("Daily Employee Wage: " + Daily_emp_wage);
	}

}
