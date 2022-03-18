package com.it_academy.onliner.service;

import com.it_academy.onliner.model.Sauce;
import com.it_academy.onliner.utils.GetRequestUtils;
import com.it_academy.onliner.utils.ResponseBodyUtils;
import io.restassured.response.ResponseBody;

import java.util.List;

public class SauceService {
    public List<Sauce> getSauces() {
        String endPoint = "https://catalog.onliner.by/sdapi/catalog.api/search/sushivesla?sushi_typ[0]=souce&sushi_typ[operation]=union";
        ResponseBody responseBody = GetRequestUtils.makeRequestAndGetResponseBody(endPoint, null, null);
        return ResponseBodyUtils.getObjectsByJsonPath(responseBody, "products", Sauce.class);
    }
}
