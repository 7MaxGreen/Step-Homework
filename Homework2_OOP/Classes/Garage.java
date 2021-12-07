public class Garage{
    private float length;
    private float width;
    private float height;
    private String rawMaterial; 


    public void setLength(float length){
        this.length = length;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public void setRawMaterial(String rawMaterial){
        this.rawMaterial = rawMaterial;
    }


    public float getLength(){
        return this.length;
    }

    public float getWidth(){
        return this.width;
    }

    public float getHeight(){
        return this.height;
    }

    public String getRawMaterial(){
        return this.rawMaterial;
    }


    public float volumeCalculate(){
        return this.length * this.width *this. height;
    }

    public float perimeterCalculate(){
        float result = 0;
        if(this.length == this.width)  result = this.length * 4;
        else if(this.length != this.width)  result = (this.length * 2) + (this.width * 2);
        return result;
    }
}