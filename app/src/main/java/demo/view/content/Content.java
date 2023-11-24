package demo.view.content;

import demo.view.content.ports.Sale;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class Content {

    private StackPane stackPane;
    private HBox hBox;

    public Content() {

        stackPane = new StackPane();
        hBox = new HBox();

        SelectorBar selectorBar = new SelectorBar();
        Sale sale = new Sale();

        hBox.getChildren().addAll(selectorBar.getStackPane(), sale.getScrollPane());
        stackPane.getChildren().add(hBox);

    }

    public StackPane getStackPane() {

        return stackPane;

    }

}
