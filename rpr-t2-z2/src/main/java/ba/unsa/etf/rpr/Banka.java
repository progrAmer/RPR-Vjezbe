package ba.unsa.etf.rpr;

import java.util.List;
import java.util.Random;

public class Banka {

  private List<Korisnik> korisnici;
  private List<Uposlenik> uposlenici;

  private Long brojRacuna;


  public Banka() {
  }

  public Korisnik kreirajNovogKorisnika(String ime, String prezime) {
    Korisnik noviKorisnik = new Korisnik(ime, prezime);
    korisnici.add(noviKorisnik);

    return noviKorisnik;
  }

  public Uposlenik kreirajNovogUposlenika(String ime, String prezime) {
    Uposlenik noviUposlenik = new Uposlenik(ime, prezime);
    uposlenici.add(noviUposlenik);

    return noviUposlenik;
  }

  public Racun kreirajRacunZaKorisnika(Korisnik k) {
    Long noviBroj = (new Random()).nextLong();
    Racun noviRacun = new Racun(noviBroj, k);
    k.dodajRacun(noviRacun);

    return noviRacun;
  }

  public Long getBrojRacuna() {
    return brojRacuna;
  }

  public void setBrojRacuna(Long brojRacuna) {
    this.brojRacuna = brojRacuna;
  }
}
