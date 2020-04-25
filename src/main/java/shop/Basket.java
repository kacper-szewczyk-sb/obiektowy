package shop;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<OrderElement> orderElementList;

    public Basket() {
        this.orderElementList = new ArrayList<>();
    }

    public void basketSummary() {

    }

    public void finilize() {

    }

    public void addToBasket(String productName, int quantity) {
        // TODO
        // Pytamy magazyn o produkt
        // dodajemy produkt do koszyka
        // Wyświetlamy informację jak nie udało się dodać wszystkich produktów
    }

    public void removeFromBasket (String productName, int quantity) {
        // TODO
        // Sprawdzamy czy produkt jest w zamówieniu
        // Sprawdzamy czy produkt jest w takiej ilości jak podano
        // usuwamy jeśli jest
    }
}
