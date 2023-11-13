package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Predmet implements MozePredstaviti {

  private String naziv;
  private String opis;
  private List<Ocjena> ocjene = new ArrayList<>();

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

  public void dodajOcjenu(Ocjena ocjena) {
    ocjene.add(ocjena);
  }

  public List<Ocjena> getOcjene() {
    return ocjene;
  }
}
