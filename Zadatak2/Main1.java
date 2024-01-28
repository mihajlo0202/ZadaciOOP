package Ispit.PrvaGrupa.Zadatak2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
  /*
public class Main1 extends Application {
     private TextField imeField, alasField, brojField, zamisljeniBrojField;
    private Label porukaLabel, prikazLabel;
    private Map<String, Student> mapaStudenata;
    private String trenutniAlas; // Da pratimo ko je trenutno postavljen kao "zamisljeni"
    private TextArea prikazTextArea;

  public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Igra sa studentima");

        mapaStudenata = new HashMap<>();

        // Kreiranje komponenata
        Label unosLabela = new Label("Unesite podatke o studentu:");
        imeField = new TextField();
        alasField = new TextField();
        brojField = new TextField();
        zamisljeniBrojField = new TextField(); // Dodato polje za unos zamisljenog broja

        Button dodajButton = new Button("Dodaj");
        dodajButton.setOnAction(e -> dodajStudenta());

        Button krajButton = new Button("Kraj unosa");
        krajButton.setOnAction(e -> krajUnosa());

        porukaLabel = new Label("");

        Button potvrdiButton = new Button("Potvrdi");
        potvrdiButton.setOnAction(e -> potvrdiRezultat());

        Button prikaziButton = new Button("Prikazi");
        prikaziButton.setOnAction(e -> prikaziStudenta());

        prikazLabel = new Label("Rezultati:");
        prikazTextArea = new TextArea();
        prikazTextArea.setEditable(false);

        // Organizacija elemenata sa VBox i HBox
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));

        HBox unosBox = new HBox(10);
        unosBox.getChildren().addAll(new VBox(new Label("Ime studenta:"), imeField, new Label("Alas studenta:"), alasField),
                new VBox(new Label("Broj:"), brojField, new Label("Zamisljeni broj:"), zamisljeniBrojField));

        HBox dugmiciBox = new HBox(10);
        dugmiciBox.getChildren().addAll(dodajButton, krajButton, potvrdiButton, prikaziButton);

        root.getChildren().addAll(unosLabela, unosBox, dugmiciBox, porukaLabel, prikazLabel, prikazTextArea);

        Scene scene = new Scene(root, 450, 500);
        primaryStage.setScene(scene);

        primaryStage.show();

    }

    private void dodajStudenta() {
        String ime = imeField.getText();
        String alas = alasField.getText();
        int broj = Integer.parseInt(brojField.getText());

        // Provera da li je prvi dodat student
        if (mapaStudenata.isEmpty()) {
            trenutniAlas = alas;
        }

        // Postavljanje zamisljenog broja samo za trenutno postavljenog studenta
        int zamisljeniBroj = trenutniAlas.equals(alas) ? Integer.parseInt(zamisljeniBrojField.getText()) : -1;

        Student student = new Student(ime, alas, broj, zamisljeniBroj);
        mapaStudenata.put(alas, student);

        // Očisti polja
        imeField.setText("");
        alasField.setText("");
        brojField.setText("");
        zamisljeniBrojField.setText("");

        porukaLabel.setText("Dodat student: " + ime + " (" + alas + ")");
    }


        private void prikaziStudenta() {
            if (!mapaStudenata.isEmpty()) {
                int odabraniBroj = Student.getZamisljenBroj();
                porukaLabel.setText("Trazi se broj od svih studenata. Zamisljeni broj: " + odabraniBroj);
            } else {
                porukaLabel.setText("Nema dostupnih studenata.");
            }
        }
    }
    private void krajUnosa() {
        if (!mapaStudenata.isEmpty()) {
            int noviZamisljenBroj = Integer.parseInt(zamisljeniBrojField.getText());
            Student.postaviZamisljenBroj(noviZamisljenBroj);

            prikazTextArea.setText("Zamisljeni brojevi studenata:\n");

            for (Student student : mapaStudenata.values()) {
                prikazTextArea.appendText(student.toString() + "\n");
            }

            porukaLabel.setText("Unos zavrsen. Zamisljeni broj za sve studente je postavljen.");
        } else {
            porukaLabel.setText("Nema dostupnih studenata.");
        }
    }
    private void potvrdiRezultat() {
        String alas = alasField.getText();
        int pokusaj = Integer.parseInt(brojField.getText());

        if (mapaStudenata.containsKey(alas)) {
            Student student = mapaStudenata.get(alas);
            int zamisljeniBroj = student.getZamisljeniBroj();

            if (pokusaj == zamisljeniBroj) {
                student.dodajPoene(10);
                porukaLabel.setText("Tacan odgovor! Student " + student.getIme() + " je osvojio 10 poena.");
            } else {
                student.oduzmiPoene(3);
                porukaLabel.setText("Pogresan odgovor! Student " + student.getIme() + " gubi 3 poena.");
            }
        } else {
            porukaLabel.setText("Student sa alasom " + alas + " nije pronadjen.");
        }

        // Očisti polja
        alasField.setText("");
        brojField.setText("");
    }
}

class Student {
    private String ime;
    private String alas;
    private int broj;
    private int poeni;
    private static int zamisljenBroj; // Static polje koje je zajedničko za sve studente

    // Konstruktor
    public Student(String ime, String alas, int broj) {
        this.ime = ime;
        this.alas = alas;
        this.broj = broj;
        this.poeni = 0;
    }

    // Getter za zamisljenBroj
    public static int getZamisljenBroj() {
        return zamisljenBroj;
    }

    // Metoda za postavljanje zamisljenBroj
    public static void postaviZamisljenBroj(int noviBroj) {
        zamisljenBroj = noviBroj;
    }

    @Override
    public String toString() {
        return "Student " + ime + " (" + alas + "): Zamisljeni broj - " + zamisljenBroj;
    }
}
*/