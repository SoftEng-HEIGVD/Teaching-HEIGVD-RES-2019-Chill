package ch.heigvd.res.chill.domain.playjul306;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Nebuleuse implements IProduct {

  public final static String NAME = "Nebuleuse";
  public final static BigDecimal PRICE = new BigDecimal(4.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
