module Covs.and.bulls {
        requires javafx.controls;
        requires javafx.fxml;
        exports  cab_gav to javafx.graphics, javafx.fxml; ///dajom razresenije dlja grafiki
opens cab_gav to javafx.fxml, javafx.base;

        }