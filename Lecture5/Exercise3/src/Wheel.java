public class Wheel {
    private boolean isInflated;

    public Wheel () {
        this.isInflated = true;
    }

    public void inflateWheel(){
        if(!isInflated){
            isInflated = true;
            System.out.println("Wheel inflated");
        }else{
            System.out.println("Wheel already inflated");
        }
    }

    public void deflateWheel(){
        if(isInflated){
            isInflated = false;
            System.out.println("Wheel deflated");
        }else{
            System.out.println("Wheel already deflated");
        }
    }
}
