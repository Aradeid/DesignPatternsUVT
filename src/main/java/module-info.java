module sp.bookstore {
    requires javafx.controls;
    requires javafx.fxml;

    opens sp.bookstore to javafx.fxml;
    exports sp.bookstore;
}
