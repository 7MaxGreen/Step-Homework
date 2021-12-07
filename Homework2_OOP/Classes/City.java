public class City{
    
        private String name;
        private double population;
        private String council;

        public City(String name, double population, String council) {
            this.name = name;
            this.population = population;
            this.council = council;
        }

        public String getName(){
            return this.name;
        }

         public String getCouncil(){
            return this.council;
        }

         public double getPopulation(){
            return this.population;
        }

        public static String maxPopulation(City city, City city2)
        {   
            return city.population > city2.population? "First city has a higher population density" : "Second city has a higher population density";
        }

        public void guessTheCountry(String name)
        {
            switch(name){

                case "Kuala Lampur": System.out.println("Kuala Lumpur is the capital of Malaysia"); break;
                case "Rabat": System.out.println("Rabat is the capital of Morocco"); break;
                case "Jakarta": System.out.println("Jakarta is the capital of Indonesia"); break;
                case "Washington, D.C": System.out.println("Washington, D.C is the capital of USA"); break;
                case "London": System.out.println("London is the capital of The United Kingdom"); break;
                case "Chisinau": System.out.println("Chisinau is the capital of Moldova"); break;
                case "Douglas": System.out.println("Douglas is the capital of Isle of Man"); break;
                case "Moscow": System.out.println("Moscow is the capital of Russia"); break;

            default : System.out.println("Input a country of the ones mentioned: Morocco, Malaysia, Indonesia, USA, Russia, The United Kingdom, Moldova, Isle of Man"); break;
                
        }
       
    }
}


