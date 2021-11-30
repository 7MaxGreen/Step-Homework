public class Car{
    
        public String[] roofType;
        public String ChassisControlType;
        public String ESP;
        public String headlightType;
        public String discType;

        public String carModel;
    

    public void summary(String[] carModel){
        if(ESP == "included" && headlightType == "double xenon" && discType == "ventilated"){

           System.out.println("Your suitable option could be " + carModel[1]);     

        } else if ( ESP == "included" && headlightType == "laser" && discType == "drilled" ){

            System.out.println("Your suitable option could be " + carModel[0]);

        } else if ( ESP == "included" && headlightType == "double xenon" && discType == "ceramic"  ){

            System.out.println("Your suitable option could be " + carModel[3]);

        } else if ( ChassisControlType == "four-c" && headlightType == "led" && discType == "flat"  ){

            System.out.println("Your suitable option could be " + carModel[2]);
        }

        
    }
}