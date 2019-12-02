import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Customer extends Application {
    @Override
    public void start(Stage stage) {
        //creating label email
        Text name = new Text("Name:");
        Text phone = new Text("Phone:");
        Text email = new Text("Email:");
        Text register = new Text("Registered:");
     

        TextField nameField1 = new TextField();
        TextField phoneField1 = new TextField();
        TextField emailField1 = new TextField();
        ComboBox regField1 = new ComboBox();

        //Creating Buttons
        Button button1 = new Button("Save Customer");
        Button button2 = new Button("Remove Customer");
        button1.setStyle("-fx-background-color: darkslateblue;-fx-text-fill:white;-fx-font-size: 13px; -fx-fill-width: 20px;-fx-font-family: Courgette;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill:white;-fx-font-size: 13px;-fx-font-family: Courgette;");
        button2.setPrefSize(250, 20);
        button1.setPrefSize(250, 20);
        regField1.setPrefSize(250, 20);
        name.setStyle("-fx-font: normal bold 20px 'Courgette';");
        phone.setStyle("-fx-font: normal bold 20px 'Courgette' ");
        email.setStyle("-fx-font: normal bold 20px 'Courgette' ");
        register.setStyle("-fx-font: normal bold 20px 'Courgette' ");

        //Creating a Grid Pane
        GridPane gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(600, 400);
        gridPane.setStyle("-fx-background-color: #a3f588; ");
        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid

        gridPane.add(name, 0, 0);
        gridPane.add(nameField1, 1, 0);
        gridPane.add(phone, 0, 1);
        gridPane.add(phoneField1, 1, 1);
        gridPane.add(email, 0, 2);
        gridPane.add(emailField1, 1, 2);
        gridPane.add(button1, 1, 3);
        gridPane.add(register, 0, 4);
        gridPane.add(regField1, 1, 4);
        gridPane.add(button2, 1, 5);



        //Creating a scene object
        Scene scene = new Scene(gridPane);
        scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Courgette");
        //Setting title to the Stage
        stage.setTitle("Movie Library System");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
} 