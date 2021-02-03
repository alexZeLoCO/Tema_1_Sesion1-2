/**
 * Example using the class Bicycle
 * 
 */

class BicycleDemo {
     public static void main(String[] args) {

          // Create two different Bicycle objects
          Bicycle bike1 = new Bicycle(50,10,2);
          Bicycle bike2 = new Bicycle();
          Bicycle bike3 = new Bicycle();

          // Invoke methods on those objects

          bike1.printStates();

          bike2.setCadence(50);
          bike2.speedUp(10);
          bike2.setGear(2);
          bike2.setCadence(40);
          bike2.speedUp(10);
          bike2.setGear(3);
          bike2.printStates();
          
          bike3.printStates();
          
          // Exercise C
          Bicycle bikec = new Bicycle (0,2*bike2.getSpeed(),bike1.getGear());
          
          bikec.printStates();		//Expected: 0, 40, 0
          
          bikec.speedUp(10);		//0, 50, 0
          bikec.setGear(1);			//0, 50, 1
          bikec.applyBrake(15);		//0, 35, 1
          
          bikec.printStates();		//Expected: 0, 35, 1
          
          //Excercise d
          Bicycle bikecopy = new Bicycle (bikec);
          
          bikec.printStates();		//Expected: 0, 35, 1
          
          //Excercise e
          System.out.print(bikec.toString());		//Expected: 0, 35, 1
          
     }
}

