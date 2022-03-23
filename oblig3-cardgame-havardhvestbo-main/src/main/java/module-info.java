module JavaFX.Events {
  requires javafx.graphics;
  requires javafx.controls;
  requires javafx.fxml;
  opens no.ntnu.idatx2001.oblig3.cardgame to javafx.fxml;
  exports no.ntnu.idatx2001.oblig3.cardgame;
}