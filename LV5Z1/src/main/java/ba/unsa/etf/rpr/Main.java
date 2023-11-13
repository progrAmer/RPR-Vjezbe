package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    LicneInformacije info = new LicneInformacije("John", "Smith");
    LicneInformacije info2 = new LicneInformacije("Jon", "Smithonian");

    InformacijeONastavniku prof = new InformacijeONastavniku("Donald", "Knuth", "Red. prof. dr");
    InformacijeONastavniku prof2 = new InformacijeONastavniku("Ken", "Thompson", "Red. prof. dr");

    InformacijeOStudentu student = new InformacijeOStudentu("Alice", "Bobston", 3, "11111");
    InformacijeOStudentu student2 = new InformacijeOStudentu("Bob", "Alliston", 3, "2222");

    Predmet predmet1 = new Predmet("RPR", "Razvoj Programskih Rjesenja");
    Predmet predmet2 = new Predmet("DSU", "Digitalni Sistemi Upravljanja");

    KolekcijaPoruka kolekcija = new KolekcijaPoruka(new ArrayList<>(List.of(prof, prof2)));
    KolekcijaPoruka kolekcija1 = new KolekcijaPoruka(new ArrayList<>(List.of(student, student2)));
    KolekcijaPoruka kolekcija2 = new KolekcijaPoruka(new ArrayList<>(List.of(predmet1, predmet2)));
    KolekcijaPoruka kolekcija3 = new KolekcijaPoruka(new ArrayList<>(List.of(info, info2)));

    System.out.println(kolekcija.getPoruke().toString());
    System.out.println(kolekcija1.getPoruke().toString());
    System.out.println(kolekcija2.getPoruke().toString());
    System.out.println(kolekcija3.getPoruke().toString());

  }
}