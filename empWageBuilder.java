public class empWageBuilder {
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static void main(String args[]) {
		int empHours=0, wagePerHour=8, workingdays=20, totalWage=0, d=0;
		System.out.println("Welcome to Employee Wage Computation");
         do {
        	int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        	workingdays-=1;
        	switch(empCheck) {
        	case FULL_TIME:
        		empHours = 8;
        		//System.out.println("Employee present for full day");
        		break;
        	case PART_TIME:
        		empHours = 4;
        		//System.out.println("Employee present for half day");
        		break;
        	default:
        		empHours = 0;
        		//System.out.println("Employee Absent");
        	}
        	int empDailyWage = empHours * wagePerHour ;
        	totalWage+=empDailyWage;
        	d+=1;
        	System.out.println("Wage for day "+d+" : "+empDailyWage);
         	} while(workingdays > 0);
         System.out.println("The total wage is : "+totalWage);
	}
}
