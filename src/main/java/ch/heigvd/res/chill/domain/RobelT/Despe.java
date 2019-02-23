package ch.heigvd.res.chill.domain.RobelT;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Despe implements IProduct {

  public final static String NAME = "Despe";
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
