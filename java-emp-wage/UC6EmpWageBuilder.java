//calculating wages for a month using for loop
public class UC6EmpWageBuilder { 
   public static final int IS_PART_TIME = 2;
   public static final int IS_FULL_TIME = 1;
   public static final int EMP_RATE_PER_HOUR = 20;
   public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HOURS_IN_MONTH = 100;

   public static void main(String args[]) {
      //variables 
      int empHrs = 0;
      int totalEmpHrs = 0;
      int totalWorkingDays = 0;
		int totalEmpWage = 0;
      //computation
      while (totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
      	int empCheck = (int)Math.floor(Math.random() * 10) %2;
         switch(empCheck){
         case IS_FULL_TIME:
            empHrs = 8;
            break;
         case IS_PART_TIME:
            empHrs = 4;
				break;
         default:
            empHrs = 0;
         }
			totalEmpHrs += empHrs;
			System.out.println("Day : " + totalWorkingDays + " EmpHr: " +empHrs);

      }
	   totalEmpWage = EMP_RATE_PER_HOUR * totalEmpHrs;
      System.out.println("Total  monthly empployee wage: " + totalEmpWage);
   }
}
