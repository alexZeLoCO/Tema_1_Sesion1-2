
public class BothEmployeeTypesTest {

	public static void main(String[] args) {
	      CommissionEmployee employee1 = new CommissionEmployee ("Sal","Khan","322-36-7779",25000, .7);
	      CommissionEmployee employee2 = new CommissionEmployee ("Bill","Gates","877-64-1249",19000, .8);
	      BasePlusCommissionEmployee employee3 = new BasePlusCommissionEmployee ("Linus","Torvalds","023-41-8841",20000, .5,1500);
	      BasePlusCommissionEmployee employee4 = new BasePlusCommissionEmployee ("Jeff","Bezoos","648-81-223",18000, .3,1700);
	      
	      CommissionEmployee vectorComm [] = {employee1,employee2};
	      BasePlusCommissionEmployee vectorBase [] = {employee3,employee4};
	      
	      boolean employeeBase=false;
	      int maxEmployeeIdx=0;
	      double max=vectorComm[maxEmployeeIdx].getGrossSales()*vectorComm[maxEmployeeIdx].getCommissionRate();
	      for (int i=1;i<vectorComm.length;i++) {
	    	  if (vectorComm[i].getGrossSales()*vectorComm[i].getCommissionRate()>max) {
	    		  max=vectorComm[i].getGrossSales()*vectorComm[i].getCommissionRate();
	    		  maxEmployeeIdx=i;
	    		  employeeBase=false;
	    	  }
	      }
	      
	      for (int i=0;i<vectorBase.length;i++) {
	    	  if (vectorBase[i].getGrossSales()*vectorBase[i].getCommissionRate()+vectorBase[i].getBaseSalary()>max) {
	    		  max=vectorBase[i].getGrossSales()*vectorBase[i].getCommissionRate()+vectorBase[i].getBaseSalary();
	    		  maxEmployeeIdx=i;
	    		  employeeBase=true;
	    	  }
	      }
	      
	      if (employeeBase) {
	    	  System.out.print("Highest net earnings employee from vector has Base earnings: \n \n" + vectorBase[maxEmployeeIdx].toString());
	      } else {
	    	  System.out.print("Highest net earnings employee from vector does not have Base earnings: \n \n" + vectorComm[maxEmployeeIdx].toString());
	      }

	}

}
