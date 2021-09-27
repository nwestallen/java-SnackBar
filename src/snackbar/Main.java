package snackbar;

public class Main {

    public static void main(String[] args) {
        System.out.println("snackbar app");

        //Instantiate customers
        Customer Jane = new Customer("Jane", 45.25);
        Customer Bob = new Customer("Bob", 33.14);

        //Instantiate vending machines
        VendingMachine Food = new VendingMachine("Food");
        VendingMachine Drink = new VendingMachine("Drink");
        VendingMachine Office = new VendingMachine("Office");

        //Instantiate Snacks
        Snack Chips = new Snack("Chips", 1.75, 1, 36);
        Snack ChocolateBar =  new Snack("Chocolate Bar", 1.00, 1, 36);
        Snack Pretzel = new Snack("Pretzel", 2.00, 1, 30);

        Snack Soda = new Snack("Soda", 2.50, 2, 24);
        Snack Water = new Snack("Water", 2.75, 2, 20);

        Jane.buySnack(Soda, 3);
        System.out.println("Jane's cash on hand is " + Jane.getCash());
        System.out.println("Quantity of soda is " + Soda.getQuantity());
        System.out.println("");

        Jane.buySnack(Pretzel, 1);
        System.out.println("Jane's cash on hand is " + Jane.getCash());
        System.out.println("Quantity of pretzel is " + Pretzel.getQuantity());
        System.out.println("");

        Bob.buySnack(Soda, 2);
        System.out.println("Bob's cash on hand is " + Bob.getCash());
        System.out.println("Quantity of soda is " + Soda.getQuantity());
        System.out.println("");

        System.out.println("Jane found $10!");
        Jane.addCash(10.00);
        System.out.println("Jane's cash on hand is " + Jane.getCash());
        Jane.buySnack(ChocolateBar, 1);
        System.out.println("Jane's cash on hand is " + Jane.getCash());
        System.out.println("Quantity of chocolate bar is " + ChocolateBar.getQuantity());
        System.out.println("");

        System.out.println("12 pretzels added to stock");
        Pretzel.addQuantity(12);
        System.out.println("Quantity of pretzel is " + Pretzel.getQuantity());
        Bob.buySnack(Pretzel, 3);
        System.out.println("Bob's cash on hand is " + Bob.getCash());
        System.out.println("Quantity of pretzel is " + Pretzel.getQuantity());


    }
    
}
