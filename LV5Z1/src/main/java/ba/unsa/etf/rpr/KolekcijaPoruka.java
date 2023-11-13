package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class KolekcijaPoruka {

  private List<String> poruke = new ArrayList<>();

  public KolekcijaPoruka(List<MozePredstaviti> list) {
    list.forEach(p -> poruke.add(p.predstavi()));
  }

  public List<String> getPoruke() {
    return poruke;
  }
}
