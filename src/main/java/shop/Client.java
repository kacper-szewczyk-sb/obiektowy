package shop;

public class Client {


    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addToBasket("test", 2);
        basket.addToBasket("koszula", 3);
        basket.addToBasket("jeansy", 1);
        basket.basketSummary();
        basket.finalizeBasket();

    }
}
