 public class Ship {
   public double fuelLevel;
   public double consumptionRate;
   public double velocity;
   
   public Ship(double fuelLevel, double consumptionRate, double velocity){
     this.fuelLevel = fuelLevel;
     this.consumptionRate = consumptionRate;
     this.velocity = velocity;
   }
   public Ship(){
     
   }
     
    public double getFuelLevel(){
    return fuelLevel;
   }
    public double getConsumptionRate(){
    return consumptionRate;
   }
    public double getVelocity(){
    return velocity;
   } 

   public double calculateDistance(){
     return fuelLevel/consumptionRate;
   }
   
 } 