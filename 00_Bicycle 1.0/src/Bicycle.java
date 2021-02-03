/**
 * Class Bicycle with visibility public and private
 * 
 */

class Bicycle {

       private int cadence;
       private int speed;
       private int gear;
       
    // Constructors
       public Bicycle() {
    	   this(0,0,1);
       }
       
       public Bicycle(int startCadence, int startSpeed, int startGear) {
    	   setGear(startGear);
    	   setCadence(startCadence);
    	   speedUp(startSpeed);
       }
       
       public Bicycle (Bicycle original) {
    	   this(original.getCadence(),original.getSpeed(),original.getGear());
       }
       
    // Observers
       public int getCadence() {
    	   return cadence;
   	   }
   		
   	   public int getGear() {
   		   return gear;
   	   }
    
   	   public int getSpeed() {
   		   return speed;
   	   }
   	   
    // Modifiers
       public void setCadence(int newValue) {
           cadence = newValue;
       }
   	
       public void setGear(int newValue) {
           gear = newValue;
       }
   	
       public void setSpeed (int newSpeed) {
    	   if (newSpeed>=0) {
    		   speed=newSpeed;
    	   } else {
    		   System.out.printf ("Speed %d not valid. Please enter speed >= 0.",newSpeed);
    	   }
       }
       
       public void applyBrake(int decrement) {
           setSpeed(getSpeed()-decrement);
       }
   	
       public void speedUp(int increment) {
    	   setSpeed(getSpeed()+increment);
       }
       
    // Other observer
       public void printStates() {
    	    System.out.println(" -- Bicycle -- ");
            System.out.println("cadence:"+getCadence()+" speed:"+getSpeed()+" gear:"+getGear());
       }
       
    // ToString()
       @Override
       public String toString() {
    	   return String.format("This bicycle attributes are: \n \t Cadence: %d. \n \t Speed: %d. \n \t Gear: %d. \n", getCadence(),getSpeed(),getGear());
       }
       
}

