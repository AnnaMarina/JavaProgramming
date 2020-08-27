public class empWageBuilder {
        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;

        private final String company;
        private final int maxHours;
        private final int workingDays;
        private final int wagePerHour;

        public empWageBuilder(String company, int wagePerHour, int workingDays, int maxHours) {
                   this.company = company;
                   this.wagePerHour = wagePerHour;
                   this.workingDays = workingDays;
                   this.maxHours = maxHours;
        }

        private void computeWage() {
                int empHours=0, days=0, totalWage=0, totalEmpHours=0;
                System.out.println("Welcome to Employee Wage Computation \n");
                System.out.println("*****DAILY WAGE COMPUTAION****** \n");
                while(days < workingDays  && totalEmpHours < maxHours ) {
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
                        days+=1;
                        System.out.println("Wage for day "+days+" : "+empDailyWage);
                 }
                System.out.println("\n**************EMPLOYEE DETAILS**************");
                System.out.println(" COMPANY NAME  : "+company+"\n MONTHLY WAGE  : "+totalWage+"/- \n HOURS WORKED : "+totalEmpHours+"\n \n");
	}

        public static void main(String args[]) {
        empWageBuilder More = new empWageBuilder("More",8,20,100);
        More.computeWage();
        }
}
