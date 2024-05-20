module org.localchat.serverrmi {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.localchat.serverrmi to javafx.fxml;
    exports org.localchat.serverrmi;
}