package snackbar;

public class Snack {

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity = 0;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, double cost, int vendingMachineId) {
        
        maxId ++;
        this.id = maxId;
        this.name = name;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost; 
    }

    public int getVendingId() {
        return vendingMachineId;
    }

    public void setVendingId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    public void sellSnack(int quantity) {
        this.quantity -= quantity;
    }


}
