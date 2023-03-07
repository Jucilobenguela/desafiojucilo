import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mission {

  public Ship ship;
  public Astronaut[] astronauts;
  public int minimumYearsExperience;
  public double distance;
  public String missionDestination;

  public Mission(Ship ship, Astronaut[] astronauts, int minimumYearsExperience, double distance) {

    this.ship = ship;
    this.astronauts = astronauts;
    this.minimumYearsExperience = minimumYearsExperience;
    this.distance = distance;

  }

  public Ship getShip() {
    return ship;
  }

  public void setShip(Ship ship) {
    this.ship = ship;

  }

  public Astronaut[] getAstronaut() {
    return astronauts;
  }

  public void setListAstronaut(Astronaut[] astronauts) {
    this.astronauts = astronauts;
  }

  public int getMinimumYearsExperience() {

    return minimumYearsExperience;
  }

  public void setMinimumYearsExperience(int minimumYearsExperience) {
    this.minimumYearsExperience = minimumYearsExperience;
  }

  public double getDistance() {
    return distance;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public void setMissionDestination(String missionDestination) {
    this.missionDestination = missionDestination;
  }

  double calculateTravelTime() {
    // calcular tempo da viagem
    return ship.fuelLevel / (ship.consumptionRate * distance);

  }

  public boolean canLaunch() {

    for (int i = 1; i < astronauts.length; i++) {
      Astronaut a = astronauts[i];
      if (a.getYearsOfExperience() >= minimumYearsExperience && ship != null && astronauts != null && ship.fuelLevel >= 10) {
          return true;
        
      }
    }
    return false;

  }

  public List<String> ensureMinimumExperience() {
    List<String> names = new ArrayList<String>();

    for (int i = 1; i < astronauts.length; i++) {

      Astronaut astronaut = astronauts[i];

      if (astronaut.getYearsOfExperience() <= minimumYearsExperience) {
        Arrays.fill(astronauts, astronaut);
        names.add(astronaut.getName());
      }

    }

    return names;
  }

}
