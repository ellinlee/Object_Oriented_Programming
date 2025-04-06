package application;

import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GuiDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception{

        GridPane root = new GridPane();
        root.setStyle("-fx-border-width: 3px; -fx-border-color: blue");
        root.setHgap(8);
        root.setVgap(8);

        TextArea ta = new TextArea();
        ta.setPrefRowCount(9);
        ta.setPrefColumnCount(17);
        root.add(ta, 5, 0, 4, 4);

        Label lab = new Label("Push Button:");
        root.add(lab, 0, 0);
        Button b = new Button("Click Me!");
        b.setOnAction(e -> ta.appendText("Button was clicked\n\n"));
        root.add(b, 1, 0);

        lab = new Label("Checkbox:");
        root.add(lab, 0, 1);
        CheckBox c = new CheckBox("Click me!");
        c.setOnAction(e -> ta.appendText("Checkbox was toggled\n\n"));
        root.add(c, 1, 1);

        lab = new Label("Text Field:");
        root.add(lab, 0, 2);
        TextField tf = new TextField("Hello World!");
        tf.setOnAction(e -> ta.appendText("Pressed return in TextField\nwith contents:  " + tf.getText() + "\n\n"));
        root.add(tf, 1, 2);

        lab = new Label("Pop-up Menu:");
        root.add(lab, 0, 3);
        ComboBox<String> combobox = new ComboBox<>();
        combobox.getItems().addAll("First Option", "Second Option", "Third Option", "Fourth Option");
        combobox.setValue("First Option");
        combobox.setOnAction(e -> ta.appendText("Selected " + combobox.getValue() + " from menu\n\n"));
        root.add(combobox, 1, 3);


        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("GUIDemo");
        stage.show();
    }

}
