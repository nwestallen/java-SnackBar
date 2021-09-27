package snackbar;

public class VendingMachine {

    private static int maxId = 0;
    private int id;
    private String name;

    public VendingMachine(String name) {

        maxId ++;
        this.id = maxId;
        this.name = name;

    }

    
}
