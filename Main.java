import java.util.Arrays;
import java.util.List;


class Main {
  public static void main(String[]args){
    
   Astronaut astronaut = new Astronaut("Neil Armstrong", 39, 3);
   System.out.println(astronaut.getName());

    Ship ship = new Ship(10000.0, 10.0, 1000.0);
    System.out.println(ship.calculateDistance());

     // Create some Astronauts
    Astronaut neil = new Astronaut("Neil Armstrong", 39, 3);//(name, age, yearsOfExperience)
    Astronaut buzz = new Astronaut("Buzz Aldrin", 36, 4);
    Astronaut michael = new Astronaut("Michael Collins", 38, 2);

    // Create a ship
    Ship aquarius = new Ship(100000.0, 10.0, 10000.0); //(fuelLevel, consumptionRate, velocity)

    // Create a mission
    Mission apollo = new Mission(aquarius, new Astronaut[] { neil, buzz, michael }, 3, 10000);
    apollo.setMissionDestination("The Moon");

     //print results
    System.out.println(apollo.canLaunch()); //false
    System.out.println(apollo.calculateTravelTime()); //1.0
    System.out.println(apollo.ensureMinimumExperience()); //[Michael Collins]
    System.out.println(apollo.canLaunch()); //true
    
    
  
    /*
    * Welcome to our mission, 

              Please view instructions.md file

    * Use tests on tools pane on the left to know what code is running or what is missing.
    * Test results will appear on console tab.
    * At the end all code should be able to run smoothly.
    * Use this learning tool to get confotable with Java
    *
    *    https://www.codecademy.com/learn/learn-java

    * To know how to use replit 
    * https://www.freecodecamp.org/news/how-to-use-replit/#basic-features-of-the-replit-editor

                          ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
                          ░░▄█████▄░▄███████▄░▄███████▄░██████▄░░
                          ░░██▒▒▒▒█░███▒▒▒███░███▒▒▒███░██▒▒▒██░░
                          ░░██▒▒▒▒▒░██▒▒▒▒▒██░██▒▒▒▒▒██░██▒▒▒██░░
                          ░░██▒▒▒▀█░███▒▒▒███░███▒▒▒███░██▒▒▒██░░
                          ░░▀█████▀░▀███████▀░▀███████▀░██████▀░░
                          ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
                          ░░░░██▒▒▒▒░██▒▒▒██░▄█████░██▒▒▒▒██▀░░░░
                          ░░░░██▒▒▒▒░██▒▒▒██░██▀▒▒▒░██▒▒▒██░░░░░░
                          ░░░░██▒▒▒▒░██▒▒▒██░██▒▒▒▒░█████▀░░░░░░░
                          ░░░░██▒▒▒▒░██▄▒▄██░██▄▒▒▒░██▒▒▒██░░░░░░
                          ░░░░▀█████░▀█████▀░▀█████░██▒▒▒▒██▄░░░░
                          ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
                          
    */
    
   
    
    // Create some Astronauts
    //Astronaut neil = new Astronaut("Neil Armstrong", 39, 3);//(name, age, yearsOfExperience)
    //Astronaut buzz = new Astronaut("Buzz Aldrin", 36, 4);
    //Astronaut michael = new Astronaut("Michael Collins", 38, 2);

    // Create a ship
    //Ship aquarius = new Ship(100000.0, 10.0, 10000.0); //(fuelLevel, consumptionRate, velocity)

    // Create a mission
    //Mission apollo = new Mission(aquarius, new Astronaut[] { neil, buzz, michael }, 3, 10000);
    //apollo.setMissionDestination("The Moon");

    //print results
    //System.out.println(apollo.canLaunch()); //false
    //System.out.println(apollo.calculateTravelTime()); //1.0
    //System.out.println(apollo.ensureMinimumExperience()); //[Michael Collins]
    //System.out.println(apollo.canLaunch()); //true

  }

@Override
public String toString() {
	return "Main []";
}
}