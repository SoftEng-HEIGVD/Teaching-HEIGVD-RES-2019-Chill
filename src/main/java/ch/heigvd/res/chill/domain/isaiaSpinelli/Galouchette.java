package ch.heigvd.res.chill.domain.isaiaSpinelli;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Galouchette implements IProduct {

  public final static String NAME = "Galouchette";
  public final static BigDecimal PRICE = new BigDecimal(0.4);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
