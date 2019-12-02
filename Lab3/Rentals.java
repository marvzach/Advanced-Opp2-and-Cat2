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

public class Rentals extends Application {
    @Override
    public void start(Stage stage) {
        //creating label email
        Text name = new Text("Customer:");
        Text genre = new Text("Genre:");
        Text movie = new Text("Movies:");
        Text borrow = new Text("Borrowed:");
        Text returned= new Text("Returned:");


        ComboBox  nameField1 = new   ComboBox ();
        ComboBox  genreField1 = new   ComboBox ();
        ComboBox  moviesField1 = new   ComboBox ();
        ComboBox borrowField1 = new ComboBox();
        ComboBox returnField1 = new ComboBox();

        //Creating Buttons

        Button button1 = new Button("Save Rental");
        Button button2 = new Button("Return Movie");
        button1.setStyle("-fx-background-color: darkslateblue;-fx-text-fill:white;-fx-font-size: 13px; -fx-fill-width: 20px;-fx-font-family: Courgette;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill:white;-fx-font-size: 13px;-fx-font-family: Courgette;");
        button2.setPrefSize(250, 20);
        button1.setPrefSize(250, 20);
        borrowField1.setPrefSize(250, 20);
        returnField1.setPrefSize(250, 20);
        nameField1.setPrefSize(250, 20);
        genreField1.setPrefSize(250, 20);
        moviesField1.setPrefSize(250, 20);

        name.setStyle("-fx-font: normal bold 20px 'Courgette';");
        genre.setStyle("-fx-font: normal bold 20px 'Courgette' ");
        movie.setStyle("-fx-font: normal bold 20px 'Courgette' ");
        borrow.setStyle("-fx-font: normal bold 20px 'Courgette' ");
        returned.setStyle("-fx-font: normal bold 20px 'Courgette' ");

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
        gridPane.add(genre, 0, 1);
        gridPane.add(genreField1, 1, 1);
        gridPane.add(movie, 0, 2);
        gridPane.add(moviesField1, 1, 2);
        gridPane.add(button1, 1, 3);
        gridPane.add(borrow, 0, 4);
        gridPane.add(borrowField1, 1, 4);
        gridPane.add(button2, 1, 5);
        gridPane.add(returned, 0, 6);
        gridPane.add(returnField1, 1, 6);



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