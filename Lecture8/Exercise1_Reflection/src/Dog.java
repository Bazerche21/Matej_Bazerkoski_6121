public class Dog extends Animal {

    public String type;
    private String color;

    public Dog(){

    }

    private Dog(int age){
        
    }

    public void display(){
        System.out.println("This is Dog");
    }

    private void makeSound(){
        System.out.println("Woof, woof");
    }

}
