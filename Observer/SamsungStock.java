package Observer;

import java.util.ArrayList;
import java.util.List;

public class SamsungStock implements IStockObservable {

    public int stockCount = 0;
    public List<INotificationAlertObserver> observers = new ArrayList<>();

    @Override
    public void setStockCount(int newStocksAdded) {
        stockCount += newStocksAdded;
        if (stockCount == newStocksAdded) {
            notifySubscribers();
        }
    }

    @Override
    public void add(INotificationAlertObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(INotificationAlertObserver observer) {

    }

    @Override
    public void notifySubscribers() {
        for (INotificationAlertObserver subs : observers) {
            subs.update();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

}
