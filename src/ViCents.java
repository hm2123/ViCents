import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

public class ViCents extends Application {


    public void start(Stage stage){
        final int Quarter = 25;
        final int Dime = 10;
        final int Nickle = 5;
        final int Penny = 1;


        TextInputDialog input = new TextInputDialog();


        Optional<String> value = input.showAndWait();
        String amount = value.get();
        int qChange = Integer.parseInt(amount)*100/Quarter;
        int dChange = Integer.parseInt(amount)*100/Dime;
        int nChange = Integer.parseInt(amount)*100/Nickle;
        int pChange = Integer.parseInt(amount)*100/Penny;


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("change amount");
        alert.setContentText("The change in quarters is " + "\n" + qChange);

        alert.showAndWait();


        Alert hi = new Alert(Alert.AlertType.INFORMATION);
        hi.setTitle("Change amount ");
        hi.setContentText("The change in dimes is " + "\n" + dChange);
        hi.showAndWait();


        Alert how = new Alert(Alert.AlertType.INFORMATION);
        how.setTitle("Change amount ");
        how.setContentText("The change in nickles is " + "\n" + nChange);
        how.showAndWait();

        Alert are = new Alert(Alert.AlertType.INFORMATION);
        are.setTitle("Change amount");
        are.setContentText("The change in pennies is " + "\n" + pChange);
        are.showAndWait();


    }

}
