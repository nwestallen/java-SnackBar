package snackbar;

public class Customer {
    
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash = 0; 

    public Customer(String name) {

        maxId ++;
        this.id = maxId;
        this.name = name;

    }

    public Customer(String name, double cash) {

        maxId ++;
        this.id = maxId;
        this.name = name;
        this.cash = cash;
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void addCash(double cash) {
        this.cash += cash;
    }

    public void buySnack(Snack snack, int quantity) {
        this.cash -= snack.getCost() * quantity;
        snack.sellSnack(quantity);
    }


}
