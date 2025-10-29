public class Cookie {
    private double weight;
    private String shape;

    public Cookie(){
        this.shape = "Round";
        this.weight = 5.2;
    }

    public Cookie ( double weight, String shape ) {
        this.weight = weight;
        this.shape = shape;
    }

    public double getWeight () {
        return weight;
    }

    public void setWeight ( double weight ) {
        this.weight = weight;
    }

    public String getShape () {
        return shape;
    }

    public void setShape ( String shape ) {
        this.shape = shape;
    }

    public void print(){
        System.out.println("Cookie details:");
        System.out.println("Shape: " + shape);
        System.out.println("Weight: " + weight);
    }

}
