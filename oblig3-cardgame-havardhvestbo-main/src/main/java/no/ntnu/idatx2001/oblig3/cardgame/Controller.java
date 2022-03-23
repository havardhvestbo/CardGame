package no.ntnu.idatx2001.oblig3.cardgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

  @FXML
  private Button checkHand;

  @FXML
  private Button dealHand;

  @FXML
  void checkHand(ActionEvent event) {

  }

  @FXML
  void dealHand(ActionEvent event) {
    DeckOfCards deckOfCards = new DeckOfCards();
    deckOfCards.dealHand(5);
  }

}
