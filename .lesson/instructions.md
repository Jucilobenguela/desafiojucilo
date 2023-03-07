# Mission to the Moon

The mission is to write Java classes that simulate a mission to the moon. The program will have different levels of difficulty that are designed to test your understanding of object-oriented programming concepts


## Level 1: Create the Astronaut Class

You already have a file named Astronaut.java that represents a class. You must add the following private properties:

**name**: a String that represents the name of the astronaut. (already present as an example)

**age**: an int that represents the age of the astronaut.

**yearsOfExperience**: an int that represents the years of experience of the astronaut.

1. Create a constructor to set all these properties. 
2. Create all public getters. Getters should follow Java convenction: Ex: public String getName();

_Example code_:
```
Astronaut astronaut = new Astronaut("Neil Armstrong", 39, 3);

System.out.println(astronaut.getName()); // Neil Armstrong

```

## Level 2: Create the Ship Class:

Create a class named Ship (you need to create a new file Ship.java) that has the following properties:

**fuelLevel**: a double that represents the current fuel level of the ship.

**consumptionRate**: a double that represents the rate at which the ship consumes fuel per distance unit.

**velocity**: a double that represents the velocity of the ship.

1. Create a constructor to set all these properties.
2. Create all public getters. Getters should follow Java convenction: Ex: public String getName();
3. Create a method double calculateDistance() that calculates the maximum distance that the ship can travel whith the current fuelLevel.

_Example code_:
```
Ship ship = new Ship(10000.0, 10.0, 1000.0); //fuelLevel, consumptionRate, velocity
System.out.println(ship.calculateDistance()); // 1000.0

```

## Level 3: Create the Mission Class

Create a class named Missionthat has the following properties:

**ship**: a Ship object that represents the spaceship for the mission.

**astronauts**: an array of Astronaut objects that represents the astronauts for the mission.

**minimumYearsExperience** a int that represents the minimum years of experience for astronauts to be on the mission.

**distance** a double that represents the total distance for the mission.

**missionDestination**: a String that represents the destination for the mission.

1. Create the constructor: _Mission(Ship ship, Astronaut[] astronauts, int minimumYearsExperience, double distance)_
2. Create a setter for the missionDestination property.
3. Create a method double calculateTravelTime() that will return the amount of time that the ship will take.
4. Create a method boolean canLaunch() that checks if the mission has all properties not null, the ship has the necessary fuel for traveling the mission distance and all astronauts have minimum required experience.
5. Create a method List\<String\> ensureMinimumExperience() that removes all astronauts from the mission that don't have the minimum experience and return a list of their names.

**NOTE**: You must import import java.util.Arrays and java.util.List in order to solve this level

Complete code example:
```
class Main {
  public static void main(String[] args) {

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

  }
}
```
