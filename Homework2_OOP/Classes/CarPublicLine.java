public class CarPublicLine extends Vehicle{
    String fieldOfActivity;
    String licensePlate;

    public CarPublicLine(String fieldOfActivity, String licensePlate, String make, String model, String variant, String fuelType, String transmissionType, boolean electricBatteries, short yearOfManufacturing, short batteryCapacity){
        super( make,  model,  variant,  fuelType,  transmissionType,  electricBatteries,  yearOfManufacturing,  batteryCapacity);
        
        this.fieldOfActivity = fieldOfActivity;
        this.licensePlate = licensePlate;
    }

    public String getFieldOfActivity(){
        return this.fieldOfActivity;
    }

    public String getLicensePlate(){
        return this.licensePlate;
    }

    public void displaySuperClass(){

          System.out.println(
                             "Make: " + getMake() +
                             " Model: " + getModel() +
                             " Variant: " + getVariant() +
                             " Fuel Type: " + getFuelType() +
                             " Transmission: " + getTransmissionType() +
                             " Year of manufacturing: " + getYearOfManufacturing() +
                             " Electric Batteries: " + getElectricBatteries() + 
                             " Battery capacity: " + getBatteryCapacity());
    }

    
}