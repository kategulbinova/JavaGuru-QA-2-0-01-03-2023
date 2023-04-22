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
  @Override
  public void wash() {
     System.out.println("This sedan just used the automatic carwash at the station. Sparking clean!");
  }
}
