package Implementations.VendingMachine;

public class Inventory {

    String[][] inventory;

    Inventory() {
        inventory = new String[3][3];
    }

    public void updateInventory(String productId, int IncrementCount) {
        int row = Character.getNumericValue(productId.charAt(0));
        int col = Character.getNumericValue(productId.charAt(1));
        inventory[row][col] += IncrementCount;
    }
}
