/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adress.view;
import adress.CRM_Server_Methoden;
import adress.MainApp;
import adress.model.*;

import adress.model.PersonOwn;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Rudi
 */
public class PersonOverviewController implements Initializable {
    @FXML
    private TableView<PersonOwn> personTable;
    @FXML
    private TableColumn<PersonOwn, String> firstNameColumn;
    @FXML
    private TableColumn<PersonOwn, String> lastNameColumn;
    @FXML
    private Button submitButton;
    @FXML
    private Label submitLabel;
    @FXML
    private Label searchLabel;
    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label streetLabel;
    @FXML
    private Label cityLabel;
    @FXML
    private Label postalCodeLabel;
    @FXML
    private Label birthdayLabel;
    @FXML
    private Label deleteLabel;

   // Reference to the main application.
    private MainApp mainApp;
    @FXML
    private TextField name;
    @FXML
    private TextField vorname;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public PersonOverviewController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
    */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize the person table with the two columns.
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
    }

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        // Add observable list data to the table
        personTable.setItems(mainApp.getPersonData());
    }
    
    /**
     *
     */
    @FXML
    private void saveAsPerson(ActionEvent e){
        
        Mitglied mitglied = new Mitglied();
        mitglied.setVorname(vorname.getText());
        mitglied.setName(name.getText());
        CRM_Server_Methoden test = new CRM_Server_Methoden();
        test.insertMitgliedD(mitglied);
        
        
        //mitglied.setGeburtsdatum(geburtstag.getText());
        
        /*mitglied.setEmail_eRacing(email.getText());
        mitglied.setFuehrerschein(scheinJa.getText());
        mitglied.setFuehrerschein(scheinNein.getText());
        mitglied.setPosition(position.getText());
        mitglied.setVermerk(vermerk.getText());
        mitglied.setStrasse_Hsnr(strasse.getText());
        mitglied.setOrt(wohnort.getText());
        mitglied.setPlz(Integer.parseInt(plz.getText()));
        mitglied.setTelefonnr(telefon.getText());
        mitglied.setStudiumGenerale(generale.getText());
        mitglied.setStaatsangehoerigkeit(nation.getText());
        mitglied.setWerkstattregeln(Integer.parseInt(werkstattregeln.getText()));
        mitglied.setServerzugang(Integer.parseInt(server.getText()));
        mitglied.setFoto_vorhanden(Integer.parseInt(fotoJa.getText()));
        mitglied.setFoto_vorhanden(Integer.parseInt(fotoNein.getText()));
        mitglied.print();
       
    }
    
    */
    }

    @FXML
    private void addNewPerson(ActionEvent event) {
    }
    
     
}

