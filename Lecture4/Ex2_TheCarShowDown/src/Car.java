public class Car {
    private String type;
    private int numSeats;
    private String fuelType;
    private String color;

    public Car () {
        type = "Sedan";
        numSeats = 5;
        fuelType = "Petrol";
        color = "Black";
    }

    public Car ( String type, int numSeats, String fuelType, String color ) {
        this.type = type;
        this.numSeats = numSeats;
        this.fuelType = fuelType;
        this.color = color;
    }

    public String getType () {
        return type;
    }

    public void setType ( String type ) {
        this.type = type;
    }

    public int getNumSeats () {
        return numSeats;
    }

    public void setNumSeats ( int numSeats ) {
        this.numSeats = numSeats;
    }

    public String getFuelType () {
        return fuelType;
    }

    public void setFuelType ( String fuelType ) {
        this.fuelType = fuelType;
    }

    public String getColor () {
        return color;
    }

    public void setColor ( String color ) {
        this.color = color;
    }

    public void printCar(){
        System.out.println("Car details:");
        System.out.println("Type: " + type);
        System.out.println("Number of seats: " + numSeats);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Color: " + color);
    }
}
