
public class Astronaut {

  private String name;
  private int age;
  private int yearsOfExperience;

  //Add the right contructor parameters
  public Astronaut(){
    
  }
  public Astronaut(String name, int age, int yearsOfExperience){
    this.name= name;
    this.age = age;
    this.yearsOfExperience = yearsOfExperience;
  }


  public String getName(){
    return name;
  }
   public void setName(String name) {
    this.name = name;
  }
  
  public int getAge(){
    return age;
  }
   public void setAge(int age) {
    this.age = age;
  }
  

  public int getYearsOfExperience(){
    return this.yearsOfExperience;
  } 
   public void setYearsOfExperience(int yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
  }
}