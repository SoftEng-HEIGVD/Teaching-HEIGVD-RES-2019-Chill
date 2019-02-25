package ch.heigvd.res.chill.domain.lionelburgbach;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Gallo implements IProduct {

  public final static String NAME = "Gallo";
  public final static BigDecimal PRICE = new BigDecimal(9);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
