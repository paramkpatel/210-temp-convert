/**
 * AUTHOR: Param Patel
 * FILE: TemperatureConverterGUI.java
 * Instructor: Rick Mercer
 * ASSIGNMENT: Programming Assignment 14 - Temperature Converter
 * COURSE: CSc 210; Summer 2022
 * PURPOSE: The purpose of this class is convert F to C and C to F.
 * Using JavaFx.
 *
 */

package com.example.tempfx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TemperatureConverterGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private TextField textCelsius, textFahrenheit;

    @Override
    public void start(Stage stage) {
        GridPane pane = new GridPane();
        stage.setTitle("CtoF FtoC");
        Label labelCelsius = new Label("Celsius");
        Label labelFahrenheit = new Label("Fahrenheit");
        textCelsius = new TextField();
        textFahrenheit = new TextField();
        pane.add(labelCelsius, 0, 0);
        pane.add(textCelsius, 1, 0);
        pane.add(labelFahrenheit, 0, 1);
        pane.add(textFahrenheit, 1, 1);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setAlignment(Pos.CENTER);
        textCelsius.setOnKeyReleased(new TextFieldHandlerC());
        textFahrenheit.setOnKeyReleased(new TextFieldHandlerF());
        Scene scene = new Scene(pane, 280, 80);
        stage.setScene(scene);
        stage.show();
    }

    private class TextFieldHandlerC implements EventHandler<KeyEvent> {
        @Override
        public void handle(KeyEvent event) {
            double temp = Double.parseDouble(textCelsius.getText());
            textFahrenheit.setText(String.format("%.1f", TemperatureConverter.CtoF(temp)));
        }
    }

    private class TextFieldHandlerF implements EventHandler<KeyEvent> {
        @Override
        public void handle(KeyEvent ae) {
            double temp = Double.parseDouble(textFahrenheit.getText());
            textCelsius.setText(String.format("%.1f", TemperatureConverter.FtoC(temp)));
        }
    }

}
