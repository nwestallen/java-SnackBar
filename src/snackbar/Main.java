package snackbar;

public class Main {

    public static void main() {
        System.out.println("snackbar app");

        //Instantiate customers
        Customer Jane = new Customer("Jane", 45.25);
        Customer Bob = new Customer("Bob", 33.14);

        //Instantiate vending machines
        VendingMachine Food = new VendingMachine("Food");
        VendingMachine Drink = new VendingMachine("Drink");
        VendingMachine Office = new VendingMachine("Office");

        //Instantiate Snacks
        Snack Chips = new Snack("Chips", 1.75, 1);
        Snack ChocolateBar =  new Snack("Chocolate Bar", 1.00, 1);
        Snack Pretzel = new Snack("Pretzel", 2.00, 1);

        Snack Soda = new Snack("Soda", 2.50, 2);
        Snack Water = new Snack("Water", 2.75, 2);

    }
    
}
