import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Jesse on 7/20/2017.
 */
public class ReferralUI extends Stage {

    public ReferralUI(){

    }

    public void load() throws IOException {
        GridPane pane = FXMLLoader.load(getClass().getResource("Referral Grapher.fxml"));

        Scene scene = new Scene(pane, 1200, 800);
        setScene(scene);
    }
}
