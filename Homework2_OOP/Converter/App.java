public class App{
     public static void main (String[] args){

        TempConverter Converter = new TempConverter();
        
        Converter.convertToCelsius(100);
        Converter.convertToFahr(100);

        // System.out.println("100F to celsius = " + Converter.convertToCelsius(100));
        // System.out.println("100C to fahr = " + Converter.convertToFahr(100));

    }
}