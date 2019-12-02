import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Movies extends Application {
    @Override
    public void start(Stage stage) {
        //creating label email
        Text text1 = new Text("Name");

        //creating label password
        Text text2 = new Text("Registered");

        //Creating Text Filed for email
        TextField textField1 = new TextField();

        //Creating Text Filed for password
        ComboBox textField2 = new ComboBox();

        //Creating Buttons
        Button button1 = new Button("Save");
        Button button2 = new Button("Remove");
        button1.setStyle("-fx-background-color: darkslateblue;-fx-text-fill:white;-fx-font-size: 13px; ");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill:white;-fx-font-size: 13px;");
        text1.setStyle("-fx-font: normal bold 20px 'serif' ");
        text2.setStyle("-fx-font: normal bold 20px 'serif' ");

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
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(button1, 1, 1);
        gridPane.add(text2, 0, 2);
        gridPane.add(textField2, 1, 2);
        gridPane.add(button2, 1, 3);

        //Creating a scene object
        Scene scene = new Scene(gridPane);

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