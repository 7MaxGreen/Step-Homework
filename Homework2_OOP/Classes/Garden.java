public class Garden{
    public float length;
    public float width;

    public boolean plants;


    public void checkForPlants(boolean plants){
        if(plants == true) System.out.println("Good job, keep planting!");
        else System.out.println("Love it or hate it, you MUST plant and grow some TREES!!!");
    }

      public float perimeterCalculate(float length, float width){
          float result = 0;

        if(length == width) result = length * 4;
        else if(length != width) result = (length * 2) + (width * 2);
        return result;
    }
}