public class Garden{
    private float length;
    private float width;
    private boolean plants;

    public void setLength(float length){
        this.length = length;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public void setPlants(boolean plants){
        this.plants = plants;
    }

    public float getLength(){
        return this.length;
    }

    public float getWidth(){
        return this.width;
    }

    public boolean getPlants(){
        return this.plants;
    }


    public String checkForPlants(){
       String result =  (this.plants == true) ? "Good job, keep planting!" : "Love it or hate it, you MUST plant and grow some TREES!!!";
       return result;
    }

      public float perimeterCalculate(){
          float result = 0;

        if(this.length == this.width) result = this.length * 4;
        else if(this.length != this.width) result = (this.length * 2) + (this.width * 2);
        return result;
    }
}