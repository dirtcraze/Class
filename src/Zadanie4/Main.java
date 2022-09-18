package Zadanie4;

public class Main {
    public static void main(String[] args) {
        RetailItem item[] = new RetailItem[3];
        item[0] = new RetailItem("Kurtka", 12, 159.95);
        item[1] = new RetailItem("Markowe dżinsy", 40, 134.95);
        item[2] = new RetailItem("Koszula", 20, 124.95);

        for (int i=0; i<item.length; i++) {
            System.out.println(item[i].getDescription() + " - " + item[i].getUnitsOnHand() + " - " + item[i].getPrice());
        }
    }
}
