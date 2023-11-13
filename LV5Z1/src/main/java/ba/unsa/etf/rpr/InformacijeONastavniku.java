package ba.unsa.etf.rpr;

public class InformacijeONastavniku extends LicneInformacije {

  private String titula;

  public InformacijeONastavniku(String ime, String prezime, String titula) {
    super(ime, prezime);
    this.titula = titula;
  }

  @Override
  public String predstavi() {
    return super.predstavi() + ", titula='" + titula + '\'';
  }
}