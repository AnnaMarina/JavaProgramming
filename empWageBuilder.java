public class empWageBuilder {
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int MAX_HOURS=100;
	public static final int MAX_DAYS=20;
	public static final int WAGE_PER_HOUR=8;

	public static void calculateWage(int wagePerHour, int maxDays, int maxHours) {
		int empHours=0, totalWage=0, d=0, totalEmpHours=0 ;
		while(d < maxDays && totalEmpHours < maxHours ) {
         int empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
         totalEmpHours+=empHours;
         d+=1;
         System.out.println("Wage for day "+d+" : "+empDailyWage);
            }
         System.out.println("The total wage is "+totalWage+"/- and hours worked is "+totalEmpHours);

	}
	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Computation");
		calculateWage(8,20,100);
	}
}
