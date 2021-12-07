public class LawApproval{
    public boolean voteDecision;
    public String newLaw;
    public String conclusion;

    public LawApproval(boolean voteDecision, String newLaw, String conclusion){
        this.voteDecision = voteDecision;
        this.newLaw = newLaw;
        this.conclusion = conclusion;
    }

    public boolean getVoteDecision(){
        return this.voteDecision;
    }

    public String getNewLaw(){
        return this.newLaw;
    }

    public String getConclusion(){
        return this.conclusion;
    }

}