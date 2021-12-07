public class BusLine extends Vehicle{
    private String lineNr;
    private String route;
    private byte ticketCost;
    private byte passengersPerBus;
    
    //super(String make, String model, String variant, String fuelType, String transmissionType, boolean electricBatteries, short yearOfManufacturing, short batteryCapacity);

    public BusLine(String lineNr, String route, byte passengersPerBus, Vehicle vehicle){
        super();
        this.lineNr = lineNr;
        this.route = route;
        this.passengersPerBus = passengersPerBus;
        
    }

    public BusLine(byte ticketCost){
        if(this.passengersPerBus >= 1000) {
            this.ticketCost = ticketCost; 
            System.out.println("Expected");
            }
        else if(this.passengersPerBus <= 1000 && this.passengersPerBus >= 750) {
            this.ticketCost = 20 + (byte)ticketCost; 
            System.out.println("Low price increase"); 
            }
        else if(this.passengersPerBus < 750 && this.passengersPerBus >= 550) {
            this.ticketCost = 35 + (byte)ticketCost; 
            System.out.println("Average price increase"); 
            }
        else if(this.passengersPerBus < 550) {
            this.ticketCost = 50 + (byte)ticketCost; 
            System.out.println("High price increase"); 
            }
    }

    public String getLineNr(){
        return this.lineNr;
    }

      public String getRoute(){
        return this.lineNr;
    }

      public byte getTicketCost(){
        return this.ticketCost;
    }




}