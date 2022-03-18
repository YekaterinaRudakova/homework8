package com.it_academy.onliner.utils;

import io.restassured.response.ResponseBody;

import java.util.List;

public final class ResponseBodyUtils {
    private ResponseBodyUtils() {

    }

    public static <T> List<T> getObjectsByJsonPath(ResponseBody responseBody, String jsonPath,
                                                   Class<T> genericType) {
        return responseBody
                .jsonPath()
                .getList(jsonPath, genericType);
    }
}
