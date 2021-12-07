public class WaterDrainageSystem{
    String sewerType;
    String waterQuantity;
    String waterQuality;
    short yearOfInstallation;

    public WaterDrainageSystem(String sewerType, String waterQuantity, String waterQuality, short yearOfInstallation){
        this.sewerType = sewerType;
        this.waterQuantity = waterQuantity;
        this.waterQuality = waterQuality;
        this.yearOfInstallation = yearOfInstallation;
    }
}