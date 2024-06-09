import java.time.LocalDate;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DateColorPickerApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear los controles
        Label dateLabel = new Label("Selecciona una fecha:");
        DatePicker datePicker = new DatePicker();
        Label colorLabel = new Label("Selecciona un color:");
        ColorPicker colorPicker = new ColorPicker();
        Button submitButton = new Button("Confirmar Selección");

        // Configurar la acción del botón
        submitButton.setOnAction(e -> {
            LocalDate date = datePicker.getValue();
            String color = colorPicker.getValue().toString();
            System.out.println("Fecha seleccionada: " + date);
            System.out.println("Color seleccionado: " + color);
        });

        // Crear el layout y añadir los controles
        VBox layout = new VBox(10, dateLabel, datePicker, colorLabel, colorPicker, submitButton);

        // Crear la escena y mostrarla
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Date and Color Picker");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
