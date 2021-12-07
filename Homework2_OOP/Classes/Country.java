
public class Country { 
    private String name;
    private String flag;
    private String capital;
    private String currency;

    public Country(String name, String flag, String capital, String currency){
        this.name = name;
        this.flag = flag;
        this.capital = capital;
        this.currency = currency;

    }

    public String getName(){
        return this.name;
    }

    public String getFlag(){
        return this.flag;
    }

    public String getCapital(){
        return this.capital;
    }

    public String getCurrency(){
        return this.currency;
    }
    
    public void guessTheCapital(String country){

        if(country == "Morocco") System.out.println("Rabat is the capital of Morocco");
        else if(country == "Malaysia") System.out.println("Kuala Lumpur is the capital of Malaysia");
        else if(country == "Indonesia") System.out.println("Jakarta is the capital of Indonesia");
        else if(country == "USA") System.out.println("Washington, D.C is the capital of USA");
        else if(country == "Russia") System.out.println("Moscow is the capital of Russia");
        else if(country == "The United Kingdom") System.out.println("London is the capital of The United Kingdom");
        else if(country == "Moldova") System.out.println("Chisinau is the capital of Moldova");
        else if(country == "Isle of Man") System.out.println("Douglas is the capital of Isle of Man");
        else{
            System.out.println("Input a country of the ones mentioned: Morocco, Malaysia, Indonesia, USA, Russia, The United Kingdom, Moldova, Isle of Man");
            }

    }




}