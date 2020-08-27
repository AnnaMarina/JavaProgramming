public class empWageBuilder {

	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Computation");
		//To check for attendance
	         int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	         switch(empCheck) {
	         case FULL_TIME:
	        	 System.out.println("Full Day Present");
	        	 break;
	         case PART_TIME:
	        	 System.out.println("Half day Present");
	        	 break;
	        default:
	        	System.out.println("Employee is Absent");
	         }
	}
}
