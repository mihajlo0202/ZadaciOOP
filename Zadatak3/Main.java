package Ispit.PrvaGrupa.Zadatak3;

public class Main {
    public static void main(String[] args) {
        GenericList<Vektor3d> vectorList = new GenericList<>();

        // Dodavanje nekoliko vektora u listu
        vectorList.addCvorove(new Vektor3d(1,2,3));
        vectorList.addCvorove(new Vektor3d(1.0, 2.0, 3.0));
        vectorList.addCvorove(new Vektor3d(4.0, 5.0, 6.0));
        vectorList.addCvorove(new Vektor3d(7.0, 8.0, 9.0));

        // Ispisivanje svih vektora u listi
        System.out.println("Svi vektori u listi:");
        vectorList.printAll();

        // Kreiranje vektora koji ima iste koordinate kao neki u listi
        Vektor3d existingVector = new Vektor3d(4.0, 5.0, 6.0);

        // Kreiranje vektora koji ne postoji u listi
        Vektor3d nonExistingVector = new Vektor3d(10.0, 11.0, 12.0);

        // Testiranje findIndex metode
        int indexExisting = vectorList.findIndex(existingVector);
        int indexNonExisting = vectorList.findIndex(nonExistingVector);

        System.out.println("Indeks postojećeg vektora: " + indexExisting);
        System.out.println("Indeks nepostojećeg vektora: " + indexNonExisting);
    }

}
