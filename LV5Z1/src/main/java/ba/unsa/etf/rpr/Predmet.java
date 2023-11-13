package ba.unsa.etf.rpr;

public class Predmet implements MozePredstaviti {

  private String naziv;
  private String opis;

  public Predmet(String naziv, String opis) {
    this.naziv = naziv;
    this.opis = opis;
  }

  public String getNaziv() {
    return naziv;
  }

  public void setNaziv(String naziv) {
    this.naziv = naziv;
  }

  public String getOpis() {
    return opis;
  }

  public void setOpis(String opis) {
    this.opis = opis;
  }

  public String predstavi() {
    return "naziv='" + naziv + '\'' + ", opis='" + opis + '\'';
  }
}
