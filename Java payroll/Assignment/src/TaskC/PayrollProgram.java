package TaskC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayrollProgram {
	
	public static void main(String[] args) {
		Payroll payroll = new Payroll();
		boolean id;
		boolean hw;
		boolean hr;
		boolean et;
		while(true){
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Enter Employee ID:");
				int Employee_ID = Integer.parseInt(br.readLine());
				id = payroll.setEmployeeID(Employee_ID);
				
				System.out.print("Enter Employement Type:");
				char EmploymentType = br.readLine().charAt(0);
				et = payroll.setEmploymenttype(EmploymentType);
				
				System.out.print("Enter Hours Worked:");
				int EmployeeHours = Integer.parseInt(br.readLine());
				hw = payroll.setHoursWorked(EmployeeHours);
				
				System.out.print("Enter Hourly Rate:");
				float PayRate = Integer.parseInt(br.readLine());
				hr = payroll.setHourlyRate(PayRate);
				
				float WeeklyRate = payroll.calculateWeeklyWage();
				
				if ( id == true && hw == true && hr == true && et == true) {
					System.out.println("Employee ID:" + Employee_ID + 
							   ", Employment-type:" + EmploymentType +
							   ", " + EmployeeHours + "hours" +
							   ", $" + PayRate);
					break;
				}else {
					System.out.println("\n***************************************\n"
							+ "Please refer to above errors and retry"
							+ "\n***************************************\n");
				}

			}catch(IOException ioe){
				System.out.println("Error while reading input");
			}
			catch(NumberFormatException n) {
				System.out.println("**Restarting inputs**\n**Please enter correct data type**\n");
			}
		}
	}
}
