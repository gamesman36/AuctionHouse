import java.util.ArrayList;

public class Bidder {
    private String name;
    private ArrayList<Item> ownedItems;

    Bidder(String name, ArrayList<Item> ownedItems) {
        this.name = name;
        this.ownedItems = ownedItems;
    }

    public String getName() { return name; }
    public ArrayList<Item> getOwnedItems() { return ownedItems; }
}