public class Main {
    public static void main(String[] args) {
        Utility[] utility = new Utility[6];
        utility[0] = new Utility("Elecrticity", 60.3);
        utility[1] = new Utility("Heating", 40.2);
        utility[2] = new Utility("Water", 70.3);
        utility[3] = new Utility("Garbage", 20.1);
        utility[4] = new Utility("Parking", 30);
        utility[5] = new Utility("Internet", 20.1);

        double total = 0;
        for (Utility elem: utility) {
            total += elem.getPrice();
        }

        System.out.println("The total cost " + total);

        double average = total / utility.length;
        System.out.println("The average is " + average);

        Utility max = utility[0];
        for (Utility elem:utility) {
            if(elem.getPrice() > max.getPrice()){
                max = elem;
            }
        }
        System.out.println("The most expensive is " + max.getName());
    }
}