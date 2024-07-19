package org.example.week11_javafxapp_json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonUtil
{
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static Product readProductFromJson(String filePath) throws IOException {
        return objectMapper.readValue(new File(filePath), Product.class);
    }
    public static void writeProductToJson(Product product, String filePath) throws IOException {
        objectMapper.writeValue(new File(filePath), product);
    }
}
