public class Main {
    public static void main ( String[] args ) {
        Vehicle vehicle1 = new Vehicle("Tesla", 4, 50.0, 4.5);
        Vehicle vehicle2 = new Vehicle("RoadRunner", 2, 60, 3.5);

        System.out.println("Vehicle 1 can go " + vehicle1.howFar());
        System.out.println("Vehicle 2 can go " + vehicle2.howFar());

        vehicle1.compare(vehicle2);
    }
}