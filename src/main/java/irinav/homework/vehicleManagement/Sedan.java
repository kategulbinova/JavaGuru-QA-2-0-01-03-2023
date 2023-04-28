package irinav.homework.vehicleManagement;
 class Sedan extends Car{

  int seats;

  Sedan( String driver, String numberPlate) {
      super(driver, numberPlate);
  }
  Sedan(String driver, String numberPlate, int numberOfSeats) {
      super(driver, numberPlate);
      this.seats = numberOfSeats;
  }
  public void showNumberOfSeats(){
      System.out.println("There are 4 places in your car.");
  }

  @Override
  public void wash() {
     System.out.println("This sedan just used the automatic car wash at the station. Sparking clean!");
  }
  void checkTechnicalCondition(){
         //super.checkTechnicalCondition();
  System.out.println("Your sedan is safe to use.");
  }
}
