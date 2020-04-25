package shop;

import java.util.List;

public interface IWarehouse {

    void addToWarehouse(Product product, int quantity);
    OrderElement getFromWarehouse(String productName, int quantity);
}
