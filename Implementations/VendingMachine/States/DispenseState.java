package Implementations.VendingMachine.States;

import Implementations.VendingMachine.Inventory;
import Implementations.VendingMachine.VendingMachine;

public class DispenseState implements State {

    VendingMachine vendingMachine;
    Inventory inventory;

    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void addCoin(int amount) {
        throw new UnsupportedOperationException("Unimplemented method 'addCoin'");
    }

    @Override
    public void makeSelection(String productId) {
        throw new UnsupportedOperationException("Unimplemented method 'makeSelection'");
    }

    @Override
    public void dispense(String productId) {
        System.out.println("Your Proudce is Getting Dispensed...");
        vendingMachine.updateInventory(productId, -1);
        vendingMachine.setState("NO_COIN_INSERTED_STATE");
    }

}
