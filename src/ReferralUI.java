import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by Jesse on 7/12/2017.
 */
public class ReferralUI extends Stage {
    Pane deptPane = new Pane();
    Pane refTypePane = new Pane();
    Pane intervalPane = new Pane();
    Pane dataPane = new Pane();
    Pane graphPane = new Pane();

    private GridPane mainPane = new GridPane();
    Scene scene = new Scene(mainPane, 1200, 800);

    public ReferralUI(){
        init();
    }

    private void init(){
        /**
         * This is what tells our main GridPane layout to expand all of its children panes to expand to their max allowed size
         */
        GridPane.setHgrow(deptPane, Priority.ALWAYS);
        GridPane.setVgrow(deptPane, Priority.ALWAYS);
        GridPane.setHgrow(refTypePane, Priority.ALWAYS);
        GridPane.setVgrow(refTypePane, Priority.ALWAYS);
        GridPane.setHgrow(intervalPane, Priority.ALWAYS);
        GridPane.setVgrow(intervalPane, Priority.ALWAYS);
        GridPane.setHgrow(dataPane, Priority.ALWAYS);
        GridPane.setVgrow(dataPane, Priority.ALWAYS);
        GridPane.setHgrow(graphPane, Priority.ALWAYS);
        GridPane.setVgrow(graphPane, Priority.ALWAYS);

        /**
         * These following lines set the percentage proportions each column and row should occupy
         */
        ColumnConstraints column0 = new ColumnConstraints();
        column0.setPercentWidth(20);
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(20);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(60);
        mainPane.getColumnConstraints().addAll(column0, column1, column2);

        RowConstraints row0 = new RowConstraints();
        row0.setPercentHeight(60);
        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(40);
        mainPane.getRowConstraints().addAll(row0, row1);

        /**
         * Setting collors for each pane, for testing purposes
         */
        deptPane.setBackground(new Background((new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY))));
        refTypePane.setBackground(new Background((new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY))));
        intervalPane.setBackground(new Background((new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY))));
        dataPane.setBackground(new Background((new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY))));
        graphPane.setBackground(new Background((new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY))));

        mainPane.setBackground(new Background((new BackgroundFill(Color.HOTPINK, CornerRadii.EMPTY, Insets.EMPTY))));

        /**
         * add each pane, and set their col/row index, and span when applicable
         */
        mainPane.add(deptPane, 0, 0);
        mainPane.add(refTypePane,0, 1);
        mainPane.add(intervalPane, 1,0);
        mainPane.add(dataPane, 1, 1);
        mainPane.add(graphPane, 2, 0, 1, 2);

        setTitle("Referrals");
        setScene(scene);
    }
}
