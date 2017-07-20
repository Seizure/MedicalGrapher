/**
 * Created by Jesse on 7/12/2017.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MedicalGraphing extends Application {

    private FlowPane pane = new FlowPane();
    private Button refButton = new Button("Referrals");
    Scene scene = new Scene(pane, 800, 500);

    ReferralUI refUI = new ReferralUI();

    public MedicalGraphing() throws IOException {
        refUI.load();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Medical Grapher Pro 3000");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void init(){

        pane.getChildren().add(refButton);

        refButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                refUI.show();
            }
        });

    }

    @Override
    public void stop(){
        //do stuff to clean up
    }
}
