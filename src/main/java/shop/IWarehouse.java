package shop;

public interface IWarehouse {

    void addToWarehouse(Product product, int quantity);
    OrderElement getFromWarehouse(String productName, int quantity);
}
