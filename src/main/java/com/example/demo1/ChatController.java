package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ChatController implements Initializable {

    @FXML
    private VBox messageContainer;

    @FXML
    private TextField messageTextField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize the chat with some sample messages
         // Received from another user
    }

    @FXML
    private void sendMessage() {
        String messageText = messageTextField.getText().trim();
        if (!messageText.isEmpty()) {
            // Add the sent message to the chat
            addMessage(messageText, true);

            // Simulate receiving a response (you can replace this with actual logic)
            String response = "Received: " + messageText;
            addMessage(response, false);

            messageTextField.clear();
        }
    }

    private void addMessage(String message, boolean sentByCurrentUser) {
        Label messageLabel = new Label(message);

        // Apply the style based on whether the message is sent or received
        if (sentByCurrentUser) {
            messageLabel.getStyleClass().add("message-box-sent");
        } else {
            messageLabel.getStyleClass().add("message-box-received");
        }

        messageContainer.getChildren().add(messageLabel);
    }
}
