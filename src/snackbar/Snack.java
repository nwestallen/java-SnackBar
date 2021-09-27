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

    private int getId() {
        return id;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
    
    private int getQuantity() {
        return quantity;
    }

    private void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    private double getCost() {
        return cost;
    }

    private void setCost(double cost) {
        this.cost = cost; 
    }

    private int getVendingId() {
        return vendingMachineId;
    }

    private void setVendingId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }


}
