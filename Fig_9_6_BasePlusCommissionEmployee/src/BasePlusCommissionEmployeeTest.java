// Fig. 9.7: BasePlusCommissionEmployeeTest.java
// BasePlusCommissionEmployee test program.

public class BasePlusCommissionEmployeeTest 
{
   public static void main( String[] args ) 
   {
      // instantiate BasePlusCommissionEmployee object
      BasePlusCommissionEmployee employee = 
         new BasePlusCommissionEmployee( 
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );
      
      // get base-salaried commission employee data
      System.out.println( 
         "Employee information obtained by get methods: \n" );
      System.out.printf( "%s %s\n", "First name is",
         employee.getFirstName() );
      System.out.printf( "%s %s\n", "Last name is", 
         employee.getLastName() );
      System.out.printf( "%s %s\n", "Social security number is", 
         employee.getSocialSecurityNumber() );
      System.out.printf( "%s %.2f\n", "Gross sales is", 
         employee.getGrossSales() );
      System.out.printf( "%s %.2f\n", "Commission rate is",
         employee.getCommissionRate() );
      System.out.printf( "%s %.2f\n", "Base salary is",
         employee.getBaseSalary() );

      employee.setBaseSalary( 1000 ); // set base salary
      
      System.out.printf( "\n%s:\n\n%s\n", 
         "Updated employee information obtained by toString", 
         employee.toString() );
      
      System.out.println("\n");
      
      BasePlusCommissionEmployee employee1 = new BasePlusCommissionEmployee ("Sal","Khan","322-36-7779",25000, .7,1100);
      BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee ("Bill","Gates","877-64-1249",19000, .8,2000);
      BasePlusCommissionEmployee employee3 = new BasePlusCommissionEmployee ("Linus","Torvalds","023-41-8841",20000, .5,1500);
      BasePlusCommissionEmployee vector [] = {employee1,employee2,employee3};
      
      int maxEmployeeIdx=0;
      double max=vector[maxEmployeeIdx].getGrossSales()*vector[maxEmployeeIdx].getCommissionRate()+vector[maxEmployeeIdx].getBaseSalary();
      for (int i=1;i<vector.length;i++) {
    	  if (vector[i].getGrossSales()*vector[i].getCommissionRate()+vector[i].getBaseSalary()>max) {
    		  max=vector[i].getGrossSales()*vector[i].getCommissionRate()+vector[i].getBaseSalary();
    		  maxEmployeeIdx=i;
    	  }
      }
      System.out.print("Highest net earnings employee from vector: \n \n" + vector[maxEmployeeIdx].toString());
      
      System.out.println("\n");
      
      System.out.print("Highest net earning employees in descending order: \n \n");
      
      BasePlusCommissionEmployee employeeMemory = new BasePlusCommissionEmployee(" "," "," ",0,0,0);
      for (int i=0;i<vector.length-1;i++) {
    	  for (int j=0;j<vector.length;j++) {
    		  double salj=vector[j].getGrossSales()*vector[j].getCommissionRate()+vector[maxEmployeeIdx].getBaseSalary();
    		  double sali=vector[i].getGrossSales()*vector[i].getCommissionRate()+vector[maxEmployeeIdx].getBaseSalary();
    		  if (salj<sali) {
    			  employeeMemory = vector[j];
    			  vector[j]=vector[i];
    			  vector[i]=employeeMemory;
    		  }
    	  }
      }
   
      for (int i=0;i<vector.length;i++) {
    	  System.out.println(vector[i].toString());
    	  System.out.println();
      }
   } // end main
} // end class BasePlusCommissionEmployeeTest


/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
