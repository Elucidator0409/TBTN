/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableTennis;

import DataClasses.Player;
import DataClasses.Team;
import DataClasses.RegistrationManager;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class FXMLController implements Initializable {
    
    @FXML
    private TextField team_textfield;
    
     @FXML
    private TextField player_textfield;

    @FXML
    private ComboBox combobox;
    
    @FXML
    private Button addTeamButton;
    @FXML
    private Button addPlayerButton;

    ObservableList<String> allteams = FXCollections.observableArrayList(); ;
    ObservableList<String> allplayers = FXCollections.observableArrayList();;
    ArrayList<Team> teams = new ArrayList<>();
    ArrayList<Player> players = new ArrayList<>();
    RegistrationManager regManager = new RegistrationManager();
    
    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        
        
           
        
        for (Team team : teams){
            allteams.add(team.getTeamName());
        }    
         
        
        
        
       
    
        // dong nay lay du lieu trong list allteams
        combobox.setItems(allteams);
    }
    
    
    
    
    
    
    
    
    
    
   
    
    @FXML
    public void addTeam(ActionEvent event){
        String teamname = team_textfield.getText();
        if(teamname.isEmpty()) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setContentText("team name is invalid!");
            alert.show();
        } else if (checkTeam(teamname)){
            Alert alert = new Alert(AlertType.WARNING);
            alert.setContentText("team name already existed!");
            alert.show();
        }
        else
        {
            // create a new team and add new team to array list
            Team temp = new Team(teamname);
            
            teams.add(temp);
            
             
            allteams.add(teamname);
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setContentText("ADD TEAM SUCCESFULL!");
            alert.show();
        }
    };
    
    @FXML
    public void addPlayer(ActionEvent event) {
        String playerName = player_textfield.getText();
        if(playerName.isEmpty()) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setContentText("player name is invalid!");
            alert.show();
        } else if (checkPlayer(playerName)){
            Alert alert = new Alert(AlertType.WARNING);
            alert.setContentText("player name already existed!");
            alert.show();
        }
        else
        {
            
            String selectTeam = combobox.getSelectionModel().getSelectedItem().toString();
            Player tempPlayer = new Player(playerName, selectTeam);
            
            
            players.add(tempPlayer);
            allplayers.add(playerName);
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setContentText("ADD PLAYER SUCCESFULL!");
            alert.show();
        }
    };
    
   
    boolean checkTeam(String checkTeam) {
        
        for (int i = 0; i < teams.size(); i++) {
            if (teams.contains(checkTeam)) {
                System.out.println("Team already existed");
                
                return true;
            }
        }
        return false;}
    
    boolean checkPlayer(String checkPlayer) {
        for (int i = 0; i < players.size(); i++) {
            if (players.contains(checkPlayer)) {
                System.out.println("Player already existed");
                
                return true;
            }
        }
        return false;}
    
    
    
}
