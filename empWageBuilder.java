public class empWageBuilder {

	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static void main(String args[]) {
		int empHours=0, wagePerHour=8;
		System.out.println("Welcome to Employee Wage Computation");
		//To check for attendance
	         int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	         switch(empCheck) {
	         case FULL_TIME:
			System.out.println("Employee present for full day");
	        	empHours = 8;
        		break;
		//partime
	         case PART_TIME:
			System.out.println("Employee present for half day");
        		empHours = 4;
        		break;
        	default:
			System.out.println("Employee Absent");
        		empHours = 0;
        	 }
        	 int empDailyWage = empHours * wagePerHour ;
        	 System.out.println("Daily Wage : "+empDailyWage);
	}

}
