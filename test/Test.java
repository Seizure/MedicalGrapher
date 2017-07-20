import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by Jesse on 7/20/2017.
 */
public class Test extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ReferralUITest test = new ReferralUITest();
    }
}
