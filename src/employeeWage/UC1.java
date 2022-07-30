package employeeWage;

import java.util.Random;

public class UC1{

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
}