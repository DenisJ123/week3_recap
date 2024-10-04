package ie.atu.week3;

import java.util.ArrayList;
import java.util.List;
public class Service {
    private List<Product> productList = new ArrayList<>();
    public List<Product> getProductList() {
        return productList;
    }
    public String addProduct(Product product) {
        productList.add(product);
        return "Product added";
    }


}

