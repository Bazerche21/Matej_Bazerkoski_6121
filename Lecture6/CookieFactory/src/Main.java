public class Main {
    public static void main ( String[] args ) {
        Cookie cookie1 = new Cookie();
        ChocolateCookie chocolateCookie = new ChocolateCookie(50, "Rectangle", 30);
        ChocolateCookieWithExtras chocolateCookieWithExtras = new ChocolateCookieWithExtras(60, "Hexagon", 50, "Hazelnuts");

        cookie1.print();
        System.out.println();
        chocolateCookie.print();
        System.out.println();
        chocolateCookieWithExtras.print();
        System.out.println();
    }
}