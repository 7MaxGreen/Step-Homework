public class HealthServices{
   private String type;
   private String services;
   private String address;

    public HealthServices(String type, String services, String address){
        this.type = type;
        this.services = services;
        this.address = address;
    }

    public String getType()
    {
        return this.type;
    }

    public String getServices()
    {
        return this.services;
    }

    public String getAddress()
    {
        return this.address;
    }

}