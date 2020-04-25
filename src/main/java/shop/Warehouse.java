package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse implements IWarehouse {
    Map<String, Integer> productList;

    public Map<String, Integer> getProductList() {
        return productList;
    }

    public void setProductList(Map<String, Integer> productList) {
        this.productList = productList;
    }

    public Warehouse() {
        this.productList = new HashMap<>();
    }

    @Override
    public void addToWarehouse(Product product, int quantity) {
        if (this.productList.containsKey(product.getName())) {
            Integer newQuantity = this.productList.get(product.getName()) + quantity;
            this.productList.put(product.getName(), newQuantity);
        }
        else {
            this.productList.put(product.getName(), quantity);
        }
    }

    @Override
    public OrderElement getFromWarehouse(String productName, int quantity) {
        if (this.productList.containsKey(productName)) {
            Integer warehouseQuantity = this.productList.get(productName);
            Integer numberOfElementsTakenFromWarehouse =
                    Math.min(warehouseQuantity, quantity);
            OrderElement orderElement = new OrderElement(
                    new Product(productName,2.0),
                    numberOfElementsTakenFromWarehouse);
            Integer newQuantity = warehouseQuantity -
                    numberOfElementsTakenFromWarehouse;
            this.productList.put(productName, newQuantity);
            return orderElement;
        }
        else {
            return new OrderElement(
                    new Product(productName, 2.0),
                    0);
        }
    }
}
