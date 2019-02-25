package ch.heigvd.res.chill.domain.gvetter;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class PunkIPA implements IProduct {

  public final static String NAME = "Punk IPA";
  public final static BigDecimal PRICE = new BigDecimal(4.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
