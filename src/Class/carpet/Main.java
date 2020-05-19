package Class.carpet;

public class Main {

    public static void main(String[] args) {

        Carpet c = new Carpet();
        System.out.println(c.totalPrice); //200

        Carpet c2 = new Carpet(100.5, 100.2, 60, false);
        System.out.println(c2.totalPrice); //12042.0

        Carpet c3 = new Carpet(20.0, 20.0, 2.0, false);
        System.out.println(c3.totalPrice); //80.0

        Carpet c4 = new Carpet(20.0, 20.0, 2.0, true);
        System.out.println(c4.totalPrice); //280.0



    }



}
