public class Governor{
    private String name;
    private String surname;
    private String party;
    private LawApproval lawApproval;

    public Governor(String name, String surname, String party){
        this.name = name;
        this.surname = surname;
        this.party = party;
        
    }

    public void setLawApproval(){
        this.lawApproval = new LawApproval();
        this.lawApproval.setVoteDecision();
        this.lawApproval.setNewLaw();
        this.lawApproval.setConclusion();
    }

    public LawApproval getLawApproval(){
        return this.lawApproval;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getParty(){
        return this.party;
    }



}