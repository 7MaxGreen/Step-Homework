public class Garage{
    public float length;
    public float width;
    public float height;

    public String rawMaterial; 

    public float volumeCalculate(float length, float width, float height){
        return length * width * height;
    }

    public float perimeterCalculate(float length, float width){
        float result = 0;
        if(length == width)  result = length * 4;
        else if(length != width)  result = (length * 2) + (width * 2);
        return result;
    }
}