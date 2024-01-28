package Ispit.PrvaGrupa.Zadatak2;

import com.sun.javafx.css.StyleCacheEntry;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.*;


public class Main extends Application {
    private int zamisljenBroj;
    Map<Student, Integer> studenti = new TreeMap<>();
    private int bodovi;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10);
        VBox vbGornji = new VBox(10);
        VBox vbDonji = new VBox(10);
        VBox vbSrednji = new VBox(10);

        HBox hbIme = new HBox(10);
        Label lbIme = new Label("Ime studenta:");
        TextField tfIme = new TextField();
        hbIme.getChildren().addAll(lbIme, tfIme);
        HBox hbAlas = new HBox(10);
        Label lbAlas = new Label("Alas studenta:");
        TextField tfAlas = new TextField();
        Label lbPoruka = new Label();
        hbAlas.getChildren().addAll(lbAlas, tfAlas);

        HBox hbDugmici = new HBox(10);
        hbDugmici.setAlignment(Pos.CENTER);
        Button btDodaj = new Button("Dodaj");
        Button btKrajUnosa = new Button("Kraj Unosa");
        hbDugmici.getChildren().addAll(btDodaj, btKrajUnosa);

        vbGornji.getChildren().addAll(hbIme, hbAlas, hbDugmici, lbPoruka);
        vbGornji.setPadding(new Insets(10));


        Label lbAlas2 = new Label("Alas");
        TextField tfAlas2 = new TextField();
        Label lbBroj = new Label("Broj");
        Button btPotvrdi = new Button("Potvrdi");
        TextField tfBroj = new TextField();

        vbSrednji.getChildren().addAll(lbAlas2, tfAlas2, lbBroj, tfBroj, btPotvrdi);
        vbSrednji.setPadding(new Insets(10));

        Button btPrikazi = new Button("Prikazi");
        TextArea taPrikaz = new TextArea();
        taPrikaz.setEditable(false);

        vbDonji.getChildren().addAll(btPrikazi, taPrikaz);
        vbDonji.setPadding(new Insets(10));

        root.getChildren().addAll(vbGornji, vbSrednji, vbDonji);


        btDodaj.setOnAction(e -> {
            String ime = tfIme.getText();
            String alas = tfAlas.getText();
            int randomBroj = new Random().nextInt(100) + 1;
            if (!ime.isEmpty() && !alas.isEmpty()) {
                studenti.put(new Student(ime, alas), randomBroj);
            } else {
                lbPoruka.setText("Nisi uneo ime studenta/alas nalog!!!");
                lbPoruka.setTextFill(Color.RED);
            }
            tfIme.clear();
            tfAlas.clear();
        });

        btPotvrdi.setOnAction(e -> {

        });

        btKrajUnosa.setOnAction(e -> {
            Object[] skupinaKljuceva = studenti.keySet().toArray();
            Object key = skupinaKljuceva[new Random().nextInt(skupinaKljuceva.length)];

        });
        btPrikazi.setOnAction(e -> {
            StringBuilder str = new StringBuilder();
            for (Student key : studenti.keySet()) {
                str.append(key)
                        .append(": ")
                        .append(studenti.get(key)).append(bodovi)
                        .append("\n");
            }
            taPrikaz.setText(str.toString());

        });


        Scene scena = new Scene(root, 450, 500);
        stage.setScene(scena);
        stage.show();

    }


    class Student {
        private String ime;
        private String alas;


        public Student(String ime, String alas) {
            this.ime = ime;
            this.alas = alas;
        }

    }
}
