package demo.view.content;

import javafx.geometry.Side;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;

public class SelectorBar {

    private StackPane stackPane;
    private TabPane tabPane;
    private Tab tabSale;
    private Tab tabInventory;
    private Tab tabSupplier;

    public SelectorBar() {

        tabPane = new TabPane();

        tabSale = new Tab("Sale");
        tabSale.setClosable(false);

        tabInventory = new Tab("Inventory");
        tabInventory.setClosable(false);

        tabSupplier = new Tab("Supplier");
        tabSupplier.setClosable(false);

        tabPane.getTabs().addAll(tabSale, tabInventory, tabSupplier);
        tabPane.setSide(Side.LEFT);

        stackPane = new StackPane();

        stackPane.getChildren().add(tabPane);

        stackPane.getStylesheets().add("styles/SelectorBar.css");

    }

    public StackPane getStackPane() {

        return stackPane;

    }

}
