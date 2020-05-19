package Class.Pizza;

public class Pizza {

    private String size;
    private int cheeseTop;
    private int pepTop;
    private int hamTop;

    //    Constructor(s) that set all of the instance variables.
    public Pizza (String size, int cheeseTop, int pepTop, int hamTop) {
        this.size = size;
        this.cheeseTop = cheeseTop;
        this.pepTop = pepTop;
        this.hamTop = hamTop;
    }


    //Public methods to get and set the instance variables.
    public String getSize () {
        return  size;
    }

    public void setSize (String size) {
        this.size = size;
    }

    public int getCheeseTop() {
        return cheeseTop;
    }
    public void setCheeseTop ( int cheeseTop) {
        this.cheeseTop = cheeseTop;
    }

    public int getPepTop () {
        return pepTop;
    }

    public void setPepTop (int hamTop) {
        this.pepTop = pepTop;
    }

    public int getHamTop () {
        return hamTop;
    }

    public void setHamTop (int hamTop) {
        this.hamTop = hamTop;
    }



    // A public method named calcCost( ) that returns a double that is the cost
    //    of the pizza.
    public double calcCost () {

        if (size.equalsIgnoreCase("small")) {
            return 10 + 2 * (cheeseTop + pepTop + hamTop);
        } else if (size.equalsIgnoreCase("medium")) {
            return 12 + 2 * (cheeseTop + pepTop + hamTop);
        } else if (size.equalsIgnoreCase("large")){
            return  14 + 2 * (cheeseTop + pepTop + hamTop);
        }else {
            return 0;
        }
    }
    public String getDescription(){

        return size + " Pizza with " + cheeseTop +" Cheese toppings, " + pepTop + " Pepperoni toppings, and "
                + hamTop + " Ham toppings.\nTotal Price: " + calcCost();


    }


}
