package YanaItani.Vehicle;

public class Car extends Vehicle {
String plateNumber;
void wash(){
    System.out.println("Your car is now squeaky clean!");
}
Car(String plateNumber, String driver){
    super(driver);
    this.plateNumber = plateNumber;
}
void checkTechnicalCondition(){
    System.out.println("Car's oil level is appropriate, and the headlights are leveled correctly.");
    super.checkTechnicalCondition();

    }
}
