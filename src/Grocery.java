import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by landonkail on 10/12/15.
 */
public class Grocery {
    public static void main(String[] args) {
        ArrayList<InventoryItem> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> login = new HashMap<>();

        while (true) {
            int itemNum = 1;
            for (InventoryItem s : list) {
                System.out.println(itemNum + " " + s.name + " has a quantity of " + s.quant);
                itemNum++;
            }

            System.out.println("Please choose from the following");
            System.out.println("[1] Create new item for Grocery List");
            System.out.println("[2] Remove item from Grocery List");
            System.out.println("[3] Add more to the quantity of an item");

            String option = scanner.nextLine();
            int optionNum = Integer.valueOf(option);

            if (optionNum == 1) {
                System.out.println("Please enter a new item for the Grocery List");
                String name = scanner.nextLine();
                InventoryItem item = new InventoryItem(name);
                list.add(item);
            }


            if (optionNum == 2) {
                System.out.println("Enter the number of the item you want to remove");
                String remove = scanner.nextLine();
                try {
                    int removeNum = Integer.valueOf(remove);
                    list.remove(removeNum -1);
                } catch (Exception e) {
                    System.out.println("Not a valid item number");
                }

            }

            if (optionNum == 3) {
                System.out.println("Which item number would you like to update the quantity of?");
                String select = scanner.nextLine();
                int selectNum = Integer.valueOf(select);

                System.out.println("How many do you want to add / remove? use - to remove quantity");
                String quantity = scanner.nextLine();
                int quantityNum = Integer.valueOf(quantity);

                InventoryItem item = list.get(selectNum -1);
                item.quant = quantityNum;

            }

        }

    }
}
