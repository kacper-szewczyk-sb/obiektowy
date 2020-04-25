package shop;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<ProductQuantity> orderElementList;
    private IWarehouse warehouse;

    public Basket() {
        this.orderElementList = new ArrayList<>();
        this.warehouse = new Warehouse();
        this.warehouse.addToWarehouse(new Product("test", 2.1), 10);
        this.warehouse.addToWarehouse(new Product("koszula", 20.0), 1);

    }

    public void basketSummary() {
        for (ProductQuantity orderElement: orderElementList) {
            System.out.println(orderElement.toString());
        }
    }

    public void finalizeBasket() {
        Double totalSum = 0.0;
        for (ProductQuantity orderElement: orderElementList) {
            totalSum += orderElement.getProduct().getPrice() * orderElement.getQuantity();
        }

        System.out.println("Podsumowanie koszyka: " + totalSum);
    }

    public void addToBasket(String productName, int quantity) {
        ProductQuantity orderElement =
                this.warehouse.getFromWarehouse(productName, quantity);
        if (orderElement.getQuantity() == 0) {
            System.out.println("Brak produktu na magazynie");
        }
        else if (orderElement.getQuantity() != quantity) {
            System.out.println("Brak wystarczającej ilości - dodano tyle ile było w magazynie");
            orderElementList.add(orderElement);
        }
        else {
            System.out.println("Dodano produkty do koszyka");
            orderElementList.add(orderElement);
        }
    }

    public void removeFromBasket (String productName, int quantity) {
        // TODO
        // Sprawdzamy czy produkt jest w zamówieniu
        // Sprawdzamy czy produkt jest w takiej ilości jak podano
        // usuwamy jeśli jest
    }
}
