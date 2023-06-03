package Observer;

public class Main {
    public static void main(String[] args) {

        SamsungStock samsungStock = new SamsungStock();

        EmailNotification observer1 = new EmailNotification("Sachin@gmail.com", samsungStock);
        MobileNotification observer2 = new MobileNotification("Nitin", samsungStock);
        samsungStock.add(observer1);
        samsungStock.add(observer2);

        samsungStock.setStockCount(3);

    }
}
