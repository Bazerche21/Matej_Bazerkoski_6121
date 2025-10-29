public class Car {
    private Engine engine;
    private Wheel[] wheels;
    private Door[] door;
    private boolean isClosedTrunk;

    public Car(int numberWheels,int numberDoors) {
        engine = new Engine();
        wheels = new Wheel[numberWheels];
        door = new Door[numberDoors];
        isClosedTrunk=true;

        for(int i=0;i<numberWheels;i++)
        {
            wheels[i]=new Wheel();
        }
        for(int i=0;i<numberDoors;i++)
        {
            door[i]=new Door();
        }

    }
    public void startEngine(){
        engine.start();
    }
    public void stopEngine(){
        engine.stop();
    }
    public void openAllDoors(){
        for (Door door:door)
            door.openDoor();
    }
    public void closeAllDoors(){
        for (Door door:door)
            door.closeDoor();
    }

    public void inflateWheel(int index){
        if (index>=0&&index<wheels.length) {
            wheels[index].inflateWheel();
        }else  {
            System.out.println("Index out of bounds");
        }
    }

    public void deinflateWheel(int index){
        if (index>=0&&index<wheels.length) {
            wheels[index].deflateWheel();
        }else   {
            System.out.println("Index out of bounds");
        }
    }
    public void openTrunk(){
        if(isClosedTrunk)
        {
            isClosedTrunk=true;
            System.out.println("Trunk is opend");
        }else
        {
            System.out.println("Trunk is already opend");
        }
    }
    public void closeTrunk(){
        if(!isClosedTrunk)
        {
            isClosedTrunk=false;
            System.out.println("Trunk is closed");
        }else
        {
            System.out.println("Trunk is already closed");
        }
    }
}

