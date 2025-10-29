public class Engine {
    private boolean isStarted;

    public Engine() {
        isStarted = false;
    }

    public void start(){
        if(!isStarted){
            isStarted = true;
            System.out.println("Starting Engine");
        }else {
            System.out.println("Engine is already started.");
        }
    }

    public void stop(){
        if(isStarted){
            isStarted = false;
            System.out.println("Stopping Engine");
        }else  {
            System.out.println("Engine is already stopped.");
        }
    }
}
