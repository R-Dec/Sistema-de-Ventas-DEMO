package demo.view.content;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class SelectorBar {

    private StackPane stackPane;
    private VBox vBox;

    private Button buttonSale;
    private Button buttonInventory;
    private Button buttonSupplier;

    public SelectorBar() {

        stackPane = new StackPane();
        stackPane.getStyleClass().add("selector-bar");
        stackPane.setMaxWidth(40);

        vBox = new VBox();

        buttonSale = new Button("S");
        buttonSale.getStyleClass().add("button-sale");
        buttonSale.setPrefHeight(40);
        buttonSale.setPrefWidth(40);

        buttonInventory = new Button("I");
        buttonInventory.getStyleClass().add("button-inventory");
        buttonInventory.setPrefHeight(40);
        buttonInventory.setPrefWidth(40);

        buttonSupplier = new Button("P");
        buttonSupplier.getStyleClass().add("button-supplier");
        buttonSupplier.setPrefHeight(40);
        buttonSupplier.setPrefWidth(40);

        vBox.getChildren().addAll(buttonSale, buttonInventory, buttonSupplier);

        stackPane.getChildren().add(vBox);

        stackPane.getStylesheets().add("styles/SelectorBar.css");

    }

    public StackPane getStackPane() {

        return stackPane;

    }

}
