package Implementations.VendingMachine;

import Implementations.VendingMachine.States.CoinInsertedState;
import Implementations.VendingMachine.States.DispenseState;
import Implementations.VendingMachine.States.NoCoinInsertedState;
import Implementations.VendingMachine.States.State;

public class VendingMachine {

    NoCoinInsertedState noCoinInsertedState;
    CoinInsertedState coinInsertedState;
    DispenseState dispenseState;
    State currentState;

    Inventory inventory;
    public int amount;

    VendingMachine() {
        noCoinInsertedState = new NoCoinInsertedState(this);
        dispenseState = new DispenseState(this);
        coinInsertedState = new CoinInsertedState(this);
        currentState = new NoCoinInsertedState(this);
        inventory = new Inventory();
    }

    public void addCoin(int amount) {
        this.currentState.addCoin(amount);
    }

    public void makeSelection(String productId) {
        this.currentState.makeSelection(productId);
        System.out.println("You Selected the " + productId);
        dispense(productId);
    }

    public void dispense(String productId) {
        currentState.dispense(productId);
        System.out.println("Please Pick Your Product From the Tray");
    }

    public void setState(String state) {
        switch (state) {
            case "NO_COIN_INSERTED_STATE":
                currentState = this.noCoinInsertedState;
                break;
            case "COIN_INSERTED_STATE":
                currentState = this.coinInsertedState;
                break;
            case "DISPENCE_STATE":
                currentState = this.dispenseState;
                break;
            default:
                break;
        }
    }

    public void updateInventory(String productId, int IncrementCount) {
        inventory.updateInventory(productId, IncrementCount);
    }
}
