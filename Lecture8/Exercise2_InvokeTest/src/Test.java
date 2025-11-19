public class Test {
    private String s;

    public Test(){
        s = "Programming Languages";
    }

    public void method1(){
        System.out.println("Value of s: " + s);
    }

    public void method2(int n){
        System.out.println("Value of n: " + n);
    }

    private void method3(){
        System.out.println("Private method invoke");
    }
}
