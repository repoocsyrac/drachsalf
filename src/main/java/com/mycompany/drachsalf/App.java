package com.mycompany.drachsalf;

import java.awt.Insets;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        
        // menu bar
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        fileMenu.getItems().addAll(new MenuItem("Load"), new MenuItem("Save"));
        menuBar.getMenus().add(fileMenu);
        root.setTop(menuBar);
        
        // deck list in the center
        ListView<String> deckListView = new ListView<>();
        root.setCenter(deckListView);
        
        // buttons at the bottom
        Button createDeckButton = new Button("Create Deck");
        Button deleteDeckButton = new Button("Delete Deck");
        Button startReviewButton = new Button("Start Review");

        HBox buttonBar = new HBox(10, createDeckButton, deleteDeckButton, startReviewButton);
        buttonBar.setAlignment(Pos.CENTER);
        buttonBar.setPadding(new javafx.geometry.Insets(10));
        root.setBottom(buttonBar);
        
        // scene
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Drachsalf");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}