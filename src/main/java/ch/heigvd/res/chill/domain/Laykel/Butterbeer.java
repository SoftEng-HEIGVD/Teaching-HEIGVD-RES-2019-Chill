package ch.heigvd.res.chill.domain.Laykel;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Butterbeer implements IProduct {

  public final static String NAME = "Butterbeer";
  public final static BigDecimal PRICE = new BigDecimal(9.75); // 9 3/4

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
