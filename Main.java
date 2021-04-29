package application;

	import javafx.application.Application;
	import javafx.scene.Group;
	import javafx.scene.Scene;
	import javafx.scene.chart.LineChart;
	import javafx.scene.chart.NumberAxis;
	import javafx.scene.chart.XYChart;
	import javafx.stage.Stage;

	public class Main extends Application {
		@Override
		public void start(Stage stage) {
			// Defining the X axis. The NumberAxis values are in this order: beginning, ending, and increment
			NumberAxis xAxis = new NumberAxis(2009, 2019, 1);
			xAxis.setLabel("Years");

			// Defining the Y axis. The NumberAxis values are in this order: beginning, ending, and increment
			NumberAxis yAxis = new NumberAxis(30, 62, 4);
			yAxis.setLabel("No. of Goals");			
			
			// Creating the line chart
			LineChart linechart = new LineChart(xAxis, yAxis);

			// Prepare XYChart.Series objects by setting data
			XYChart.Series series = new XYChart.Series();
			series.setName("Fibonacci result");

			series.getData().add(new XYChart.Data(2010, 45));
			series.getData().add(new XYChart.Data(2011, 52));
			series.getData().add(new XYChart.Data(2012, 56));
			series.getData().add(new XYChart.Data(2013, 59));
			series.getData().add(new XYChart.Data(2014, 54));
			series.getData().add(new XYChart.Data(2015, 54));
			series.getData().add(new XYChart.Data(2016, 38));
			series.getData().add(new XYChart.Data(2017, 39));
			series.getData().add(new XYChart.Data(2018, 43));

			// Setting the data to Line chart
			linechart.getData().add(series);

			// Creating a Group object
			Group root = new Group(linechart);

			// Creating a scene object
			Scene scene = new Scene(root, 550, 400);

			// Setting title to the Stage
			stage.setTitle("Cristiano Ronaldo Goals per Year");

			// Adding scene to the stage
			stage.setScene(scene);

			// Displaying the contents of the stage
			stage.show();
		}

		public static void main(String[] args) {
			launch(args);

			long total = 0;
			long startTime = System.nanoTime();
			for (long i = 0; i < total; i++) {
				System.out.println();
			}

			long endTime = System.nanoTime();
			
			System.out.println("Total time: " + total + (startTime - endTime) + " nanoseconds");
		}
	}