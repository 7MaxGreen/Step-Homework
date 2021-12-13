public class LawApproval{
    public boolean voteDecision;
    public String newLaw;
    public String conclusion;


    public void setVoteDecision(){
        System.out.println("Set Law vote decision: ");
        this.voteDecision = Display.sc.nextBoolean();
    }

    public void setNewLaw(){
        System.out.println("Input the new law: ");
        this.newLaw = Display.sc.nextLine();
    }

    public void setConclusion(){
        System.out.println("Set the Law conclusion: ");
        this.conclusion = Display.sc.nextLine();
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