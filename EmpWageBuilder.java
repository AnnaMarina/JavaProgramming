import Empwage.CompanyEmpWage;
import java.util.LinkedList;

public class EmpWageBuilder {
        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;


        private LinkedList<CompanyEmpWage> companyEmpWageList;
        public EmpWageBuilder() {
        	companyEmpWageList = new LinkedList<>();
        }
        public void addCompanyEmpWage(String company, int wagePerHour, int workingDays, int maxHours) {

        	CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, wagePerHour, workingDays, maxHours);
        	companyEmpWageList.add(companyEmpWage);
        }

        private void computeEmpWage() {
        	for (int i=0;i< companyEmpWageList.size();i++) {
        		CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
        		companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
        		System.out.println(companyEmpWage);
        	}
                 }
        public int computeEmpWage(CompanyEmpWage companyEmpWage) {
        	int totalWage=0, empHours=0, days=0, totalEmpHours=0, empDailyWage=0;
            System.out.println("Welcome to Employee Wage Computation \n");
            System.out.println("*****DAILY WAGE COMPUTAION****** \n");
            while(days < companyEmpWage.workingDays  && totalEmpHours < companyEmpWage.maxHours ) {
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
                    empDailyWage = empHours * companyEmpWage.wagePerHour ;
                    totalEmpHours+=empHours;
                    days+=1;
                    System.out.println("Wage for day "+days+" : "+empDailyWage);
                    totalWage+=empDailyWage;
            }
            return totalWage;

        }


        public static void main(String args[]) {
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("More",8,20,100);
        empWageBuilder.addCompanyEmpWage("KR Bakers",10,25,100);
        empWageBuilder.computeEmpWage();
        }


}
