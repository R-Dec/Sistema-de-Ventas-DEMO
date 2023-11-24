package demo.view.content.ports;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Sale {

    private ScrollPane scrollPane;
    private StackPane stackPane;
    private HBox hBox;
    private VBox vBox;
    private StackPane customerInformation;
    private StackPane productInformation;

    private VBox customerVbox;
    private VBox productVbox;

    // Customer Information
    private Label customerInformationLabel;
    private Label customerDni;
    private TextField customerDniField;
    private HBox customerDniHBox;
    private Label customerName;
    private TextField customerNameField;
    private HBox customerNameHBox;
    private Label customerLastName;
    private TextField customerLastNameField;
    private HBox customerLastNameHBox;
    private Label customerPhoneNumber;
    private TextField customerPhoneNumberField;
    private HBox customerPhoneNumberHBox;
    private Label customerEmail;
    private TextField customerEmailField;
    private HBox customerEmailHBox;

    // Product Information
    private Label productInformationLabel;
    private TextField product;
    private Button select;
    private HBox productHBox;
    private Label productName;
    private TextField productNameField;
    private HBox productNameHBox;
    private Label productCode;
    private TextField productCodeField;
    private HBox productCodeHBox;
    private Label productUnits;
    private TextField productUnitsField;
    private VBox productUnitsVBox;
    private Label productUnitPrice;
    private TextField productUnitPriceField;
    private VBox productUnitPriceVBox;
    private HBox productUnitsTotalHBox;
    private Label productTotalPrice;
    private TextField productTotalPriceField;
    private VBox productTotalPriceVBox;
    private Button calculatePrice;
    private HBox productTotalPriceHBox;
    private Button addProduct;

    private TableView<ProductData> productTable;
    private TableColumn<ProductData, String> codeColumn;
    private TableColumn<ProductData, String> nameColumn;
    private TableColumn<ProductData, Integer> unitsColumn;
    private TableColumn<ProductData, Double> unitPriceColumn;
    private TableColumn<ProductData, Double> igvColumn;
    private TableColumn<ProductData, Double> totalPriceColumn;
    private TableColumn<ProductData, String> categoryColumn;

    public Sale() {

        stackPane = new StackPane();

        // CUSTOMER INFORMATION
        customerInformation = new StackPane();
        customerInformationLabel = new Label("CUSTOMER INFORMATION");
        customerInformationLabel.getStyleClass().add("customer-title");

        customerDni = new Label("DNI");
        customerDni.getStyleClass().add("label-dni");
        customerDni.setPrefWidth(104);
        customerDni.setPrefHeight(30);
        customerDniField = new TextField();
        customerDniField.getStyleClass().add("customer-dni-field");
        customerDniHBox = new HBox();
        customerDniHBox.getChildren().addAll(customerDni, customerDniField);
        customerDniHBox.setSpacing(16);

        customerName = new Label("Name");
        customerName.getStyleClass().add("label-name");
        customerName.setPrefWidth(104);
        customerName.setPrefHeight(30);
        customerNameField = new TextField();
        customerNameField.getStyleClass().add("customer-name-field");
        customerNameHBox = new HBox();
        customerNameHBox.getChildren().addAll(customerName, customerNameField);
        customerNameHBox.setSpacing(16);

        customerLastName = new Label("Last Name");
        customerLastName.getStyleClass().add("label-last-name");
        customerLastName.setPrefWidth(104);
        customerLastName.setPrefHeight(30);
        customerLastNameField = new TextField();
        customerLastNameField.getStyleClass().add("customer-last-name-field");
        customerLastNameHBox = new HBox();
        customerLastNameHBox.getChildren().addAll(customerLastName, customerLastNameField);
        customerLastNameHBox.setSpacing(16);

        customerPhoneNumber = new Label("Phone Number");
        customerPhoneNumber.getStyleClass().add("label-phone");
        customerPhoneNumber.setPrefWidth(104);
        customerPhoneNumber.setPrefHeight(30);
        customerPhoneNumberField = new TextField();
        customerPhoneNumberField.getStyleClass().add("customer-phone-field");
        customerPhoneNumberHBox = new HBox();
        customerPhoneNumberHBox.getChildren().addAll(customerPhoneNumber, customerPhoneNumberField);
        customerPhoneNumberHBox.setSpacing(16);

        customerEmail = new Label("Email");
        customerEmail.getStyleClass().add("label-email");
        customerEmail.setPrefWidth(104);
        customerEmail.setPrefHeight(30);
        customerEmailField = new TextField();
        customerEmailField.getStyleClass().add("customer-email-field");
        customerEmailHBox = new HBox();
        customerEmailHBox.getChildren().addAll(customerEmail, customerEmailField);
        customerEmailHBox.setSpacing(16);

        customerVbox = new VBox();
        customerVbox.getStyleClass().add("customer-vbox");
        customerVbox.getChildren().addAll(customerInformationLabel, customerDniHBox, customerNameHBox,
                customerLastNameHBox, customerPhoneNumberHBox, customerEmailHBox);

        customerVbox.setSpacing(16);

        customerInformation = new StackPane();
        customerInformation.getStyleClass().add("customer-container");
        customerInformation.getChildren().add(customerVbox);

        // PRODUCT INFORMATION
        productInformation = new StackPane();
        productInformationLabel = new Label("PRODUCT INFORMATION");
        productInformationLabel.getStyleClass().add("product-title");

        product = new TextField();
        product.getStyleClass().add("product-field");
        select = new Button("Select");
        select.getStyleClass().add("select-button");
        productHBox = new HBox();
        productHBox.getChildren().addAll(product, select);
        productHBox.setSpacing(16);

        productName = new Label("Name");
        productName.getStyleClass().add("label-product-name");
        productName.setPrefWidth(41);
        productName.setPrefHeight(30);
        productNameField = new TextField();
        productNameField.getStyleClass().add("product-name-field");
        productNameHBox = new HBox();
        productNameHBox.getChildren().addAll(productName, productNameField);
        productNameHBox.setSpacing(32);

        productCode = new Label("Code");
        productCode.getStyleClass().add("label-product-code");
        productCode.setPrefWidth(41);
        productCode.setPrefHeight(30);
        productCodeField = new TextField();
        productCodeField.getStyleClass().add("product-code-field");
        productCodeHBox = new HBox();
        productCodeHBox.getChildren().addAll(productCode, productCodeField);
        productCodeHBox.setSpacing(32);

        productUnits = new Label("Units");
        productUnits.getStyleClass().add("label-product-units");
        productUnitsField = new TextField();
        productUnitsField.getStyleClass().add("product-units-field");
        productUnitsVBox = new VBox();
        productUnitsVBox.getChildren().addAll(productUnits, productUnitsField);
        productUnitsVBox.setSpacing(8);

        productUnitPrice = new Label("Unit Price");
        productUnitPrice.getStyleClass().add("label-product-unit-price");
        productUnitPriceField = new TextField();
        productUnitPriceField.getStyleClass().add("product-unit-price-field");
        productUnitPriceVBox = new VBox();
        productUnitPriceVBox.getChildren().addAll(productUnitPrice, productUnitPriceField);
        productUnitPriceVBox.setSpacing(8);

        productUnitsTotalHBox = new HBox();
        productUnitsTotalHBox.getChildren().addAll(productUnitsVBox, productUnitPriceVBox);
        productUnitsTotalHBox.setSpacing(16);

        productTotalPrice = new Label("Total Price");
        productTotalPrice.getStyleClass().add("label-product-total-price");
        productTotalPriceField = new TextField();
        productTotalPriceField.getStyleClass().add("product-total-price-field");
        productTotalPriceVBox = new VBox();
        productTotalPriceVBox.getChildren().addAll(productTotalPrice, productTotalPriceField);
        productTotalPriceVBox.setSpacing(8);

        StackPane calculatePricePane = new StackPane();
        calculatePrice = new Button("Calculate Price");
        calculatePrice.getStyleClass().add("calculate-price");
        calculatePricePane.getChildren().add(calculatePrice);

        productTotalPriceHBox = new HBox();
        productTotalPriceHBox.getChildren().addAll(productTotalPriceVBox, calculatePricePane);
        productTotalPriceHBox.setSpacing(18);

        addProduct = new Button("Add Product");
        addProduct.getStyleClass().add("add-product");

        productVbox = new VBox();
        productVbox.getStyleClass().add("product-vbox");
        productVbox.getChildren().addAll(productInformationLabel, productHBox, productNameHBox, productCodeHBox,
                productUnitsTotalHBox,
                productTotalPriceHBox, addProduct);

        productVbox.setSpacing(16);

        productInformation = new StackPane();
        productInformation.getStyleClass().add("product-container");
        productInformation.getChildren().add(productVbox);

        Button sell = new Button("Sell");
        sell.getStyleClass().add("sell-button");

        // Information HBox
        vBox = new VBox();
        vBox.getChildren().addAll(customerInformation, productInformation, sell);
        vBox.setSpacing(40);

        // TABLE
        productTable = new TableView<>();
        productTable.getStyleClass().add("product-table");

        codeColumn = new TableColumn<>("Code");
        codeColumn.setCellValueFactory(new PropertyValueFactory<>("code"));

        nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        unitsColumn = new TableColumn<>("Units");
        unitsColumn.setCellValueFactory(new PropertyValueFactory<>("units"));

        unitPriceColumn = new TableColumn<>("Unit Price");
        unitPriceColumn.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));

        igvColumn = new TableColumn<>("IGV");
        igvColumn.setCellValueFactory(new PropertyValueFactory<>("igv"));

        totalPriceColumn = new TableColumn<>("Total Price");
        totalPriceColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));

        categoryColumn = new TableColumn<>("Category");
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));

        productTable.getColumns().addAll(codeColumn, nameColumn, unitsColumn, unitPriceColumn, igvColumn,
                totalPriceColumn, categoryColumn);

        ProductData product1 = new ProductData();
        product1.setCode("001");
        product1.setName("Product A");
        product1.setUnits(5);
        product1.setUnitPrice(10.0);
        product1.setIgv(1.8);
        product1.setTotalPrice(52.0);
        product1.setCategory("Category1");

        ProductData product2 = new ProductData();
        product2.setCode("002");
        product2.setName("Product B");
        product2.setUnits(3);
        product2.setUnitPrice(8.0);
        product2.setIgv(1.44);
        product2.setTotalPrice(27.0);
        product2.setCategory("Category2");

        productTable.getItems().addAll(product1, product2);

        hBox = new HBox();
        hBox.getChildren().addAll(productTable, vBox);
        stackPane.getChildren().add(hBox);
        scrollPane = new ScrollPane();
        scrollPane.setContent(stackPane);
        scrollPane.getStylesheets().add("styles/Sale.css");

    }

    public static class ProductData {
        private String code;
        private String name;
        private int units;
        private double unitPrice;
        private double igv;
        private double totalPrice;
        private String category;

        // Constructor, getters y setters según sea necesario

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getUnits() {
            return units;
        }

        public void setUnits(int units) {
            this.units = units;
        }

        public double getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
        }

        public double getIgv() {
            return igv;
        }

        public void setIgv(double igv) {
            this.igv = igv;
        }

        public double getTotalPrice() {
            return totalPrice;
        }

        public void setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }
    }

    public ScrollPane getScrollPane() {

        return scrollPane;

    }

}
