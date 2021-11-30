public class Candle{
   
        public String waxColor;

        public String candleWick;

        public static String form;

        // public Candle(String waxColor, String candleWick, String form){
        //     this.waxColor = waxColor;
        //     this.candleWick = candleWick;
        //     this.form = form;
        // }


        public void lighted(boolean lighter){
            if(lighter == true){
                System.out.println("The candle has been lighted using a lighter");
            } else {
                System.out.println("There is no lighter to light a candle");
            }
        }


        public void lightTheCandle(String form, String waxColor, String candleWick){

            System.out.println("The " + form + "candle" + "with" + waxColor + "has been burning for half an hour, however the" + candleWick + "is still big enough for plenty hours ahead" );

        } 
    
} 