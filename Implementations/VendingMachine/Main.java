package Implementations.VendingMachine;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addCoin(5);
        vendingMachine.addCoin(3);
        vendingMachine.makeSelection("22");
    }

}
