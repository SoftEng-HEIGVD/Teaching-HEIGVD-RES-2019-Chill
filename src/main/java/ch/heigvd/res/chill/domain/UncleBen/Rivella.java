package ch.heigvd.res.chill.domain.UncleBen;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Rivella implements IProduct {

  public final static String NAME = "Rivella";
  public final static BigDecimal PRICE = new BigDecimal(1.8);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
