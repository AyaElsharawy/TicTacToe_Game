
/*package tictactoe;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class TicTacBase extends BorderPane {

    protected Pane pane;
    protected final GridPane gridPane;
    protected ColumnConstraints columnConstraints;
    protected ColumnConstraints columnConstraints0;
    protected ColumnConstraints columnConstraints1;
    protected RowConstraints rowConstraints;
    protected RowConstraints rowConstraints0;
    protected RowConstraints rowConstraints1;
    protected Button grdButton0_1;
    protected DropShadow grdButton0_1Shadow;
    protected Button grdButton1_1;
    protected DropShadow grdButton1_1Shadow;
    protected Button grdButton1_2;
    protected DropShadow grdButton1_2Shadow;
    protected Button grdButton2_1;
    protected DropShadow grdButton2_1Shadow;
    protected Button button3;
    protected DropShadow dropShadow3;
    protected Button button4;
    protected DropShadow dropShadow4;
    protected Button button5;
    protected DropShadow dropShadow5;
    protected Button button6;
    protected DropShadow dropShadow6;
    protected Button button7;
    protected DropShadow dropShadow7;
    protected DropShadow gridPaneShadow;
    protected Pane pane0;
    protected Label label;
    protected DropShadow dropShadow9;
    protected Label label0;
    protected DropShadow dropShadow10;
    protected Label label1;
    protected DropShadow dropShadow11;
    protected Label Player2;
    protected DropShadow player2Shadow;
    protected Pane pane1;
    protected TextArea textArea;
    protected DropShadow dropShadow13;
    protected Label label3;
    protected DropShadow dropShadow14;
    protected Label label4;
    protected DropShadow dropShadow15;
    protected Label label5;
    protected DropShadow dropShadow16;
    protected Label label6;
    protected DropShadow dropShadow17;
    protected TextField textField;
    protected DropShadow dropShadow18;
    protected Button button8;
    protected DropShadow dropShadow19;
    protected Button button9;
    protected DropShadow dropShadow110;
    protected Button button10;
    protected DropShadow dropShadow111;
    protected Button button11;
    protected DropShadow dropShadow112;
    protected final InnerShadow innerShadow0;
    protected final InnerShadow innerShadow1;
    public volatile int x, y;

    String[][] board = {{"", "", ""},
    {"", "", ""},
    {"", "", ""}};

    public TicTacBase(ClientPlayer client) {

        pane = new Pane();
        gridPane = new GridPane();
        client.gridPaneButtons = gridPane;
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        grdButton0_1 = new Button();
        grdButton0_1Shadow = new DropShadow();
        grdButton1_1 = new Button();
        grdButton1_1Shadow = new DropShadow();
        grdButton1_2 = new Button();
        grdButton1_2Shadow = new DropShadow();
        grdButton2_1 = new Button();
        grdButton2_1Shadow = new DropShadow();
        button3 = new Button();
        dropShadow3 = new DropShadow();
        button4 = new Button();
        dropShadow4 = new DropShadow();
        button5 = new Button();
        dropShadow5 = new DropShadow();
        button6 = new Button();
        dropShadow6 = new DropShadow();
        button7 = new Button();
        dropShadow7 = new DropShadow();
        gridPaneShadow = new DropShadow();
        pane0 = new Pane();
        label = new Label();
        dropShadow9 = new DropShadow();
        label0 = new Label();
        dropShadow10 = new DropShadow();
        label1 = new Label();
        dropShadow11 = new DropShadow();
        Player2 = new Label();
        player2Shadow = new DropShadow();
        pane1 = new Pane();
        textArea = new TextArea();
        dropShadow13 = new DropShadow();
        label3 = new Label();
        dropShadow14 = new DropShadow();
        label4 = new Label();
        dropShadow15 = new DropShadow();
        label5 = new Label();
        dropShadow16 = new DropShadow();
        label6 = new Label();
        dropShadow17 = new DropShadow();
        textField = new TextField();
        client.chatArea = textArea;
        dropShadow18 = new DropShadow();
        button8 = new Button();
        dropShadow19 = new DropShadow();
        button9 = new Button();
        dropShadow110 = new DropShadow();
        button10 = new Button();
        dropShadow111 = new DropShadow();
        button11 = new Button();
        dropShadow112 = new DropShadow();

        innerShadow0 = new InnerShadow();
        innerShadow1 = new InnerShadow();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(750.0);
        setPrefWidth(900.0);
        setStyle("-fx-background-color: black;");

        BorderPane.setAlignment(pane, javafx.geometry.Pos.CENTER);
        pane.setPrefHeight(750.0);
        pane.setPrefWidth(638.0);

        gridPane.setLayoutX(5.0);
        gridPane.setLayoutY(220.0);
        gridPane.setPrefHeight(525.0);
        gridPane.setPrefWidth(628.0);
        gridPane.setStyle("-fx-background-color: black; -fx-border-color: white;");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(grdButton0_1, 0);
        GridPane.setColumnIndex(grdButton0_1, 0);

        grdButton0_1.setMaxHeight(Double.MAX_VALUE);
        grdButton0_1.setMaxWidth(Double.MAX_VALUE);
        grdButton0_1.setMnemonicParsing(false);
        grdButton0_1.setPrefHeight(257.0);
        grdButton0_1.setPrefWidth(304.0);
        grdButton0_1.setStyle("-fx-background-color: black; -fx-border-color: white;");
        grdButton0_1.setFont(new Font("Jokerman", 52.0));
        grdButton0_1.setTextFill(javafx.scene.paint.Color.valueOf("#ffff"));
        innerShadow0.setBlurType(javafx.scene.effect.BlurType.GAUSSIAN);
        Color gray = Color.web("#b2a1a1");
        innerShadow0.setColor(gray);
        innerShadow0.setHeight(80.96);
        innerShadow0.setRadius(36.9025);
        innerShadow0.setWidth(68.65);
        grdButton0_1.setEffect(innerShadow0);

        GridPane.setRowIndex(grdButton1_1, 0);
        GridPane.setColumnIndex(grdButton1_1, 1);

        grdButton1_1.setMaxHeight(Double.MAX_VALUE);
        grdButton1_1.setMaxWidth(Double.MAX_VALUE);
        grdButton1_1.setMnemonicParsing(false);
        grdButton1_1.setPrefHeight(257.0);
        grdButton1_1.setPrefWidth(304.0);
        grdButton1_1.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-fill : black;");
        grdButton1_1.setFont(new Font("Jokerman", 52.0));
        
        innerShadow1.setBlurType(javafx.scene.effect.BlurType.GAUSSIAN);
        Color purple = Color.web("#814681");
        innerShadow1.setColor(purple);
        innerShadow1.setHeight(80.96);
        innerShadow1.setRadius(36.9025);
        innerShadow1.setWidth(68.65);
        grdButton1_1.setEffect(innerShadow1);

        GridPane.setRowIndex(grdButton1_2, 0);
        GridPane.setColumnIndex(grdButton1_2, 2);

        grdButton1_2.setMaxHeight(Double.MAX_VALUE);
        grdButton1_2.setMaxWidth(Double.MAX_VALUE);
        grdButton1_2.setMnemonicParsing(false);
        grdButton1_2.setPrefHeight(257.0);
        grdButton1_2.setPrefWidth(304.0);
        grdButton1_2.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-fill : black;");
        grdButton1_2.setFont(new Font("Jokerman", 52.0));

        grdButton1_2Shadow.setColor(gray);
        grdButton1_2Shadow.setHeight(30.94);
        grdButton1_2Shadow.setRadius(14.8675);
        grdButton1_2Shadow.setSpread(0.3);
        grdButton1_2Shadow.setWidth(30.53);
        grdButton1_2.setEffect(grdButton1_2Shadow);

        GridPane.setRowIndex(grdButton2_1, 1);
        GridPane.setColumnIndex(grdButton2_1, 0);

        grdButton2_1.setMaxHeight(Double.MAX_VALUE);
        grdButton2_1.setMaxWidth(Double.MAX_VALUE);
        grdButton2_1.setMnemonicParsing(false);
        grdButton2_1.setPrefHeight(257.0);
        grdButton2_1.setPrefWidth(304.0);
        grdButton2_1.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-fill : black;");
        grdButton2_1.setFont(new Font("Jokerman", 52.0));

        grdButton2_1Shadow.setColor(purple);
        grdButton2_1Shadow.setHeight(31.35);
        grdButton2_1Shadow.setRadius(14.97);
        grdButton2_1Shadow.setSpread(0.2);
        grdButton2_1Shadow.setWidth(30.53);
        grdButton2_1.setEffect(grdButton2_1Shadow);

        GridPane.setRowIndex(button3, 1);
        GridPane.setColumnIndex(button3, 1);

        button3.setMaxHeight(Double.MAX_VALUE);
        button3.setMaxWidth(Double.MAX_VALUE);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(257.0);
        button3.setPrefWidth(304.0);
        button3.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-fill : black;");
        button3.setFont(new Font("Jokerman", 52.0));

        dropShadow3.setColor(gray);
        dropShadow3.setHeight(30.74);
        dropShadow3.setRadius(14.817499999999999);
        dropShadow3.setSpread(0.3);
        dropShadow3.setWidth(30.53);
        button3.setEffect(dropShadow3);

        GridPane.setRowIndex(button4, 1);
        GridPane.setColumnIndex(button4, 2);

        button4.setMaxHeight(Double.MAX_VALUE);
        button4.setMaxWidth(Double.MAX_VALUE);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(176.0);
        button4.setPrefWidth(247.0);
        button4.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-fill : black;");
        button4.setFont(new Font("Jokerman", 52.0));

        dropShadow4.setColor(purple);
        dropShadow4.setHeight(33.6);
        dropShadow4.setRadius(16.2825);
        dropShadow4.setSpread(0.2);
        dropShadow4.setWidth(33.53);
        button4.setEffect(dropShadow4);

        GridPane.setRowIndex(button5, 2);
        GridPane.setColumnIndex(button5, 0);
        button5.setMaxHeight(Double.MAX_VALUE);
        button5.setMaxWidth(Double.MAX_VALUE);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(257.0);
        button5.setPrefWidth(304.0);
        button5.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-fill : black;");
        button5.setFont(new Font("Jokerman", 52.0));

        dropShadow5.setColor(gray);
        dropShadow5.setHeight(30.74);
        dropShadow5.setRadius(14.817499999999999);
        dropShadow5.setSpread(0.3);
        dropShadow5.setWidth(30.53);
        button5.setEffect(dropShadow5);

        GridPane.setRowIndex(button6, 2);
        GridPane.setColumnIndex(button6, 1);
        button6.setMaxHeight(Double.MAX_VALUE);
        button6.setMaxWidth(Double.MAX_VALUE);
        button6.setMnemonicParsing(false);
        button6.setPrefHeight(210.0);
        button6.setPrefWidth(210.0);
        button6.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-fill : black;");
        button6.setFont(new Font("Jokerman", 52.0));

        dropShadow6.setColor(purple);
        dropShadow6.setHeight(31.35);
        dropShadow6.setRadius(14.97);
        dropShadow6.setSpread(0.2);
        dropShadow6.setWidth(30.53);
        button6.setEffect(dropShadow6);

        GridPane.setRowIndex(button7, 2);
        GridPane.setColumnIndex(button7, 2);

        button7.setMaxHeight(Double.MAX_VALUE);
        button7.setMaxWidth(Double.MAX_VALUE);
        button7.setMnemonicParsing(false);
        button7.setPrefHeight(257.0);
        button7.setPrefWidth(304.0);
        button7.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-fill : black;");
        button7.setFont(new Font("Jokerman", 52.0));

        dropShadow7.setColor(gray);
        dropShadow7.setHeight(29.45);
        dropShadow7.setRadius(14.495000000000001);
        dropShadow7.setSpread(0.3);
        dropShadow7.setWidth(30.53);
        button7.setEffect(dropShadow7);
        Color red = Color.web("#d21212");
        gridPaneShadow.setColor(red);
        gridPaneShadow.setHeight(10.98);
        gridPaneShadow.setRadius(5.112500000000001);
        gridPaneShadow.setSpread(0.06);
        gridPaneShadow.setWidth(11.47);
        gridPane.setEffect(gridPaneShadow);

        pane0.setPrefHeight(211.0);
        pane0.setPrefWidth(640.0);
        pane0.setStyle("-fx-background-color: black;");

        label.setLayoutX(58.0);
        label.setLayoutY(35.0);
        label.setPrefHeight(142.0);
        label.setPrefWidth(150.0);
        label.setStyle("-fx-background-radius: 100; -fx-border-color: white; -fx-border-radius: 100; -fx-padding: 5; -fx-label-padding: 20;");

        dropShadow9.setColor(gray);
        dropShadow9.setHeight(30.4);
        dropShadow9.setRadius(14.7325);
        dropShadow9.setSpread(0.85);
        dropShadow9.setWidth(30.53);
        label.setEffect(dropShadow9);

        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setLayoutX(275.0);
        label0.setLayoutY(74.0);
        label0.setPrefHeight(64.0);
        label0.setPrefWidth(30.0);
        label0.setText("V");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#bab8b8"));
        label0.setFont(new Font(40.0));
        //Color gray = Color.web("#b2a1a1");
        dropShadow10.setColor(gray);
        dropShadow10.setSpread(0.47);
        label0.setEffect(dropShadow10);

        label1.setAlignment(javafx.geometry.Pos.CENTER);
        label1.setLayoutX(305.0);
        label1.setLayoutY(74.0);
        label1.setPrefHeight(64.0);
        label1.setPrefWidth(30.0);
        label1.setText("S");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#bab8b8"));
        label1.setFont(new Font(40.0));

        dropShadow11.setColor(gray);
        dropShadow11.setSpread(0.47);
        label1.setEffect(dropShadow11);

        Player2.setLayoutX(398.0);
        Player2.setLayoutY(35.0);
        Player2.setPrefHeight(142.0);
        Player2.setPrefWidth(146.0);
        Player2.setStyle("-fx-background-radius: 100; -fx-border-color: white; -fx-border-radius: 100; -fx-padding: 5; -fx-label-padding: 20;");

        player2Shadow.setColor(gray);
        player2Shadow.setHeight(30.53);
        player2Shadow.setRadius(14.765);
        player2Shadow.setSpread(0.88);
        player2Shadow.setWidth(30.53);
        Player2.setEffect(player2Shadow);
        setLeft(pane);

        BorderPane.setAlignment(pane1, javafx.geometry.Pos.CENTER);
        pane1.setPrefHeight(554.0);
        pane1.setPrefWidth(262.0);
        pane1.setStyle("-fx-background-color: black;");

        textArea.setCache(true);
        textArea.setLayoutX(11.0);
        textArea.setLayoutY(220.0);
        textArea.setMaxHeight(Double.MAX_VALUE);
        textArea.setMaxWidth(Double.MAX_VALUE);
        textArea.setMouseTransparent(true);
        textArea.setPrefHeight(331.0);
        textArea.setPrefWidth(239.0);
        textArea.setStyle("-fx-border-color: white; -fx-background-color: black; -fx-background-radius: 20; -fx-border-radius: 20;");

        dropShadow13.setColor(gray);
        dropShadow13.setHeight(40.06);
        dropShadow13.setRadius(20.125);
        dropShadow13.setSpread(0.3);
        dropShadow13.setWidth(42.44);
        textArea.setEffect(dropShadow13);

        label3.setLayoutX(14.0);
        label3.setLayoutY(33.0);
        label3.setPrefHeight(64.0);
        label3.setPrefWidth(129.0);
        label3.setText("Player1");
        label3.setTextFill(javafx.scene.paint.Color.valueOf("#bab8b8"));
        label3.setFont(new Font(40.0));

        dropShadow14.setColor(gray);
        dropShadow14.setHeight(13.97);
        dropShadow14.setRadius(6.455);
        dropShadow14.setSpread(0.2);
        dropShadow14.setWidth(13.85);
        label3.setEffect(dropShadow14);

        label4.setLayoutX(205.0);
        label4.setLayoutY(36.0);
        label4.setPrefHeight(43.0);
        label4.setPrefWidth(27.0);
        label4.setText("5");
        label4.setTextFill(javafx.scene.paint.Color.valueOf("#bab8b8"));
        label4.setFont(new Font(40.0));

        dropShadow15.setColor(gray);
        dropShadow15.setHeight(13.91);
        dropShadow15.setRadius(6.4399999999999995);
        dropShadow15.setSpread(0.42);
        dropShadow15.setWidth(13.85);
        label4.setEffect(dropShadow15);

        label5.setLayoutX(13.0);
        label5.setLayoutY(105.0);
        label5.setPrefHeight(64.0);
        label5.setPrefWidth(131.0);
        label5.setText("Player1");
        label5.setTextFill(javafx.scene.paint.Color.valueOf("#bab8b8"));
        label5.setFont(new Font(40.0));

        dropShadow16.setColor(gray);
        dropShadow16.setHeight(13.96);
        dropShadow16.setRadius(6.452500000000001);
        dropShadow16.setSpread(0.64);
        dropShadow16.setWidth(13.85);
        label5.setEffect(dropShadow16);

        label6.setLayoutX(207.0);
        label6.setLayoutY(105.0);
        label6.setPrefHeight(0.0);
        label6.setPrefWidth(23.0);
        label6.setText("6");
        label6.setTextFill(javafx.scene.paint.Color.valueOf("#bab8b8"));
        label6.setFont(new Font(43.0));

        dropShadow17.setColor(gray);
        dropShadow17.setHeight(14.08);
        dropShadow17.setRadius(6.4825);
        dropShadow17.setSpread(0.62);
        dropShadow17.setWidth(13.85);
        label6.setEffect(dropShadow17);

        textField.setLayoutX(11.0);
        textField.setLayoutY(571.0);
        textField.setMaxHeight(Double.MAX_VALUE);
        textField.setMaxWidth(Double.MAX_VALUE);
        textField.setPrefHeight(45.0);
        textField.setPrefWidth(239.0);
        textField.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-background-radius: 20; -fx-border-radius: 20;");

        dropShadow18.setColor(purple);
        dropShadow18.setSpread(0.57);
        textField.setEffect(dropShadow18);

        button8.setLayoutX(14.0);
        button8.setLayoutY(636.0);
        button8.setMaxHeight(Double.MAX_VALUE);
        button8.setMaxWidth(Double.MAX_VALUE);
        button8.setMnemonicParsing(false);
        button8.setPrefHeight(41.0);
        button8.setPrefWidth(109.0);
        button8.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-background-radius: 100; -fx-border-radius: 100; -fx-region-background: black;");
        button8.setText("Send");
        button8.setTextFill(javafx.scene.paint.Color.valueOf("#fdfdfd"));
        button8.setFont(new Font(15.0));
        button8.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                client.sendDataToServer("0M"+textField.getText());
            }
        });

        dropShadow19.setColor(gray);
        dropShadow19.setSpread(0.6);
        button8.setEffect(dropShadow19);

        button9.setLayoutX(144.0);
        button9.setLayoutY(636.0);
        button9.setMaxHeight(Double.MAX_VALUE);
        button9.setMaxWidth(Double.MAX_VALUE);
        button9.setMnemonicParsing(false);
        button9.setPrefHeight(41.0);
        button9.setPrefWidth(109.0);
        button9.setStyle("-fx-background-color: black; -fx-background-radius: 100; -fx-border-color: white; -fx-border-radius: 100; -fx-region-background: black;");
        button9.setText("Disable Chat");
        button9.setTextFill(javafx.scene.paint.Color.valueOf("#edebeb"));
        button9.setFont(new Font(13.0));

        dropShadow110.setColor(gray);
        dropShadow110.setSpread(0.57);
        button9.setEffect(dropShadow110);

        button10.setLayoutX(14.0);
        button10.setLayoutY(689.0);
        button10.setMaxHeight(Double.MAX_VALUE);
        button10.setMaxWidth(Double.MAX_VALUE);
        button10.setMnemonicParsing(false);
        button10.setPrefHeight(41.0);
        button10.setPrefWidth(109.0);
        button10.setStyle("-fx-background-color: black; -fx-background-radius: 100; -fx-border-color: white; -fx-border-radius: 100; -fx-region-background: black;");
        button10.setText("Quit");
        button10.setTextFill(javafx.scene.paint.Color.valueOf("#edebeb"));
        button10.setFont(new Font(13.0));

        dropShadow111.setColor(gray);
        dropShadow111.setSpread(0.57);
        button10.setEffect(dropShadow111);

        button11.setLayoutX(144.0);
        button11.setLayoutY(689.0);
        button11.setMaxHeight(Double.MAX_VALUE);
        button11.setMaxWidth(Double.MAX_VALUE);
        button11.setMnemonicParsing(false);
        button11.setPrefHeight(41.0);
        button11.setPrefWidth(109.0);
        button11.setStyle("-fx-background-color: black; -fx-background-radius: 100; -fx-border-color: white; -fx-border-radius: 100; -fx-region-background: black;");
        button11.setText("Record");
        button11.setTextFill(javafx.scene.paint.Color.valueOf("#edebeb"));
        button11.setFont(new Font(13.0));

        dropShadow112.setColor(gray);
        dropShadow112.setSpread(0.6);
        button11.setEffect(dropShadow112);
        setRight(pane1);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(grdButton0_1);
        gridPane.getChildren().add(grdButton1_1);
        gridPane.getChildren().add(grdButton1_2);
        gridPane.getChildren().add(grdButton2_1);
        gridPane.getChildren().add(button3);
        gridPane.getChildren().add(button4);
        gridPane.getChildren().add(button5);
        gridPane.getChildren().add(button6);
        gridPane.getChildren().add(button7);
        Button[][] ButtonsArray = { {grdButton0_1,grdButton1_1,grdButton1_2}
                                   ,{grdButton2_1,button3,button4}
                                   ,{button5,button6,button7}};
        
        
        
        //c = new ClientPlayer();
        client.setButtonData(ButtonsArray);
        pane.getChildren().add(gridPane);
        pane0.getChildren().add(label);
        pane0.getChildren().add(label0);
        pane0.getChildren().add(label1);
        pane0.getChildren().add(Player2);
        pane.getChildren().add(pane0);
        pane1.getChildren().add(textArea);
        pane1.getChildren().add(label3);
        pane1.getChildren().add(label4);
        pane1.getChildren().add(label5);
        pane1.getChildren().add(label6);
        pane1.getChildren().add(textField);
        pane1.getChildren().add(button8);
        pane1.getChildren().add(button9);
        pane1.getChildren().add(button10);
        pane1.getChildren().add(button11);
        gridPane.getChildren().forEach(item -> {
            item.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    int x = gridPane.getRowIndex(item);
                    int y = gridPane.getColumnIndex(item);
                    int buttonPosition = y + x * 3;
                    if (client.turn) {
                        client.turn=false;
                        if(client.aiGame)
                        {
                            client.sendDataToServer("AS" + client.clientSymbol + buttonPosition);
                            System.out.println("AS" + client.clientSymbol + buttonPosition);
                        }
                        else 
                        {
                            client.sendDataToServer("0S" + client.clientSymbol + buttonPosition);
                        }

                    }

                }
            });
        });

    }
}

*/
package tictactoe;

