package ba.unsa.etf.rpr;

public class InformacijeOStudentu extends LicneInformacije {

  private int godinaStudija;
  private String brojIndexa;

  public InformacijeOStudentu(String ime, String prezime, int godinaStudija, String brojIndexa) {
    super(ime, prezime);
    this.godinaStudija = godinaStudija;
    this.brojIndexa = brojIndexa;
  }

  public int getGodinaStudija() {
    return godinaStudija;
  }

  public void setGodinaStudija(int godinaStudija) {
    this.godinaStudija = godinaStudija;
  }

  public String getBrojIndexa() {
    return brojIndexa;
  }

  public void setBrojIndexa(String brojIndexa) {
    this.brojIndexa = brojIndexa;
  }

  @Override
  public String predstavi() {
    return super.predstavi() + ", godinaStudija=" + godinaStudija + ", brojIndexa='" + brojIndexa
        + '\'';
  }
}
