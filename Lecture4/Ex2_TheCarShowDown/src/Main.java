public class Main {
    public static void main ( String[] args ) {

//        Car car1 = new Car();
//        Car car2 = new Car("Fiat", 4, "Electric", "Green");
//
//        car2.setColor("Pink");
//        car2.setNumSeats(5);
//
//        car1.printCar();
//        car2.printCar();

        Car[] array = new Car[5];
        array[0] = new Car();
        array[1] = new Car("Hatchback", 5, "Diesel", "red");
        array[2] = new Car("Hatchback", 6, "Petrol", "purple");
        array[3] = new Car("Van", 7, "Diesel", "white");
        array[4] = new Car("Sedan", 4, "Petrol", "Dark Blue");
        for(Car car: array){
            car.printCar();
        }
        Car resultCar = maxSeats(array);
        System.out.println("The car with the most seats is: ");
        resultCar.printCar();
    }
    public static Car maxSeats(Car[] cars){
        Car maxSeatsCar = cars[0];
        for (Car c: cars){
            if(c.getNumSeats() > maxSeatsCar.getNumSeats()){
                maxSeatsCar = c;
            }
        }
        return maxSeatsCar;
    }
}