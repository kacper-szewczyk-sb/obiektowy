package shop;

public interface IWarehouse {

    void addToWarehouse(Product product, int quantity);
    ProductQuantity getFromWarehouse(String productName, int quantity);
}
