public class App{
    public static void main(String[] args){

        //BridgeSystem
        BridgeSystem bridge = new BridgeSystem("Arch", "fiber reinforced polymers", "transportation");

        System.out.println(bridge.getForm());
        System.out.println(bridge.getPorpose());


        //CANDLE
         Candle candle = new Candle("purple", "cotton", "cylinder");
        
         boolean lighter = true;

         candle.lighted(lighter);

         System.out.println(candle.getWaxColor());
         System.out.println(candle.getCandleWick());

         candle.lightTheCandle("green", "cotton candlewick", "cylinder");

   /*
         // CAR

         Car car = new Car("convertible", "electronic chassis type", true, "double xenon", "ceramic drilled");

         System.out.println(car.getRoofType(), car.getChassisControlType(), car.getESP(), car.getHeadlightType(), car.getDiscType());

         // CAR PUBLIC LINE
         CarPublicLine carPublic = new CarPublicLine("Police", "LA-PD-233");
        
         System.out.println(carPublic.getFieldOfActivity());
         System.out.println(carPublic.getLicensePlate());
   */
        //CITY
        City city = new City("London", 8982000000d , "London councils");
        City city1 = new City("Singapore", 5686000000d, "Singapore national coucil");
        System.out.println(city.getName());
        System.out.println(city.getPopulation());
        System.out.println(city.getCouncil());
        city.maxPopulation(city, city1);
        city.guessTheCountry("Kuala Lampur");


        //CITY INFRASTRUCTURE
        // CityInfrastructure cityInfrastructure = new CityInfrastructure();
        
        //CLIENT

        Client client = new Client();

        client.setName();
        client.setSurname();
        client.setFrequencyOfVisit();
        client.setSubscription();

        System.out.println(client.getName());
        System.out.println(client.getSurname());
        System.out.println(client.getFrequencyOfVisit());
        //System.out.println(client.getSubscription()); -------------------------------------------


        //COMPANY
        Company company = new Company("AUTODOC", "BERLIN 323 GMBH", "233-332-11-2212-33-1", "autodoc@mail.de", "123456789112345678US");
        System.out.println("L:" + company.getCin().length());
        
        System.out.println(company.getCin().substring(18, company.getCin().length()));
        
        company.checkIDNO();

        //COUNTRY

        Country country = new Country("The United Kingdom", "UK", "London", "GB");

        System.out.println(country.getName());
        System.out.println(country.getFlag());
        System.out.println(country.getCapital());
        System.out.println(country.getCurrency());

       //DRIVER
       Driver driver = new Driver("Alex", "Ferguson", (byte)76, (byte)48, "B, C", "Mainly worked in Manchester area");

       System.out.println(driver.getName());
       System.out.println(driver.getSurname());
       System.out.println(driver.getAge());
       System.out.println(driver.getYearsOfExperience());
       System.out.println(driver.getDrivingLicenseType());
       System.out.println(driver.getWorkHistory());

       //GARAGE
       Garage garage = new Garage();

       garage.setLength(34.5f);
       garage.setWidth(44.42f);
       garage.setHeight(4.5f);
       garage.setRawMaterial("British Bricks");

       System.out.println(garage.getLength());
       System.out.println(garage.getWidth());
       System.out.println(garage.getLength());
       System.out.println(garage.getRawMaterial());

       System.out.println("Volume of the new garage is: " + garage.volumeCalculate());
       System.out.println("The perimeter of the new garage is: " + garage.perimeterCalculate());

       //GARDEN

       Garden garden = new Garden();
       garden.setLength(23f);
       garden.setWidth(43.44f);
       garden.setPlants(true);

       System.out.println(garden.checkForPlants());
       System.out.println("Garden's perimeter equals to " + garden.perimeterCalculate());

       //GOVERNOR
       Governor governor = new Governor("Franklin", "Clinton", "Democratic", true, super.getVoteDecision, super.getNewLaw, super.getConclusion);

        System.out.println(governor.getName());
        System.out.println(governor.getSurname());
        System.out.println(governor.getParty());
        // System.out.println(super().getVoteDecision());
        // System.out.println(governor.getNewLaw());
        // System.out.println(governor.getConclusion());

       
    }
}