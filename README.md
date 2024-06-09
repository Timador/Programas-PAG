package com.example.datecolorpicker;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDate;

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

# DateColorPickerApp

Esta aplicación permite a los usuarios seleccionar una fecha y un color, y visualizar estas selecciones en la interfaz.

![Ejecución](https://github.com/Timador/Programas-PAG/assets/168133781/f9844ddf-3453-4b3d-a411-67403554b0b0)


