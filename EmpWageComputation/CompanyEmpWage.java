package Empwage;

public class CompanyEmpWage {
		public final String company;
		public final int maxHours;
		public final int workingDays;
		public final int wagePerHour;
		public int totalWage;

	    public CompanyEmpWage(String company, int wagePerHour, int workingDays, int maxHours) {
	               this.company = company;
	               this.wagePerHour = wagePerHour;
	               this.workingDays = workingDays;
	               this.maxHours = maxHours;
	    }
	    public void setTotalEmpWage(int totalWage ) {
	    	this.totalWage = totalWage;
	  }
	    public String toString() {
	        System.out.println("\n**************EMPLOYEE DETAILS**************");
	        return " COMPANY NAME  : "+company+"\n MONTHLY WAGE  : "+totalWage+"/- \n";
	}
}
