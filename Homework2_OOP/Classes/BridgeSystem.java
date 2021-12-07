public class BridgeSystem{
   private String form;
   private String rawMaterial;
   private String purpose;

    public BridgeSystem(String form, String rawMaterial, String purpose){
        this.form = form;
        this.rawMaterial = rawMaterial;
        this.purpose = purpose;
    }

    public String getForm(){
        return this.form;
    }

     public String getRawMaterial(){
        return this.rawMaterial;
    }

     public String getPorpose(){
        return this.purpose;
    }

}