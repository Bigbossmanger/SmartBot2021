package smartbot;


import java.io.IOException;
import java.net.URL;
import java.util.EventObject;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import static smartbot.login.setUserName;

/**
     *
     * @author nguem
     */
    public class Controller implements Initializable {

         private  Stage window=new Stage();

        private Label label;
        @FXML
        private TextField usernameId;
        @FXML
        private PasswordField passwordId;
        @FXML
        private Hyperlink forgotpassId;
        @FXML
        private Button signUpId;
        @FXML
        private Button loginId;
        @FXML
        private ImageView imageviewId;
    private EventObject event;


    @Override
        public void initialize(URL url, ResourceBundle rb) {
            // TODO
        }

    public void isUsernameId(ActionEvent actionEvent) {
         if(actionEvent!=null) {

             setUserName(usernameId.getText());
         }
    }

    public void isPasswordId(ActionEvent actionEvent) {

            if(actionEvent!=null){


           login.SetPassWord( passwordId.getText());

            }

    }

    public void isForgotpassId(ActionEvent actionEvent) throws IOException {

            if (actionEvent!=null){
                window.getIcons().add( new Image( Main.class.getResourceAsStream( "plane_PNG5256.9.png" )));


                ((Node)(event.getSource())).getScene().getWindow().hide();//close first window
               Parent parent = FXMLLoader.load(getClass().getResource("../AirLine_Reservation_System/BookingSystem.fxml"));//loading Fxml files
               Scene scene = new Scene(parent);//CREATE NEW SCENE
                window.setTitle("  Welcome to SmartBot professional trader");//SET TITLE
                window.setScene(scene);//SETTING SCENE
                window.show();//DISPLAY CONTENTS



            }
    }

    public void isLoginId(ActionEvent actionEvent) throws IOException {


        if(actionEvent!=null){

            if(login.getPassWord().equals("noel")){


                window.getIcons().add( new Image( Main.class.getResourceAsStream( "plane_PNG5256.9.png" )));
                ((Node)(event.getSource())).getScene().getWindow().hide();//close first window
                Parent parent = FXMLLoader.load(getClass().getResource("smartbot.fxml"));//loading Fxml files
                Scene scene = new Scene(parent);//CREATE NEW SCENE
                window.setTitle("  Welcome to SmartBot professional trader");//SET TITLE
                window.setScene(scene);//SETTING SCENE
                window.show();//DISPLAY CONTENTS


            }


        }else {

            Dialog dialog =new Dialog();

            ButtonType type =new ButtonType("Ok", ButtonBar.ButtonData.OK_DONE);
            dialog.setTitle("Error");
            dialog.setContentText("Invalid UserName or PassWord");
            dialog.showAndWait();
        }
    }

    public void isImageviewId(MouseEvent mouseEvent) {



    }

    public void isCreateAccountId(ActionEvent actionEvent) {



        if (actionEvent!=null){



        }



    }
}