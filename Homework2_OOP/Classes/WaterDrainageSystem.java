public class WaterDrainageSystem{
   private String sewerType;
   private String waterQuantity;
   private String waterQuality;
   private short yearOfInstallation;

    public WaterDrainageSystem(String sewerType, String waterQuantity, String waterQuality, short yearOfInstallation){
        this.sewerType = sewerType;
        this.waterQuantity = waterQuantity;
        this.waterQuality = waterQuality;
        this.yearOfInstallation = yearOfInstallation;
    }

    public String getSewerType(){
        return this.sewerType;
    }

    public String getWaterQuantity(){
        return this.waterQuantity;
    }

    public String getWaterQuality(){
        return this.waterQuality;
    }

    public short getYearOfInstallation(){
        return this.yearOfInstallation;
    }
}