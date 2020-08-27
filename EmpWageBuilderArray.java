import Empwage.CompanyEmpWage;

interface EmpWageInterface {
	public void addCompanyEmpWage(String company, int wagePerHour, int workingDays, int maxHours);
	public int computeEmpWage(CompanyEmpWage companyEmpWage);
	public void computeEmpWage();
}

public class EmpWageBuilderArray implements EmpWageInterface {
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;

	private int totalCompanies = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWageBuilderArray() {
    		companyEmpWageArray = new CompanyEmpWage[5];
	}
	public void addCompanyEmpWage(String company, int wagePerHour, int workingDays, int maxHours) {
    		companyEmpWageArray[totalCompanies] = new CompanyEmpWage(company, wagePerHour, workingDays, maxHours);
    		totalCompanies++;
	}

	public void computeEmpWage() {
    		for (int i=0;i<totalCompanies;i++) {
    			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
    			System.out.println(companyEmpWageArray[i]);
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
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("KR Bakers", 10, 25, 100);
		empWageBuilder.addCompanyEmpWage("More", 8, 20, 100);
		empWageBuilder.computeEmpWage();

	}
}
