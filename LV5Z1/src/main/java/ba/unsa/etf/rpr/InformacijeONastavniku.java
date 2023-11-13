package ba.unsa.etf.rpr;

import java.util.List;

public class InformacijeONastavniku extends LicneInformacije {

  private String titula;
  private List<Ocjena> ocjene;

  public InformacijeONastavniku(String ime, String prezime, String titula) {
    super(ime, prezime);
    this.titula = titula;
  }

  @Override
  public String predstavi() {
    return super.predstavi() + ", titula='" + titula + '\'';
  }

  public void dodajOcjenu(Ocjena ocjena) {
    ocjene.add(ocjena);
  }

  public List<Ocjena> getOcjene() {
    return ocjene;
  }
}