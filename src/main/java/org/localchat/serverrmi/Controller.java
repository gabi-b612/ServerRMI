//package org.localchat.serverrmi;
//
//import javafx.fxml.FXML;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Button;
//import javafx.scene.control.ListView;
//import javafx.scene.control.TextField;
//
//import org.localchat.serverrmi.dao.User;
//import org.localchat.serverrmi.services.LoginServices;
//
//import java.sql.SQLException;
//
//public class Controller {
//    @FXML
//    private ListView<String> userList;
//    @FXML
//    private TextField nameField;
//    @FXML
//    private TextField loginField;
//    @FXML
//    private TextField passwordField;
//    @FXML
//    private Button addButton;
//
//    private LoginServices loginServices;
//
//    @FXML
//    public void initialize() {
//        loginServices = new LoginServices();
//
//        addButton.setOnAction(event -> {
//            try {
//                addUser();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//    }
//
//
//    private void addUser() throws Exception{
//        String name = nameField.getText();
//        String login = loginField.getText();
//        String password = passwordField.getText();
//
//        User newUser = new User(name, login, password);
//        try {
//            User inscrit = loginServices.seConnecter(newUser);
//            nameField.clear();
//            loginField.clear();
//            passwordField.clear();
//            if (inscrit == null) {
//                showAlert("Pas connecter");
//
//            }
//        } catch (Exception e) {
//            showAlert(e.getMessage());
//        }
//    }
//
//    private void showAlert(String message) {
//        Alert alert = new Alert(Alert.AlertType.ERROR);
//        alert.setTitle("Error");
//        alert.setHeaderText(null);
//        alert.setContentText(message);
//        alert.showAndWait();
//    }
//}