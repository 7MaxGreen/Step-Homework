public class CityInfrastructure{

    public String[] busLine;
    public String[] undergroundLine;
    public String[] carPublicLine;
    public String[] waterDrainageSystem;
    public String[] bridgeSystem;
    public String[] telecommunicationSystem;
    public String[] railTransport;
    public String[] healthServices;
    public String[] educationalServices;



    // public static int count(arr[]){
    //     int counter = 0;

    //     for (int i = 0; i < arr[].length; i++)
    //     {if (arr[i] != null)
    //     counter ++;
    //     }
    //     return counter;
    // }


    public void summary(){

        System.out.println("Bus line" + busLine + "will have access to the bridge" + bridgeSystem + "which is the same for the car public line" + carPublicLine +"and" + 
        healthServices + "health Institution, all of them considered to be users of " + telecommunicationSystem + "telecommunication");

        System.out.println("Rail transport" + railTransport + "was meant to ease access for our students at" + educationalServices+". ");

    }

}