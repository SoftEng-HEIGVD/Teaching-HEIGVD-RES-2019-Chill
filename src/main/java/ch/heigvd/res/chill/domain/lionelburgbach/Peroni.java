package ch.heigvd.res.chill.domain.lionelburgbach;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Peroni implements IProduct {

  public final static String NAME = "Peroni";
  public final static BigDecimal PRICE = new BigDecimal(4.25);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
