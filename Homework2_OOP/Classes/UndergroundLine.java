public class UndergroundLine extends Vehicle{
   private short passengersPerTrain;
   private float energyConsumed;
   private String routeNumber;
   private short tubeNr;
   private short ticketCost;

    public UndergroundLine(short passengersPerTrain, float energyConsumed, String routeNumber, short tubeNr){
        this.passengersPerTrain = passengersPerTrain;
        this.energyConsumed = energyConsumed;
        this.routeNumber = routeNumber;
        this.tubeNr = tubeNr;
    }

    public UndergroundLine(short ticketCost){
        if(this.passengersPerTrain >= 1000) {
            this.ticketCost = ticketCost; 
            System.out.println("Expected");
            }
        else if(this.passengersPerTrain <= 1000 && this.passengersPerTrain >= 750) {
            this.ticketCost = 20 + (short)ticketCost; 
            System.out.println("Low price increase"); 
            }
        else if(this.passengersPerTrain < 750 && this.passengersPerTrain >= 550) {
            this.ticketCost = 35 + (short)ticketCost; 
            System.out.println("Average price increase"); 
            }
        else if(this.passengersPerTrain < 550) {
            this.ticketCost = 50 + (short)ticketCost; 
            System.out.println("High price increase"); 
            }
    }

    public short getPassengerPerTrain(){
        return this.passengersPerTrain;
    }

    public short getTicketCost(){
        return this.ticketCost;
    }

    public short getTubeNr(){
        return this.tubeNr;
    }

    public float getEnergyConsumed(){
        return this.energyConsumed;
    }

    public String getRouteNumber(){
        return this.routeNumber;
    }

    public void energyConsumption(){
        if(this.energyConsumed > 2300000) {System.out.println(this.tubeNr + "HIGH ENERGY CONSUMPTION RATE");}
        else {System.out.println(this.tubeNr + "NORMAL ENERGY CONSUMPTION RATE"); }
    }


}