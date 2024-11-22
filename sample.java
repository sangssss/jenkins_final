import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Dashboard extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label titleLabel = new Label("Sample Dashboard");
        titleLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        PieChart pieChart = createPieChart();
        Button updateButton = new Button("Update Data");
        updateButton.setStyle("-fx-font-size: 14px;");
        updateButton.setOnAction(e -> {
            updateChart(pieChart);
        });

        
        VBox vbox = new VBox(20, titleLabel, pieChart, updateButton);
        vbox.setStyle("-fx-padding: 20px; -fx-alignment: center;");

        // Setup the Scene and Stage
        Scene scene = new Scene(vbox, 500, 400);
        primaryStage.setTitle("Dashboard Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    private PieChart createPieChart() {
        PieChart.Data slice1 = new PieChart.Data("Category A", 30);
        PieChart.Data slice2 = new PieChart.Data("Category B", 50);
        PieChart.Data slice3 = new PieChart.Data("Category C", 20);

        PieChart pieChart = new PieChart();
        pieChart.getData().addAll(slice1, slice2, slice3);
        pieChart.setTitle("Sample Data Distribution");
        return pieChart;
    }

    
    private void updateChart(PieChart pieChart) {
        pieChart.getData().clear(); // Clear existing data
        PieChart.Data slice1 = new PieChart.Data("Category A", 40);
        PieChart.Data slice2 = new PieChart.Data("Category B", 40);
        PieChart.Data slice3 = new PieChart.Data("Category C", 20);
        pieChart.getData().addAll(slice1, slice2, slice3);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
