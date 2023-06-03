package Observer;

public interface IStockObservable {

    public void add(INotificationAlertObserver observer);

    public void remove(INotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);

    public int getStockCount();

}