package ba.unsa.etf.rpr;

public class Racun {

  private Long brojRacuna;
  private Osoba korisnikRacuna;

  private boolean odobrenjePrekoracenja;

  private Double stanjeRacuna;


  public Racun(Long brojRacuna, Osoba korisnikRacuna) {
    this.brojRacuna = brojRacuna;
    this.korisnikRacuna = korisnikRacuna;
    this.odobrenjePrekoracenja = false;
    this.stanjeRacuna = 0.0;
  }

  private boolean provjeriOdobrenjePrekoracenja(Double n) {
    return odobrenjePrekoracenja;
  }

  private boolean odobriPrekoracenje(Double x) {
    return true;
  }

  private boolean izvrsiUplatu(Double amount) {
    this.stanjeRacuna += amount;
    return true;
  }

  private boolean izvrsiIsplatu(Double amount) {
    this.stanjeRacuna -= amount;
    return true;
  }
}
