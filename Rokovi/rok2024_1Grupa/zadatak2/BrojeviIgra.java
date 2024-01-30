package Ispit.PrvaGrupa.Rokovi.rok2024_1Grupa.zadatak2;

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

import java.util.*;

public class BrojeviIgra extends Application {

    List<Student> listaStudenata= new LinkedList<>();
    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Scanner sc = new Scanner(System.in);
        int zamisljenBroj = sc.nextInt();

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
        Label lbPorukaBroj = new Label("");

        vbSrednji.getChildren().addAll(lbAlas2, tfAlas2, lbBroj, tfBroj, btPotvrdi,lbPorukaBroj);
        vbSrednji.setPadding(new Insets(10));

        Button btPrikazi = new Button("Prikazi");
        TextArea taPrikaz = new TextArea();
        taPrikaz.setEditable(false);

        vbDonji.getChildren().addAll(btPrikazi, taPrikaz);
        vbDonji.setPadding(new Insets(10));

        root.getChildren().addAll(vbGornji, vbSrednji, vbDonji);


        btDodaj.setOnAction(e -> {
            String ime = tfIme.getText();
            String alas=tfAlas.getText();

            if(!ime.isEmpty() && !alas.isEmpty()) {
                listaStudenata.add(new Student(ime, alas, 0));
            }else{
                lbPoruka.setText("Nisi popunio polja!!!");
            }
            tfIme.clear();
            tfAlas.clear();
        });


        btKrajUnosa.setOnAction(e -> {
            lbPoruka.setText("Student "+listaStudenata.get(0).ime+" sa indeksom "+listaStudenata.get(0).alas+" je zamislio broj");
        });

        btPotvrdi.setOnAction(e -> {

            String alas2= tfAlas2.getText();
            String brojTekst=tfBroj.getText();

            int broj= Integer.parseInt(brojTekst);
            int indeksStudenta=-1;

            for(int i=1;i<listaStudenata.size();i++){
                if(listaStudenata.get(i).alas.equals(alas2)){
                    indeksStudenta=i;
                    if(broj==zamisljenBroj){
                        listaStudenata.get(i).bodovi+=10;
                        lbPorukaBroj.setText("Cestitaaam!!!!");
                    }
                    else{
                        listaStudenata.get(i).bodovi-=3;
                        lbPorukaBroj.setText("Nemate srece!");
                    }
                }


            }
        });

        btPrikazi.setOnAction(e -> {
            taPrikaz.clear();
            for(int i=1;i<listaStudenata.size();i++){
                taPrikaz.appendText(listaStudenata.get(i).toString());
            }
        });


        Scene scena = new Scene(root, 450, 500);
        stage.setScene(scena);
        stage.show();
    }
    class Student{
        private  String ime;
        private String alas;
        private int bodovi;

        public Student(String ime, String alas, int bodovi) {
            this.ime = ime;
            this.alas = alas;
            this.bodovi = bodovi;
        }

        public String getIme() {
            return ime;
        }

        @Override
        public String toString() {
            return ime+" "+alas+" : " +bodovi+"\n";
        }

        public String getAlas() {
            return alas;
        }

        public int getBodovi() {
            return bodovi;
        }
    }
}
