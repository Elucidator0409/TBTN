/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableTennis;

import DataClasses.Fixture;
import DataClasses.RegistrationManager;
import DataClasses.Team;
import DataClasses.Player;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author ASUS
 */
public class TableTennis extends Application {
    private static TableTennis mainInstance = new TableTennis();
    
    public static TableTennis getMainInstance() {
        return mainInstance;
    }
    
    public void populateData(){
        RegistrationManager regManager = new RegistrationManager();
        Team team1 = new Team("Chelsea");
        regManager.createAndAddTeam(team1.getTeamName());
        Player player1 = new Player("Elucidator","Chelsea");
        Player player2 = new Player("Elu2","Chelsea");
        Team team2 = new Team("HIHI");
        regManager.createAndAddTeam(team2.getTeamName());
    }
    
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mainInstance.populateData();
        Fixture fixture = new Fixture();
        RegistrationManager regManager = new RegistrationManager();
        fixture.generateFixtures(regManager.getAllTeams());
        
        launch(args);
    }
    
}
