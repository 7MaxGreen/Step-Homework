public class Vehicle{
   private String make;
   private String model;
   private String variant;
   private String fuelType;
   private String transmissionType;
   private boolean electricBatteries;
   private short yearOfManufacturing;
   private short batteryCapacity;
   
   public Vehicle(String make, String model, String variant, String fuelType, String transmissionType, boolean electricBatteries, short yearOfManufacturing, short batteryCapacity){
      this.make = make;
      this.model = model;
      this.variant = variant;
      this.fuelType = fuelType;
      this.transmissionType = transmissionType;
      this.electricBatteries = electricBatteries;
      this.yearOfManufacturing = yearOfManufacturing;
      this.batteryCapacity = batteryCapacity;
   }

   public String getMake(){
      return this.make;
   }

   public String getModel(){
      return this.model;
   }

   public String getVariant(){
      return this.variant;
   }

   public String getFuelType(){
      return this.fuelType;
   }

   public String getTransmissionType(){
      return this.transmissionType;
   }

   public boolean getElectricBatteries(){
      return this.electricBatteries;
   }

   public short getYearOfManufacturing(){
      return this.yearOfManufacturing;
   }

   public short getBatteryCapacity(){
      return this.batteryCapacity;
   }
   
}