package ch.heigvd.res.chill.domain.pete842;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class JackHammerIPA implements IProduct {

  public final static String NAME = "Jack Hammer IPA";
  public final static BigDecimal PRICE = new BigDecimal(3.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
