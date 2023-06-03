package Observer;

import java.util.Date;

public class EmailNotification implements INotificationAlertObserver {

    String userEmailId;
    IStockObservable observer;
    String observerId;

    EmailNotification(String userEmailId, IStockObservable observer) {
        this.userEmailId = userEmailId;
        this.observer = observer;
        this.observerId = new Date().toString();
    }

    @Override
    public void update() {
        sendEmailNotification();
    }

    public void sendEmailNotification() {
        System.out.println("Email Sent To" + userEmailId);
        System.out.println("You are priority Member " + observer.getStockCount() + " Stocks");

    }
}
