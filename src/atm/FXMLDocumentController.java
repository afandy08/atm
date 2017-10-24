/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class FXMLDocumentController implements Initializable {
    String pin = "";
    String PIN = "1234";
    int kesempatan = 3 ;
    int tmp;
    
    
    
    @FXML
    private Label label;
    @FXML
    private PasswordField codePin;
    @FXML
    private Button satu;
    @FXML
    private Button dua;
    @FXML
    private Button empat;
    @FXML
    private Button tiga;
    @FXML
    private Button lima;
    @FXML
    private Button enam;
    @FXML
    private Button tujuh;
    @FXML
    private Button delapan;
    @FXML
    private Button sembilan;
    @FXML
    private Button C;
    @FXML
    private Button nol;
    @FXML
    private Button OK;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void siji(ActionEvent event) {
        pin += "1";
    codePin.setText(pin);
    }

    @FXML
    private void loro(ActionEvent event) {
           pin += "2";
    codePin.setText(pin);
    }

    @FXML
    private void papat(ActionEvent event) {
           pin += "3";
    codePin.setText(pin);
    }

    @FXML
    private void telu(ActionEvent event) {
           pin += "4";
    codePin.setText(pin);
    }

    @FXML
    private void limo(ActionEvent event) {
           pin += "5";
    codePin.setText(pin);
    }

    @FXML
    private void enem(ActionEvent event) {
           pin += "6";
    codePin.setText(pin);
    }

    @FXML
    private void pitu(ActionEvent event) {
    
       pin += "7";
    codePin.setText(pin);}

    @FXML
    private void wolu(ActionEvent event) {
           pin += "8";
    codePin.setText(pin);
    }

    @FXML
    private void songo(ActionEvent event) {
           pin += "9";
    codePin.setText(pin);
    }

    @FXML
    private void ce(ActionEvent event) {
           pin += "";
    codePin.setText(pin);
    }

    @FXML
    private void nul(ActionEvent event) {
    }

    @FXML
    private void oyi(ActionEvent event) {
        if (pin.equals(PIN)){
        try {
            ((Node) (event.getSource ())).getScene().getWindow().hide();
        FXMLLoader jos = new FXMLLoader ();
        jos.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
        Scene scene = new Scene((Parent) jos.load(), 830, 450);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("MenuAwal");
        stage.show();
      } catch (IOException e){
          System.out.println("Failed to create new Window." +e);
      }
        }else{
            kesempatan -=1;
            JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa" +kesempatan+"Kesempatan lagi");
        }codePin.setText("");
        pin ="";
        if(kesempatan == 0){
            
            System.exit(0);
        }
        }
    }
