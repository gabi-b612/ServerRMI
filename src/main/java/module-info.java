module org.localchat.serverrmi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.rmi;
    requires org.mariadb.jdbc;


    opens org.localchat.serverrmi to javafx.fxml;
    exports org.localchat.serverrmi;
}