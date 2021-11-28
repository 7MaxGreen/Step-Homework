public class TempConverter{

   public void convertToFahr(double celsius){
       double temp = (celsius * 1.8) + 32;  
       System.out.println("100C to fahr = " + temp + " F");
   }

   public void convertToCelsius(double fahr){
       double temp = (fahr - 32) * 1.8;
       System.out.println("100F to celsius = " + temp + " C");
   }
}