public class Government{
    public String name;
    public String surname;
    public String party;

    boolean decision;

    public String newLaw;
    public String conclusion;

    public void offerNewLaw(){
        System.out.println(name +" "+ surname + " from " + party +"party has proposed for a decision a substitute law regarding State Regulation of the Conditions of Commercial Transactions");
    }

    public void newLawDecision(boolean decision, String newLaw){
        if(decision == true) {
            System.out.println("The official substitute law which is "+ newLaw +" has been approved by the Parliament");
        } else System.out.println("Law has been denied due to: " + conclusion);
    }
}