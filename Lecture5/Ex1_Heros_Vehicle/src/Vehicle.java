public class Vehicle {

    private String model;
    private int numberOfPass;
    private double gasTankCapacity;
    private double fuelConsumption;

    public Vehicle ( String model, int numberOfPass, double gasTankCapacity, double fuelConsumption ) {
        this.model = model;
        this.numberOfPass = numberOfPass;
        this.gasTankCapacity = gasTankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel () {
        return model;
    }

    public void setModel ( String model ) {
        this.model = model;
    }

    public int getNumberOfPass () {
        return numberOfPass;
    }

    public void setNumberOfPass ( int numberOfPass ) {
        this.numberOfPass = numberOfPass;
    }

    public double getGasTankCapacity () {
        return gasTankCapacity;
    }

    public void setGasTankCapacity ( double gasTankCapacity ) {
        this.gasTankCapacity = gasTankCapacity;
    }

    public double getFuelConsumption () {
        return fuelConsumption;
    }

    public void setFuelConsumption ( double fuelConsumption ) {
        this.fuelConsumption = fuelConsumption;
    }

    public double howFar(){
        double fuelConsumptionPerKm = fuelConsumption / 100;
        return gasTankCapacity/ fuelConsumptionPerKm;
    }

    public void compare(Vehicle other){
        double result1 = this.howFar();
        double result2 = other.howFar();

        if(result1>result2)
        {
            System.out.println(model + " can go further than "+ other.model);
        }
        else if (result2 > result1)
        {
            System.out.println(other.model + " can go further than "+ model);
        }
        else {
            System.out.println(model + " has the same range as " + other.model);
        }
    }
}

