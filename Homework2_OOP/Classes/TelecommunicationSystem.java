public class TelecommunicationSystem{
  private  String type;
  private  String regulation;
  private  String technicalConcepts;

    public TelecommunicationSystem(String type, String regulation, String technicalConcepts){
        this.type = type;
        this.regulation = regulation;
        this.technicalConcepts = technicalConcepts;
    }

    public String getType(){
      return this.type;
    }

    public String getRegulation(){
      return this.regulation;
    }

    public String getTechnicalConcepts(){
      return this.technicalConcepts;
    }
}