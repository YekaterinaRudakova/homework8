package com.it_academy.onliner_api_tester;

import com.it_academy.onliner.model.Product;
import com.it_academy.onliner.service.ProductService;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ProductTest {

    @Test
    public void testCheckListOfProducts() {
        ProductService productService = new ProductService();
        List<Product> products = productService.getProducts();
        System.out.println(products.toString());
        List<String> names = new ArrayList<>();
        products.stream().map(Product::getName).forEach(names::add);
        System.out.println(names);
        assertThat(names.iterator())
                .as("There is no data about products")
                .isNotNull()
                .hasNext();
    }
}
