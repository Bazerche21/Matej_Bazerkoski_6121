public class Main {
    public static void main(String[] args) {
        Car car = new Car(4,4);
        car.startEngine();
        car.openAllDoors();
        car.deinflateWheel(3);
        car.deinflateWheel(7);
        car.inflateWheel(0);
        car.closeTrunk();
        car.stopEngine();
    }
}