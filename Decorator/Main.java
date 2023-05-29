package Decorator;

public class Main {
    public static void main(String[] args) {
        BasePizza farmHouseWithExtraCheese = new ExtraCheese(new FarmHouse());
        System.out.println(farmHouseWithExtraCheese.cost());
    }
}
