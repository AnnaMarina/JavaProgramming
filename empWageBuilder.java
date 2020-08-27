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
	        	 empHours = 8;
        		 break;
		//partime
	         case PART_TIME:
        		 empHours = 4;
        		 break;
        	default:
        		empHours = 0;
        	 }
        	 int empDailyWage = empHours * wagePerHour ;
        	 System.out.println("Daily Wage : "+empDailyWage);
	}

}
