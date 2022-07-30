package employeeWage;

import java.util.Random;

public class UC1{
	static int WAGE_PER_HOUR=20;
	static int FULL_DAY_HOUR=8;
	static int PART_TIME_HOURS=4;
	static int IS_PARTTIME=1;
	static int IS_FULLTIME=2;
	
	static int Daily_emp_wage;
	static int emp_wage;
	static int attendance=0;

	public static void AttendanceCheck() {
		System.out.println("Welcome to Employee Wage Computation Program");
		 int Attendance;
		 WelcomeEmpWage obj = new WelcomeEmpWage();

		String[] att = { "Absent", "Present" };
		Random check = new Random();
		int attend = check.nextInt(att.length);
		if (att[attend].equals("Absent")) {
			System.out.println("Employee is Absent");
		} else if (att[attend].equals("Present")) {
			System.out.println("Employee is Present");
		}

	}
	
	public static void DailyEmpWage()  {
		 WelcomeEmpWage obj = new WelcomeEmpWage();
		int Daily_emp_wage = WAGE_PER_HOUR*FULL_DAY_HOUR;
		System.out.println("Daily Employee Wage: " + Daily_emp_wage);
	}
	
	public static void PartTimeWage() {
		int emp_wage = PART_TIME_HOURS*WAGE_PER_HOUR;
		System.out.println("Part Time Employee Wage: "+ emp_wage);
	}
	
	public static void Switch() {
		Daily_emp_wage = WAGE_PER_HOUR*FULL_DAY_HOUR;
		emp_wage = PART_TIME_HOURS*WAGE_PER_HOUR;
		int empAttendance = (int) Math.floor(Math.random() * 10 % 3);
		
		switch(empAttendance) {
		case 1:
			System.out.println("Part time Employee wage = " + Daily_emp_wage);
			break;
		case 2:
			System.out.println("Full time Employee wage = " + emp_wage);
			break;
		default:
			System.out.println("Employee wage = " + 0);
		}

		
       
	}	
}	

	
