package org.example.week11_javafxapp_json;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

import java.io.IOException;

public class MainController {

    private static final String FILE_PATH = "products.json";

    @FXML
    protected void handleReadJson(ActionEvent event) {
        try {
            Product product = JsonUtil.readProductFromJson(FILE_PATH);
            showAlert("Read JSON", "Product read from JSON:\n" + product.getName());
        } catch (IOException e) {
            showAlert("Error", "Failed to read JSON: " + e.getMessage());
        }
    }

    @FXML
    protected void handleWriteJson(ActionEvent event) {
        try {
            Product product = new Product();
            product.setId(1);
            product.setName("Sample Product");
            product.setOrderDate(new java.util.Date());
            product.setManufacturer("Sample Manufacturer");

            JsonUtil.writeProductToJson(product, FILE_PATH);
            showAlert("Write JSON", "Product written to JSON successfully!");
        } catch (IOException e) {
            showAlert("Error", "Failed to write JSON: " + e.getMessage());
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}