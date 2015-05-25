/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adress;

import adress.model.PersonOwn;
import adress.view.PersonOverviewController;
import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
     /**
     * The data as an observable list of Persons.
     */
    private ObservableList<PersonOwn> personData = FXCollections.observableArrayList();
    
    
    
     /**
     * Constructor
     */
    public MainApp() {
        // Add some sample data
        personData.add(new PersonOwn("Hans", "Muster"));
        personData.add(new PersonOwn("Ruth", "Mueller"));
        personData.add(new PersonOwn("Heinz", "Kurz"));
        personData.add(new PersonOwn("Corunelia", "Meier"));
        personData.add(new PersonOwn("Werner", "Meyer"));
        personData.add(new PersonOwn("Lydia", "Kunz"));
        personData.add(new PersonOwn("Anna", "Best"));
        personData.add(new PersonOwn("Stefan", "Meier"));
        personData.add(new PersonOwn("Martin", "Mueller"));
    }

    /**
     * Returns the data as an observable list of Persons. 
     * @return
     */
    public ObservableList<PersonOwn> getPersonData() {
        return personData;
    }


    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initRootLayout();

        showPersonOverview();
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showPersonOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/PersonOverview.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
            
            // Give the controller access to the main app.
        PersonOverviewController controller = loader.getController();
        controller.setMainApp(this);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}