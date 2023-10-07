package TaskC;
public class Payroll {
	private int Employee_ID;
	private char EmploymentType;
	private int EmployeeHours;
	private float PayRate;

	public boolean setEmployeeID(int Employee_ID) {
		boolean filled = false;
		if ( String.valueOf(Employee_ID).length() == 4 ) {
			this.Employee_ID = Employee_ID;
			filled = true;
		}
		else {
			System.out.println("Please Enter a 4 letter digit");
		}
		return filled;
	}

	public boolean setEmploymenttype(char EmploymentType) {
		boolean filled = false;
		if ( Character.toUpperCase(EmploymentType) == 'P' || Character.toUpperCase(EmploymentType) == 'C' || Character.toUpperCase(EmploymentType) == 'F' ) {
			this.EmploymentType = EmploymentType;
			filled = true;
		}
		else {
			System.out.println("Please Enter 'P' or 'C' or 'F'");
		}
		return filled;
	}

	public boolean setHoursWorked(int EmployeeHours) {
		boolean filled = false;
		if ( EmployeeHours >= 10 && EmployeeHours <= 42 ) {
			this.EmployeeHours = EmployeeHours;
			filled = true;
		}
		else {
			System.out.println("Employee can only work between 10 and 42 hours");
		}
		return filled;
	}

	public boolean setHourlyRate(float PayRate) {
		boolean filled = false;
		if ( PayRate >= 15 && PayRate <= 65 ) {
			this.PayRate = PayRate;
			filled = true;
		}
		else {
			System.out.println("The hourly rate can be between 15 and 65 dollars");
		}
		return filled;
	}
	
	public float calculateWeeklyWage() {
		
		return this.EmployeeHours * this.PayRate;
	}
	
}


