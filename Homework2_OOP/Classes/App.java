public class App{
    public static void main(String[] args){

        //BridgeSystem
        BridgeSystem bridge = new BridgeSystem("Arch", "fiber reinforced polymers", "transportation");
        BridgeSystem bridge2 = new BridgeSystem("Arch", "fiber reinforced polymers", "transportation");
        System.out.println(bridge.getForm());
        System.out.println(bridge.getPorpose());


        //CANDLE
         Candle candle = new Candle("purple", "cotton", "cylinder", true);

         System.out.println(candle.getWaxColor());
         System.out.println(candle.getCandleWick());
         System.out.println(candle.getForm());
         System.out.println(candle.getIsLighted());

         candle.lighted();

         candle.lightTheCandle("green", "cotton candlewick", "cylinder");

   
         // CAR ( extends Vehicle )

         Car car = new Car("convertible", "electronic chassis type", true, "double xenon", "ceramic drilled", "VW", "B8", "GTE", "Bensin", "DSG AUTOMATIC", true, (short)2016, (short)9 );

         System.out.println("Roof: " + car.getRoofType());

         System.out.println("Chassis type: " +car.getChassisControlType());
         System.out.println("ESP included: " +car.getESP());
         System.out.println("Headlights: " +car.getHeadlightType());
         System.out.println("Discs: " +car.getDiscType());
         car.displaySuperClass();


         // CAR PUBLIC LINE (extends Vehicle)
         CarPublicLine carPublic = new CarPublicLine("Police", "LA-PD-233", "BMW", "3-series", "E90", "DIESEL", " AUTOMATIC", false, (short)2012, (short)0  );
        
         System.out.println(carPublic.getFieldOfActivity());
         System.out.println(carPublic.getLicensePlate());
         carPublic.displaySuperClass();

        //CITY
        City city = new City("London", 8982000000d , "London councils");
        City city1 = new City("Singapore", 5686000000d, "Singapore national coucil");
        System.out.println(city.getName());
        System.out.println(city.getPopulation());
        System.out.println(city.getCouncil());
        city.maxPopulation(city, city1);
        city.guessTheCountry("Kuala Lampur");

/*
     
        //CLIENT (subscriptionType is an attribute of CLASS type)

        Client client = new Client();

        client.setName();
        client.setSurname();
        client.setFrequencyOfVisit();
        client.setSubscription();

        System.out.println(" Name: " + client.getName());
        System.out.println(" Surname: " + client.getSurname());
        System.out.println(" Frequency: " + client.getFrequencyOfVisit());
        System.out.println(" Subscription type : " + client.getSubscription().getSubscriptionType()); 
        System.out.println(" Period : " + client.getSubscription().getPeriod());
        System.out.println(" Price: " + client.getSubscription().getPrice());
        System.out.println(" Discount: " + client.getSubscription().getDiscount());

        client.checkMastery();

*/
        //COMPANY (Conditional constructor)
        Company company = new Company("AUTODOC", "BERLIN 323 GMBH", "sales", "233-332-11-2212-33-1", "autodoc@mail.de", "123456789112345678US");
        System.out.println("L:" + company.getCin().length());
        
        System.out.println(company.getCin().substring(18, company.getCin().length()));


        System.out.println("financial start-up: "  + company.getFinancialStartUp());
        
        company.checkIDNO();

 
        //COUNTRY (extends CITY)

        Country country = new Country("UK", "London", "GBP", "The United Kingdom", 23000000, "London's main Council");

        System.out.println(country.getName());
        System.out.println(country.getPopulation());
        System.out.println(country.getCouncil());
        System.out.println(country.getFlag());
        System.out.println(country.getCapital());
        System.out.println(country.getCurrency());

/*
       //DRIVER
       Driver driver = new Driver("Alex", "Ferguson", (byte)76, (byte)48, "B, C", "Mainly worked in Manchester area");

       System.out.println(driver.getName());
       System.out.println(driver.getSurname());
       System.out.println(driver.getAge());
       System.out.println(driver.getYearsOfExperience());
       System.out.println(driver.getDrivingLicenseType());
       System.out.println(driver.getWorkHistory()); */


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

       //GOVERNOR (includes an attribute of CLASS type (LawApproval))
       Governor governor = new Governor("Franklin", "Clinton", "Democratic");

        System.out.println(governor.getName());
        System.out.println(governor.getSurname());
        System.out.println(governor.getParty());
        governor.setLawApproval();
        System.out.println(governor.getLawApproval().getVoteDecision());
        System.out.println(governor.getLawApproval().getNewLaw());
        System.out.println(governor.getLawApproval().getConclusion());



        //GYM -> CLIENT -> SUBSCRIPTION ( includes attributes of CLASS type)
        Gym gym = new Gym();

        gym.setName();
        gym.setAddress();
        gym.setMembers();

        gym.setClient(); // -> calls client Obj setters which includes subscription Obj setters;
       

        System.out.println(gym.getName());
        System.out.println(gym.getAddress());
        System.out.println(gym.getMembers());

        System.out.println(gym.getClient().getName());
        System.out.println(gym.getClient().getSurname());
        System.out.println(gym.getClient().getFrequencyOfVisit());

        System.out.println(gym.getClient().getSubscription().getSubscriptionType());
        System.out.println(gym.getClient().getSubscription().getPeriod());
        System.out.println(gym.getClient().getSubscription().getPrice());
        System.out.println(gym.getClient().getSubscription().getDiscount());


        gym.checkSize();


    
        //HEALTH SERVICES
        HealthServices health = new HealthServices("Hospital", "hospitalization, emergency, surgical, x-ray-radiology, blood, laboratory services", "NY-333 AVENUE");
        System.out.println(health.getType());
        System.out.println(health.getServices());
        System.out.println(health.getAddress());

        //TELECOMMUNICATION SYSTEM
        TelecommunicationSystem net = new TelecommunicationSystem("Packet switched networks", "(WAN) protocols, including Frame Relay, X. 25, and TCP/IP", "Packet switching");
        System.out.println(net.getType());
        System.out.println(net.getTechnicalConcepts());
        System.out.println(net.getRegulation());

        //WATER DRAINAGE SYSTEM
        WaterDrainageSystem water = new WaterDrainageSystem("Brick Sewer" , "30 million tonnes", "water (99.9%)", (short)1858);

        System.out.println(water.getYearOfInstallation());
        System.out.println(water.getWaterQuality());
        System.out.println(water.getWaterQuantity());
        System.out.println(water.getSewerType());
       
    }
}