public class Car extends Vehicle{
    
        private String roofType;
        private String chassisControlType;
        private boolean esp;
        private String headlightType;
        private String discType;

       

        public Car(String roofType, String chassisControlType, boolean esp, String headlightType, String discType, String make, String model, String variant, String fuelType, String transmissionType, boolean electricBatteries, short yearOfManufacturing, short batteryCapacity){
          super( make,  model,  variant,  fuelType,  transmissionType,  electricBatteries,  yearOfManufacturing,  batteryCapacity);

          this.roofType = roofType;
          this.chassisControlType = chassisControlType;
          this.esp = esp;
          this.headlightType = headlightType;
          this.discType = discType;
        }

        public String getRoofType(){
            return this.roofType;
        }

          public String getChassisControlType(){
            return this.chassisControlType;
        }

          public boolean getESP(){
            return this.esp;
        }

          public String getHeadlightType(){
            return this.headlightType;
        }

          public String getDiscType(){
            return this.discType;
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

/*
        public String getMake(){
          return super.getMake();
        }

        public String getModel(){
        return super.model;
        }

        public String getVariant(){
        return super.variant;
        }

        public String getFuelType(){
          return super.fuelType;
        }

        public String getTransmissionType(){
        return super.transmissionType;
        }

        public boolean getElectricBatteries(){
         return super.electricBatteries;
        }

        public short getYearOfManufacturing(){
          return super.yearOfManufacturing;
        }

        public short getBatteryCapacity(){
        return super.batteryCapacity;
        }
*/