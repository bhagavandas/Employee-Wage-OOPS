package employeeWage;

import java.util.Random;
import java.util.Scanner;

public class UC1 {
	static int WAGE_PER_HOUR = 20;
	static int FULL_DAY_HOUR = 8;
	static int PART_TIME_HOURS = 4;
	static int IS_PARTTIME = 1;
	static int IS_FULLTIME = 2;
	static int WORKING_DAYS_PER_MONTH = 20;
	static int employee;
	static int Daily_emp_wage;
	static int emp_wage;
	static int attendance = 0;
	static final int No_of_Working_Days = 20;
	static final int Max_Hrs_In_Month = 100;

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

	public static void DailyEmpWage() {
		WelcomeEmpWage obj = new WelcomeEmpWage();
		int Daily_emp_wage = WAGE_PER_HOUR * FULL_DAY_HOUR;
		System.out.println("Daily Employee Wage: " + Daily_emp_wage);
	}

	public static void PartTimeWage() {
		int emp_wage = PART_TIME_HOURS * WAGE_PER_HOUR;
		System.out.println("Part Time Employee Wage: " + emp_wage);
	}

	public static void Switch() {
		Daily_emp_wage = WAGE_PER_HOUR * FULL_DAY_HOUR;
		emp_wage = PART_TIME_HOURS * WAGE_PER_HOUR;
		int empAttendance = (int) Math.floor(Math.random() * 10 % 3);

		switch (empAttendance) {
		case 1:
			System.out.println("Fulltime Employee wage per Day = " + Daily_emp_wage);
			break;
		case 2:
			System.out.println("Parttime Employee wage per Day = " + emp_wage);
			break;
		default:
			System.out.println("Employee wage = " + 0);
		}
	}

	public static void MonthlyWages() {
		WelcomeEmpWage obj = new WelcomeEmpWage();
		int Fulltime_Monthly_wages = WORKING_DAYS_PER_MONTH * FULL_DAY_HOUR * WAGE_PER_HOUR;
		int Parttime_Monthly_wages = Fulltime_Monthly_wages / 2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1 for Paart time or 2 for Fulltime: ");
		int employee = scan.nextInt();
		if (employee == IS_FULLTIME) {
			System.out.println("Full time employee Monthly wages: " + Fulltime_Monthly_wages);
		} else if (employee == IS_PARTTIME) {
			System.out.println("Part time Employee Monthly wages: " + Parttime_Monthly_wages);
		}
	}
	
	public static void UC6() {
		
		int Total_emp_hrs = 0;
		int emp_hrs = 0;
		int Total_Working_Days = 0;
		while (Total_emp_hrs <= Max_Hrs_In_Month && Total_Working_Days <= No_of_Working_Days)
			Total_Working_Days++; {
		int empAttendance = (int) Math.floor(Math.random() * 10 % 3);
		switch (empAttendance) {
		case 1:
			emp_hrs = 4;
			break;
		case 2:
			emp_hrs = 8;
			break;
		default:
			emp_hrs = 0;
		}
		Total_emp_hrs += emp_hrs;
		System.out.println("Emp Days :" + Total_Working_Days + "  Emp Hours :" + emp_hrs);
	}

	int total_empwage = Total_emp_hrs * WAGE_PER_HOUR;

 System.out.println("Total Emp Wage : "+ total_empwage);
 }
}
