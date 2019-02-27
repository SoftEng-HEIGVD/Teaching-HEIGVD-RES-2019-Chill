package ch.heigvd.res.chill.domain.gaeba95;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class FantaRose implements IProduct {

  public final static String NAME = "FantaRose";
  public final static BigDecimal PRICE = new BigDecimal(5.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
