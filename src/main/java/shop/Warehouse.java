package shop;

import java.util.HashMap;
import java.util.Map;

public class Warehouse implements IWarehouse {
    Map<String, ProductQuantity> productMap;

    public Map<String, ProductQuantity> getProductMap() {
        return productMap;
    }

    public Warehouse() {
        this.productMap = new HashMap<>();
    }

    @Override
    public void addToWarehouse(Product product, int quantity) {
        if (this.productMap.containsKey(product.getName())) {
            ProductQuantity productQuantity = this.productMap.get(product.getName());
            Integer newQuantity =
                    productQuantity.getQuantity() + quantity;
            productQuantity.setQuantity(newQuantity);
            this.productMap.put(product.getName(), productQuantity);
        }
        else {
            ProductQuantity productQuantity = new ProductQuantity(product, quantity);
            this.productMap.put(product.getName(), productQuantity);
        }
    }

    @Override
    public ProductQuantity getFromWarehouse(String productName, int quantity) {
        if (this.productMap.containsKey(productName)) {
            ProductQuantity productQuantity = this.productMap.get(productName);
            Integer numberOfElementsTakenFromWarehouse =
                    Math.min(productQuantity.getQuantity(), quantity);
            ProductQuantity orderElement = new ProductQuantity(
                    productQuantity.getProduct(),
                    numberOfElementsTakenFromWarehouse);
            Integer newQuantity =
                    productQuantity.getQuantity() -
                    numberOfElementsTakenFromWarehouse;
            productQuantity.setQuantity(newQuantity);
            this.productMap.put(productName, productQuantity);
            return orderElement;
        }
        else {
            return new ProductQuantity(
                    new Product(productName, 2.0),
                    0);
        }
    }
}
