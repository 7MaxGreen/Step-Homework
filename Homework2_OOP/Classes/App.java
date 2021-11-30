public class App{
    public static void main(String[] args){

        //Candle class;
        Candle candle = new Candle();
        
        boolean lighter = true;

        candle.lighted(lighter);

        candle.lightTheCandle("green", "cotton candlewick", "cylinder");


        //Car class;

        Car car = new Car();

        car.roofType = new String[] {"hardtop", "convertible", "sunroof"};
        System.out.println("ROOF TYPES: " + car.roofType);

        
        // public String[] ChassisControlType = {"tubular", "four-c", "monocoque", "backbone"};
        // public String[] ESP={"included", "excluded"};
        // public String[] headlightType ={"halogen", "xenon", "double xenon", "led", "laser"};
        // public String[] discType = {"ventilated", "drilled", "ceramic", "flat"};
        // public String[] carModel = {"MERCEDES C 200 d COMFORT 9-G", "Volkswagen Tiguan Se 4motion W", "Volvo XC 60 AWD Summum D3 NAVI", "BMW 3 Series CC E93 E92 Cabrio Coupe 10"};


        //City class;
        City city = new City("London", 8982000000d , "London councils");
        City city1 = new City("Singapore", 5686000000d, "Singapore national coucil");
        System.out.println(city.name);
        city.guessTheCountry(city.name);
        city.maxPopulation(8982000000d, 5686000000d);


        //CityInfrastructure class;
        CityInfrastructure cityInfrastructure = new CityInfrastructure();

        //cityInfrastructure.busLine = "L2333";


        //Company class;
        Company company = new Company("AUTODOC", "BERLIN 323 GMBH", "233-332-11-2212-33-1", "autodoc@mail.de", "1823456789112345678US");
        System.out.println("L:" + company.CIN.length());
        
        System.out.println(company.CIN.substring(18, company.CIN.length()));
        company.checkIDNO("12345678901234567US");


        //Country class;
        Country country = new Country("Morocco", "MOR", "Rabat", "Dirham marocan");
        System.out.println(country.name);
        System.out.println(country.currency);

        country.guessTheCapital("Israel");


        //{"Morocco", "Malaysia", "Indonesia", "USA", "Russia", "The United Kingdom", "Moldova", "Isle of Man"}


        //Government class;
        Government government = new Government();

        government.name = "William";
        government.surname = "Defoe";
        government.party = "Republicans";
        government.newLaw = "Commercial Security Agreements have to be transparent and voted unanimously by all parties.";
        government.decision = true;

        government.offerNewLaw();
        government.newLawDecision(government.decision, government.newLaw);


        //Garage class;

        Garage garage = new Garage();

        garage.length = 6f;
        garage.width = 6f;
        garage.height = 3.6f;

        System.out.println("Garage volume = " + garage.volumeCalculate(garage.length, garage.width, garage.height));
        System.out.println("Garage perimeter= " + garage.perimeterCalculate(garage.length, garage.width));


        //Garden class;

        Garden garden = new Garden();
        garden.length = 23.78F;
        garden.width = 138.2F;
        garden.plants = false;

        garden.checkForPlants(garden.plants);
        System.out.println("Garden perimeter: " + garden.perimeterCalculate(garden.length, garden.width));


        //Gym class;

        Gym gym = new Gym();
        gym.name = "Kingston's GYM";
        gym.address = "King Road Avenue TW10 7RF";
        gym.members = 323;
        gym.frequencyOfVisit = 323;

        gym.checkSize(gym.members);
        gym.checkMastery(gym.frequencyOfVisit);


    }
}