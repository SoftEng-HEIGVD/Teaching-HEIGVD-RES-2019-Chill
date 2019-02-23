package ch.heigvd.res.chill.domain.Tsimwi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class NeuzellerKartoffelBier implements IProduct {

  public final static String NAME = "Neuzeller Kartoffel Bier";
  public final static BigDecimal PRICE = new BigDecimal(3.14);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
