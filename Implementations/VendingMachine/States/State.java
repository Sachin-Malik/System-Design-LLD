package Implementations.VendingMachine.States;

public interface State {

    public void addCoin(int amount);

    public void makeSelection(String productId);

    public void dispense(String productId);
}
