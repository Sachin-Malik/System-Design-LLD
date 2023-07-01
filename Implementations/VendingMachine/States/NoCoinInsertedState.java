package Implementations.VendingMachine.States;

import Implementations.VendingMachine.VendingMachine;

public class NoCoinInsertedState implements State {
    VendingMachine vendingMachine;

    public NoCoinInsertedState(VendingMachine vendingMachine) {

        this.vendingMachine = vendingMachine;
    }

    @Override
    public void addCoin(int amount) {
        this.vendingMachine.amount = amount;
        System.out.println("Amount is now equal to " + amount);
        vendingMachine.setState("COIN_INSERTED_STATE");
    }

    @Override
    public void makeSelection(String productId) {
        throw new UnsupportedOperationException("Zero Funds");
    }

    @Override
    public void dispense(String productId) {
        throw new UnsupportedOperationException("Zero Funds");
    }

}
