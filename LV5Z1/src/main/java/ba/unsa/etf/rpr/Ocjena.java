package ba.unsa.etf.rpr;

public class Ocjena {

  private LicneInformacije osoba;
  private int ocjena;


  public Ocjena(LicneInformacije osoba, int ocjena) {
    this.osoba = osoba;
    this.ocjena = ocjena;
  }

  public LicneInformacije getOsoba() {
    return osoba;
  }

  public void setOsoba(LicneInformacije osoba) {
    this.osoba = osoba;
  }

  public int getOcjena() {
    return ocjena;
  }

  public void setOcjena(int ocjena) {
    if (0 < ocjena && ocjena < 10) {
      this.ocjena = ocjena;
    }
  }
}
