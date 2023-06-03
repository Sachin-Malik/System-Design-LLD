package Observer;

public class MobileNotification implements INotificationAlertObserver {

    IStockObservable observer;
    String mobileUserName;

    MobileNotification(String userName, IStockObservable observer) {
        this.observer = observer;
        mobileUserName = userName;
    }

    @Override
    public void update() {
        sentNotificationToMobile();
    }

    public void sentNotificationToMobile() {
        System.out.println("Notification sent to Mobile to " + mobileUserName);
        System.out.println("Hurry we only have " + observer.getStockCount() + " Stocks");
    }

}
