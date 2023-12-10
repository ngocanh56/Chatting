package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ChatController implements Initializable {

    @FXML
    private VBox chatContainer;

    @FXML
    private VBox messageContainer;

    @FXML
    private TextField messageTextField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize chat, load previous messages, etc.
        // ...
    }

    @FXML
    private void sendMessage() {
        String messageText = messageTextField.getText().trim();
        if (!messageText.isEmpty()) {
            Label messageLabel = new Label(messageText);

            // Apply the style based on whether the message is sent or received
            if (isMessageSentByCurrentUser()) {
                messageLabel.getStyleClass().add("message-box-sent");
            } else {
                messageLabel.getStyleClass().add("message-box-received");
            }

            messageContainer.getChildren().add(messageLabel);
            messageTextField.clear();
        }
    }

    private boolean isMessageSentByCurrentUser() {
        // Add your logic to determine if the message is sent by the current user
        // For example, you can compare with a predefined username or user ID
        return true; // Change this based on your logic
    }
}