import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public  class TicTacBase extends BorderPane {

    protected final Pane pane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Button button;
    protected final InnerShadow innerShadow;
    protected final Button button0;
    protected final InnerShadow innerShadow0;
    protected final Button button1;
    protected final InnerShadow innerShadow1;
    protected final Button button2;
    protected final InnerShadow innerShadow2;
    protected final Button button3;
    protected final InnerShadow innerShadow3;
    protected final Button button4;
    protected final InnerShadow innerShadow4;
    protected final Button button5;
    protected final InnerShadow innerShadow5;
    protected final Button button6;
    protected final InnerShadow innerShadow6;
    protected final Button button7;
    protected final InnerShadow innerShadow7;
    protected final DropShadow dropShadow;
    protected final Pane pane0;
    protected final Label label;
    protected final DropShadow dropShadow0;
    protected final Label label0;
    protected final DropShadow dropShadow1;
    protected final Label label1;
    protected final DropShadow dropShadow2;
    protected final Label label2;
    protected final DropShadow dropShadow3;
    protected final Pane pane1;
    protected final TextArea textArea;
    protected final InnerShadow innerShadow8;
    protected final Label label3;
    protected final DropShadow dropShadow4;
    protected final Label label4;
    protected final DropShadow dropShadow5;
    protected final Label label5;
    protected final DropShadow dropShadow6;
    protected final Label label6;
    protected final DropShadow dropShadow7;
    protected final TextField textField;
    protected final DropShadow dropShadow8;
    protected final Button button8;
    protected final DropShadow dropShadow9;
    protected final Button button9;
    protected final DropShadow dropShadow10;
    protected final Button button10;
    protected final DropShadow dropShadow11;
    
    Image image1 = null;
    ImageView imageView1 = null;
    Image image2 = null;
    ImageView imageView2 = null;

    public TicTacBase(ClientPlayer client,String img1Path,String img2Path) {

        pane = new Pane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        button = new Button();
        innerShadow = new InnerShadow();
        button0 = new Button();
        innerShadow0 = new InnerShadow();
        button1 = new Button();
        innerShadow1 = new InnerShadow();
        button2 = new Button();
        innerShadow2 = new InnerShadow();
        button3 = new Button();
        innerShadow3 = new InnerShadow();
        button4 = new Button();
        innerShadow4 = new InnerShadow();
        button5 = new Button();
        innerShadow5 = new InnerShadow();
        button6 = new Button();
        innerShadow6 = new InnerShadow();
        button7 = new Button();
        innerShadow7 = new InnerShadow();
        dropShadow = new DropShadow();
        pane0 = new Pane();
        label = new Label();
        dropShadow0 = new DropShadow();
        label0 = new Label();
        dropShadow1 = new DropShadow();
        label1 = new Label();
        dropShadow2 = new DropShadow();
        label2 = new Label();
        dropShadow3 = new DropShadow();
        pane1 = new Pane();
        textArea = new TextArea();
        innerShadow8 = new InnerShadow();
        label3 = new Label();
        dropShadow4 = new DropShadow();
        label4 = new Label();
        dropShadow5 = new DropShadow();
        label5 = new Label();
        dropShadow6 = new DropShadow();
        label6 = new Label();
        dropShadow7 = new DropShadow();
        textField = new TextField();
        dropShadow8 = new DropShadow();
        button8 = new Button();
        dropShadow9 = new DropShadow();
        button9 = new Button();
        dropShadow10 = new DropShadow();
        button10 = new Button();
        dropShadow11 = new DropShadow();
        
      ButtonType ok = new ButtonType("Ok", ButtonData.OK_DONE);
      ButtonType cancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);
      Alert alert = new Alert(Alert.AlertType.NONE,"Promote pawn to:",ok,cancel);
      alert.setTitle("Quit!!");
      alert.setContentText("you will LOSE if you QUIT ... ok?");

         try {
            image1 = new Image(img1Path,120, 90, false, true);
            imageView1 = new ImageView(image1);
            image2 = new Image(img2Path, 120, 90, false, true);
            imageView2 = new ImageView(image2);
         
        } catch (Exception p) {
            p.printStackTrace();
        }
                
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(700.0);
        setPrefWidth(900.0);
        setStyle("-fx-background-color: black;");

        BorderPane.setAlignment(pane, javafx.geometry.Pos.CENTER);
        pane.setPrefHeight(750.0);
        pane.setPrefWidth(638.0);

        gridPane.setLayoutX(28.0);
        gridPane.setLayoutY(220.0);
        gridPane.setPrefHeight(455.0);
        gridPane.setPrefWidth(572.0);
        gridPane.setStyle("-fx-background-color: black; -fx-border-color: white;");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        button.setMaxHeight(Double.MAX_VALUE);
        button.setMaxWidth(Double.MAX_VALUE);
        button.setMnemonicParsing(false);
        button.setPrefHeight(257.0);
        button.setPrefWidth(304.0);
        button.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-border-width: 2;");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font("Jokerman", 52.0));

        innerShadow.setBlurType(javafx.scene.effect.BlurType.GAUSSIAN);
        innerShadow.setColor(javafx.scene.paint.Color.valueOf("#814681"));
        innerShadow.setHeight(90.8);
        innerShadow.setRadius(46.5125);
        innerShadow.setWidth(97.25);
        button.setEffect(innerShadow);
        GridPane.setRowIndex(button, 0);
        GridPane.setColumnIndex(button, 0);

        GridPane.setColumnIndex(button0, 1);
        GridPane.setRowIndex(button0, 0);
        button0.setMaxHeight(Double.MAX_VALUE);
        button0.setMaxWidth(Double.MAX_VALUE);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(257.0);
        button0.setPrefWidth(304.0);
        button0.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-border-width: 2;");
        button0.setTextFill(javafx.scene.paint.Color.WHITE);
        button0.setFont(new Font("Jokerman", 52.0));

        innerShadow0.setBlurType(javafx.scene.effect.BlurType.GAUSSIAN);
        innerShadow0.setColor(javafx.scene.paint.Color.valueOf("#b2a1a1"));
        innerShadow0.setHeight(80.96);
        innerShadow0.setRadius(36.9025);
        innerShadow0.setWidth(68.65);
        button0.setEffect(innerShadow0);

        GridPane.setColumnIndex(button1, 2);
        GridPane.setRowIndex(button1, 0);
        button1.setMaxHeight(Double.MAX_VALUE);
        button1.setMaxWidth(Double.MAX_VALUE);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(152.0);
        button1.setPrefWidth(159.0);
        button1.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-border-width: 2;");
        button1.setTextFill(javafx.scene.paint.Color.WHITE);
        button1.setFont(new Font("Jokerman", 52.0));

        innerShadow1.setBlurType(javafx.scene.effect.BlurType.GAUSSIAN);
        innerShadow1.setColor(javafx.scene.paint.Color.valueOf("#814681"));
        innerShadow1.setHeight(90.8);
        innerShadow1.setRadius(46.5125);
        innerShadow1.setWidth(97.25);
        button1.setEffect(innerShadow1);

        GridPane.setRowIndex(button2, 1);
        GridPane.setColumnIndex(button2, 0);
        button2.setMaxHeight(Double.MAX_VALUE);
        button2.setMaxWidth(Double.MAX_VALUE);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(257.0);
        button2.setPrefWidth(304.0);
        button2.setStyle("-fx-background-color: black; -fx-border-color: white;");
        button2.setTextFill(javafx.scene.paint.Color.WHITE);
        button2.setFont(new Font("Jokerman", 52.0));

        innerShadow2.setBlurType(javafx.scene.effect.BlurType.GAUSSIAN);
        innerShadow2.setColor(javafx.scene.paint.Color.valueOf("#b2a1a1"));
        innerShadow2.setHeight(71.43);
        innerShadow2.setRadius(34.52);
        innerShadow2.setWidth(68.65);
        button2.setEffect(innerShadow2);

        GridPane.setColumnIndex(button3, 1);
        GridPane.setRowIndex(button3, 1);
        button3.setMaxHeight(Double.MAX_VALUE);
        button3.setMaxWidth(Double.MAX_VALUE);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(257.0);
        button3.setPrefWidth(304.0);
        button3.setStyle("-fx-background-color: black; -fx-border-color: b2a1a1; -fx-border-width: 3;");
        button3.setTextFill(javafx.scene.paint.Color.WHITE);
        button3.setFont(new Font("Jokerman", 52.0));

        innerShadow3.setBlurType(javafx.scene.effect.BlurType.GAUSSIAN);
        innerShadow3.setColor(javafx.scene.paint.Color.valueOf("#814681"));
        innerShadow3.setHeight(90.8);
        innerShadow3.setRadius(46.5125);
        innerShadow3.setWidth(97.25);
        button3.setEffect(innerShadow3);

        GridPane.setColumnIndex(button4, 2);
        GridPane.setRowIndex(button4, 1);
        button4.setMaxHeight(Double.MAX_VALUE);
        button4.setMaxWidth(Double.MAX_VALUE);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(176.0);
        button4.setPrefWidth(247.0);
        button4.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-border-width: 3;");
        button4.setTextFill(javafx.scene.paint.Color.WHITE);
        button4.setFont(new Font("Jokerman", 52.0));

        innerShadow4.setColor(javafx.scene.paint.Color.valueOf("#b2a1a1"));
        innerShadow4.setHeight(66.07);
        innerShadow4.setRadius(38.545);
        innerShadow4.setWidth(90.11);
        button4.setEffect(innerShadow4);

        GridPane.setRowIndex(button5, 2);
        GridPane.setColumnIndex(button5, 0);
        
        button5.setMaxHeight(Double.MAX_VALUE);
        button5.setMaxWidth(Double.MAX_VALUE);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(257.0);
        button5.setPrefWidth(304.0);
        button5.setStyle("-fx-background-color: black; -fx-border-color: white;");
        button5.setTextFill(javafx.scene.paint.Color.WHITE);
        button5.setFont(new Font("Jokerman", 52.0));

        innerShadow5.setBlurType(javafx.scene.effect.BlurType.GAUSSIAN);
        innerShadow5.setColor(javafx.scene.paint.Color.valueOf("#814681"));
        innerShadow5.setHeight(90.8);
        innerShadow5.setRadius(46.5125);
        innerShadow5.setWidth(97.25);
        button5.setEffect(innerShadow5);

        GridPane.setColumnIndex(button6, 1);
        GridPane.setRowIndex(button6, 2);
        button6.setMaxHeight(Double.MAX_VALUE);
        button6.setMaxWidth(Double.MAX_VALUE);
        button6.setMnemonicParsing(false);
        button6.setPrefHeight(210.0);
        button6.setPrefWidth(210.0);
        button6.setStyle("-fx-background-color: black; -fx-border-color: white;");
        button6.setTextFill(javafx.scene.paint.Color.WHITE);
        button6.setFont(new Font("Jokerman", 52.0));

        innerShadow6.setBlurType(javafx.scene.effect.BlurType.GAUSSIAN);
        innerShadow6.setColor(javafx.scene.paint.Color.valueOf("#b2a1a1"));
        innerShadow6.setHeight(74.81);
        innerShadow6.setRadius(35.36);
        innerShadow6.setWidth(68.63);
        button6.setEffect(innerShadow6);

        GridPane.setColumnIndex(button7, 2);
        GridPane.setRowIndex(button7, 2);
        button7.setMaxHeight(Double.MAX_VALUE);
        button7.setMaxWidth(Double.MAX_VALUE);
        button7.setMnemonicParsing(false);
        button7.setPrefHeight(136.0);
        button7.setPrefWidth(165.0);
        button7.setStyle("-fx-background-color: black; -fx-border-color: white;");
        button7.setTextFill(javafx.scene.paint.Color.WHITE);
        button7.setFont(new Font("Jokerman", 52.0));

        innerShadow7.setBlurType(javafx.scene.effect.BlurType.GAUSSIAN);
        innerShadow7.setColor(javafx.scene.paint.Color.valueOf("#814681"));
        innerShadow7.setHeight(90.8);
        innerShadow7.setRadius(46.5125);
        innerShadow7.setWidth(97.25);
        button7.setEffect(innerShadow7);

        dropShadow.setColor(javafx.scene.paint.Color.valueOf("#a731a7"));
        dropShadow.setHeight(11.47);
        dropShadow.setRadius(5.235);
        dropShadow.setSpread(0.1);
        dropShadow.setWidth(11.47);
        gridPane.setEffect(dropShadow);

        pane0.setPrefHeight(211.0);
        pane0.setPrefWidth(640.0);
        pane0.setStyle("-fx-background-color: black;");

        label.setLayoutX(58.0);
        label.setLayoutY(35.0);
        label.setPrefHeight(142.0);
        label.setPrefWidth(150.0);
        label.setStyle("-fx-background-radius: 100; -fx-border-color: white; -fx-border-radius: 100; -fx-padding: 5; -fx-label-padding: 20; -fx-border-width: 5;");
        label.setGraphic(imageView2);
        dropShadow0.setColor(javafx.scene.paint.Color.valueOf("#a731a7"));
        dropShadow0.setHeight(30.47);
        dropShadow0.setRadius(14.75);
        dropShadow0.setSpread(0.71);
        dropShadow0.setWidth(30.53);
        label.setEffect(dropShadow0);

        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setLayoutX(275.0);
        label0.setLayoutY(74.0);
        label0.setPrefHeight(64.0);
        label0.setPrefWidth(30.0);
        label0.setStyle("-fx-region-background: black;");
        label0.setText("V");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#bab8b8"));
        label0.setFont(new Font(40.0));

        dropShadow1.setColor(javafx.scene.paint.Color.valueOf("#b2a1a1"));
        dropShadow1.setSpread(0.47);
        label0.setEffect(dropShadow1);

        label1.setAlignment(javafx.geometry.Pos.CENTER);
        label1.setLayoutX(305.0);
        label1.setLayoutY(74.0);
        label1.setPrefHeight(64.0);
        label1.setPrefWidth(30.0);
        label1.setStyle("-fx-region-background: black;");
        label1.setText("S");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#bab8b8"));
        label1.setFont(new Font(40.0));

        dropShadow2.setColor(javafx.scene.paint.Color.valueOf("#a731a7"));
        dropShadow2.setSpread(0.47);
        label1.setEffect(dropShadow2);

        label2.setLayoutX(398.0);
        label2.setLayoutY(35.0);
        label2.setPrefHeight(142.0);
        label2.setPrefWidth(146.0);
        label2.setStyle("-fx-background-radius: 100; -fx-border-color: white; -fx-border-radius: 100; -fx-padding: 5; -fx-label-padding: 20; -fx-border-width: 5;");
        label2.setGraphic(imageView1);
        dropShadow3.setColor(javafx.scene.paint.Color.valueOf("#b2a1a1ed"));
        dropShadow3.setHeight(30.53);
        dropShadow3.setRadius(14.765);
        dropShadow3.setSpread(0.71);
        dropShadow3.setWidth(30.53);
        label2.setEffect(dropShadow3);
        setLeft(pane);

        BorderPane.setAlignment(pane1, javafx.geometry.Pos.CENTER);
        pane1.setPrefHeight(554.0);
        pane1.setPrefWidth(262.0);
        pane1.setStyle("-fx-background-color: black;");

        textArea.setCache(true);
        textArea.setLayoutX(11.0);
        textArea.setLayoutY(220.0);
        textArea.setMaxHeight(Double.MAX_VALUE);
        textArea.setMaxWidth(Double.MAX_VALUE);
        textArea.setMouseTransparent(true);
        textArea.setPrefHeight(298.0);
        textArea.setPrefWidth(239.0);
        textArea.setStyle("-fx-border-color: white; -fx-background-color: black; -fx-background-radius: 20; -fx-border-radius: 20; -fx-region-background: white; -fx-region-border: black;");
        client.chatArea = textArea;
        innerShadow8.setColor(javafx.scene.paint.Color.valueOf("#a20aa2"));
        innerShadow8.setHeight(255.0);
        innerShadow8.setRadius(86.37);
        innerShadow8.setWidth(92.48);
        textArea.setEffect(innerShadow8);

        label3.setLayoutX(14.0);
        label3.setLayoutY(33.0);
        label3.setPrefHeight(64.0);
        label3.setPrefWidth(129.0);
        label3.setStyle("-fx-region-background: black;");
        label3.setText("Player1");
        label3.setTextFill(javafx.scene.paint.Color.valueOf("#bab8b8"));
        label3.setFont(new Font(40.0));

        dropShadow4.setColor(javafx.scene.paint.Color.valueOf("#b2a1a1"));
        dropShadow4.setHeight(13.97);
        dropShadow4.setRadius(6.455);
        dropShadow4.setSpread(0.2);
        dropShadow4.setWidth(13.85);
        label3.setEffect(dropShadow4);

        label4.setLayoutX(205.0);
        label4.setLayoutY(36.0);
        label4.setPrefHeight(43.0);
        label4.setPrefWidth(27.0);
        label4.setStyle("-fx-region-background: black;");
        label4.setText("5");
        label4.setTextFill(javafx.scene.paint.Color.valueOf("#bab8b8"));
        label4.setFont(new Font(40.0));

        dropShadow5.setColor(javafx.scene.paint.Color.valueOf("#b2a1a1"));
        dropShadow5.setHeight(13.91);
        dropShadow5.setRadius(6.4399999999999995);
        dropShadow5.setSpread(0.42);
        dropShadow5.setWidth(13.85);
        label4.setEffect(dropShadow5);

        label5.setLayoutX(13.0);
        label5.setLayoutY(105.0);
        label5.setPrefHeight(64.0);
        label5.setPrefWidth(131.0);
        label5.setStyle("-fx-region-background: black;");
        label5.setText("Player2");
        label5.setTextFill(javafx.scene.paint.Color.valueOf("#bab8b8"));
        label5.setFont(new Font(40.0));

        dropShadow6.setColor(javafx.scene.paint.Color.valueOf("#a731a7"));
        dropShadow6.setHeight(13.96);
        dropShadow6.setRadius(6.452500000000001);
        dropShadow6.setSpread(0.64);
        dropShadow6.setWidth(13.85);
        label5.setEffect(dropShadow6);

        label6.setLayoutX(207.0);
        label6.setLayoutY(105.0);
        label6.setPrefHeight(0.0);
        label6.setPrefWidth(23.0);
        label6.setStyle("-fx-region-background: black;");
        label6.setText("6");
        label6.setTextFill(javafx.scene.paint.Color.valueOf("#bab8b8"));
        label6.setFont(new Font(43.0));

        dropShadow7.setColor(javafx.scene.paint.Color.valueOf("#a731a7"));
        dropShadow7.setHeight(14.08);
        dropShadow7.setRadius(6.4825);
        dropShadow7.setSpread(0.62);
        dropShadow7.setWidth(13.85);
        label6.setEffect(dropShadow7);

        textField.setLayoutX(11.0);
        textField.setLayoutY(532.0);
        textField.setMaxHeight(Double.MAX_VALUE);
        textField.setMaxWidth(Double.MAX_VALUE);
        textField.setPrefHeight(45.0);
        textField.setPrefWidth(239.0);
        textField.setPromptText("                     Enter Message...");
        textField.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-background-radius: 20; -fx-border-radius: 20;");

        dropShadow8.setColor(javafx.scene.paint.Color.valueOf("#b2a1a1"));
        dropShadow8.setSpread(0.57);
        textField.setEffect(dropShadow8);

        button8.setLayoutX(13.0);
        button8.setLayoutY(595.0);
        button8.setMaxHeight(Double.MAX_VALUE);
        button8.setMaxWidth(Double.MAX_VALUE);
        button8.setMnemonicParsing(false);
        button8.setPrefHeight(41.0);
        button8.setPrefWidth(109.0);
        button8.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-background-radius: 100; -fx-border-radius: 100; -fx-region-background: black;");
        button8.setText("Send");
        button8.setTextFill(javafx.scene.paint.Color.valueOf("#fdfdfd"));
        button8.setFont(new Font(15.0));
        button8.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(textField.getText() != "")
                {
                    client.sendDataToServer("0M"+client.playerName+": "+textField.getText());
                    textField.setText("");
                }
            }
        });

        dropShadow9.setColor(javafx.scene.paint.Color.valueOf("#a731a7"));
        dropShadow9.setSpread(0.6);
        button8.setEffect(dropShadow9);
        button8.setEffect(null);
        button8.setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                   
                    button8.setEffect(dropShadow9);
                    }   
            });
        button8.setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                   
                    button8.setEffect(null);
                    }   
            });
       // setRight(pane1);

        button9.setLayoutX(76.0);
        button9.setLayoutY(648.0);
        button9.setMaxHeight(Double.MAX_VALUE);
        button9.setMaxWidth(Double.MAX_VALUE);
        button9.setMnemonicParsing(false);
        button9.setPrefHeight(41.0);
        button9.setPrefWidth(109.0);
        button9.setStyle("-fx-background-color: black; -fx-background-radius: 100; -fx-border-color: white; -fx-border-radius: 100; -fx-region-background: Red;");
        button9.setText("Quit");
        button9.setTextFill(javafx.scene.paint.Color.RED);
        button9.setFont(new Font(13.0));

        dropShadow10.setColor(javafx.scene.paint.Color.valueOf("#bc3131"));
        dropShadow10.setHeight(59.3);
        dropShadow10.setRadius(23.22);
        dropShadow10.setSpread(0.34);
        dropShadow10.setWidth(35.58);
        button9.setEffect(null);
        button9.setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                   
                    button9.setEffect(dropShadow10);
                    }   
            });
        button9.setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                   
                    button9.setEffect(null);
                    }   
            });
        button9.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                   
                alert.showAndWait().ifPresent(response -> {
                if (response == ok) {
                    client.setGameRoot("startGame");
                } 
});
                    }   
            });
        

        button10.setAccessibleRole(javafx.scene.AccessibleRole.TOGGLE_BUTTON);
        button10.setLayoutX(133.0);
        button10.setLayoutY(595.0);
        button10.setMaxHeight(Double.MAX_VALUE);
        button10.setMaxWidth(Double.MAX_VALUE);
        button10.setMnemonicParsing(false);
        button10.setPrefHeight(41.0);
        button10.setPrefWidth(109.0);
        button10.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-background-radius: 100; -fx-border-radius: 100; -fx-region-background: black;");
        button10.setText("Record");
        button10.setTextFill(javafx.scene.paint.Color.valueOf("#fdfdfd"));
        button10.setFont(new Font(15.0));
        dropShadow11.setColor(javafx.scene.paint.Color.valueOf("#a731a7"));
        dropShadow11.setSpread(0.6);
        button10.setEffect(null);
        button10.setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                   
                    button10.setEffect(dropShadow11);
                    }   
            });
        button10.setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                   
                    button10.setEffect(null);
                    }   
            });
        setRight(pane1);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(button);
        gridPane.getChildren().add(button0);
        gridPane.getChildren().add(button1);
        gridPane.getChildren().add(button2);
        gridPane.getChildren().add(button3);
        gridPane.getChildren().add(button4);
        gridPane.getChildren().add(button5);
        gridPane.getChildren().add(button6);
        gridPane.getChildren().add(button7);
       
        pane.getChildren().add(gridPane);
        pane0.getChildren().add(label);
        pane0.getChildren().add(label0);
        pane0.getChildren().add(label1);
        pane0.getChildren().add(label2);
        pane.getChildren().add(pane0);
        pane1.getChildren().add(textArea);
        pane1.getChildren().add(label3);
        pane1.getChildren().add(label4);
        pane1.getChildren().add(label5);
        pane1.getChildren().add(label6);
        pane1.getChildren().add(textField);
        pane1.getChildren().add(button8);
        pane1.getChildren().add(button9);
        pane1.getChildren().add(button10);
        pane1.getChildren().add(imageView1);
        pane1.getChildren().add(imageView2);
        
        client.gridPaneButtons = gridPane;
        Button[][] ButtonsArray = { {button,button0,button1}
                                   ,{button2,button3,button4}
                                   ,{button5,button6,button7}};        
        client.setButtonData(ButtonsArray);
        gridPane.getChildren().forEach(item -> {
         item.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    int x = gridPane.getRowIndex(item);
                    int y = gridPane.getColumnIndex(item);
                    int buttonPosition = y + x * 3;
                    if (client.turn) {
                        client.turn=false;
                        if(client.aiGame)
                        {
                            client.sendDataToServer("AS" + client.clientSymbol + buttonPosition);
                            System.out.println("AS" + client.clientSymbol + buttonPosition);
                        }
                        else 
                        {
                            client.sendDataToServer("0S" + client.clientSymbol + buttonPosition);
                        }

                    }

                }
            });
        });

    }
}

