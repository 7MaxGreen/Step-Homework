public class CarPublicLine extends Vehicle{
    String fieldOfActivity;
    String licensePlate;

    public CarPublicLine(String fieldOfActivity, String licensePlate){
        this.fieldOfActivity = fieldOfActivity;
        this.licensePlate = licensePlate;
    }

    public getFieldOfActivity(){
        return this.fieldOfActivity;
    }

    public getLicensePlate(){
        return this.licensePlate;
    }

    
}