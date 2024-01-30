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

        //Map<Student, Integer> studenti = new TreeMap<>();

        List<Student> studenti=new LinkedList<>();
        public int zamisljenBroj;


        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int zamisljenBroj=sc.nextInt();
            sc.close();

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
    //            String ime = tfIme.getText();
    //            String alas = tfAlas.getText();
    //            int randomBroj = new Random().nextInt(100) + 1;
    //            if (!ime.isEmpty() && !alas.isEmpty()) {
    //                studenti.put(new Student(ime, alas), randomBroj);
    //            } else {
    //                lbPoruka.setText("Nisi uneo ime studenta/alas nalog!!!");
    //                lbPoruka.setTextFill(Color.RED);
    //            }
    //            tfIme.clear();
    //            tfAlas.clear();

                String ime = tfIme.getText();
                String alas= tfAlas.getText();

                if(!ime.isEmpty() && !alas.isEmpty()){
                    studenti.add(new Student(ime,alas,0));
                }else{
                    lbPoruka.setText("Nisi uneo ime studenta/alas nalog!!!");
                    lbPoruka.setTextFill(Color.RED);
                }
                tfIme.clear();
                tfAlas.clear();
            });

            btPotvrdi.setOnAction(e -> {
                String alasNalog= tfAlas2.getText();
                String brojText= tfBroj.getText();
                int broj=Integer.parseInt(brojText);



               if(studenti.contains(alasNalog)){
                   for(int i=1;i<studenti.size();i++){
                       if(broj==zamisljenBroj){
                            studenti.get(i).bodovi+=10;
                            lbPorukaBroj.setText("Cestitam pogodili ste broj");
                       }
                       else{
                           studenti.get(i).bodovi-=3;
                           lbPorukaBroj.setText("Nemate srece");
                       }
                   }
               }
            });


            btKrajUnosa.setOnAction(e -> {
    //            Object[] skupinaKljuceva = studenti.keySet().toArray();
    //            Object key = skupinaKljuceva[new Random().nextInt(skupinaKljuceva.length)];
                lbPoruka.setText(studenti.get(0).getIme()+" sa o"+studenti.get(0).getAlas());
            });


            btPrikazi.setOnAction(e -> {
                StringBuilder str = new StringBuilder(" ");
                for(int i=0;i<studenti.size();i++){

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
            private int bodovi;



            public Student(String ime, String alas,int bodovi) {
                this.ime = ime;
                this.alas = alas;
                this.bodovi= bodovi;
            }

            public String getIme() {
                return ime;
            }

            public String getAlas() {
                return alas;
            }

            public int getBodovi() {
                return bodovi;
            }

            @Override
            public String toString() {
                return ("Student "+ime+" sa indeksom "+alas+" je zamislio broj");
            }
        }
}
