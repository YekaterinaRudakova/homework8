package com.it_academy.onliner.service;

import com.it_academy.onliner.model.Product;
import com.it_academy.onliner.utils.GetRequestUtils;
import com.it_academy.onliner.utils.ResponseBodyUtils;
import io.restassured.response.ResponseBody;

import java.util.List;

public class ProductService {
    public List<Product> getProducts() {
        String endPoint = "https://catalog.onliner.by/sdapi/catalog.api/search/sushivesla";
        ResponseBody responseBody = GetRequestUtils.makeRequestAndGetResponseBody(endPoint, null, null);
        return ResponseBodyUtils.getObjectsByJsonPath(responseBody, "products", Product.class);
    }
}
