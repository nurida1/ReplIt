package Class.StoreProduct;

public class Main {
/*

2. Test your code with the Main.java class:
Create several StoreProduct objects using all Constructors
and print their fields/states to make sure it's correct.
 */

    public static void main(String[] args) {
        StoreProduct product1 = new StoreProduct("Tomato", 20, "Vegetables",true, 9) ;
        System.out.println(product1);

        StoreProduct product2 = new StoreProduct("Juice", 10,"Drink", true);
        System.out.println(product2);

        StoreProduct product3 = new StoreProduct("Apples", 15, 20);
        System.out.println(product3);

        StoreProduct product4 = new StoreProduct("Peaches", 50);
        System.out.println(product4);

        product3.expired(true);
        System.out.println(product3); //Apples 15 misc false 0

        product1.sale(4);
        System.out.println(product1);  //Tomato 20 Vegetables true 5

        //product4.getDiscountedPrice(0.3);
        System.out.println(product4.getDiscountedPrice(0.3)); //35.0

    }


}
