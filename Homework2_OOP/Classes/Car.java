public class Car extends Vehicle{
    
        private String roofType;
        private String chassisControlType;
        private boolean esp;
        private String headlightType;
        private String discType;

        super();

          public Car(String roofType, String chassisControlType, boolean esp, String headlightType, String discType){

             super(make,  model,  variant,  fuelType,  transmissionType,  electricBatteries,  yearOfManufacturing,  batteryCapacity);

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


      


}