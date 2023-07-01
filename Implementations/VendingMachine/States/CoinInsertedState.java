package Implementations.VendingMachine.States;

import java.util.Scanner;

import Implementations.VendingMachine.VendingMachine;

public class CoinInsertedState implements State {
    VendingMachine vendingMachine;

    public CoinInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void addCoin(int amount) {
        System.out.println("Added to Existing Balance");
        this.vendingMachine.amount += amount;
    }

    @Override
    public void makeSelection(String productId) {
        System.out.println("Your Product is selected");
        vendingMachine.setState("DISPENCE_STATE");
    }

    @Override
    public void dispense(String productId) {
        throw new UnsupportedOperationException("Please Select a Product");
    }

    private String takeInputFromUser() {
        Scanner sc = new Scanner(System.in);
        var productCode = sc.nextLine();
        sc.close();
        return productCode;
    }

}
