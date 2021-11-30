public class Gym{
    public String name;
    public String address;
    public short members;
    public short frequencyOfVisit;

    public void checkSize(short members){
    if(members >= 50 && members < 100) { System.out.println("This is a medium-small gym");}
    else if(members >= 100) {System.out.println("This is a large gym");}
    else {System.out.println("This is an enourmos gym");}
    
    }

    public void checkMastery(short frequencyOfVisit){
        if (frequencyOfVisit < 300) {System.out.println("Begginer - Good work, keep doing the great job.");}
        else if (frequencyOfVisit >= 300 && frequencyOfVisit <= 900) {System.out.println("You look awesome, always an example to newcomers");}
        else if(frequencyOfVisit>900){System.out.println("Bulky and healthy, you got the high standards!");}
    }


}