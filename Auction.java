import java.util.ArrayList;

public class Auction {
    private ArrayList<Item> items;
    private ArrayList<Bidder> bidders;

    Auction() {
        this.items = new ArrayList<>();
        this.bidders = new ArrayList<>();
    }

    public void registerNewItem(String name, int price) {
        Item newItem = new Item(name, price);
        items.add(newItem);
    }

    public void registerNewBidder(String name) {
        Bidder newBidder = new Bidder(name, new ArrayList<Item>());
        bidders.add(newBidder);
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " " + item.getPrice());
        }
    }

    public void printBidders() {
        for (Bidder bidder : bidders) {
            System.out.println(bidder.getName());
        }
    }

    public static void main(String[] args) {
        Auction auction = new Auction();
        auction.registerNewBidder("Daniel Wang");
        auction.registerNewBidder("Ola Nordmann");
        auction.registerNewItem("Vase", 500);
        auction.registerNewItem("Painting", 600);
        auction.printItems();
        auction.printBidders();
    }
}