package ch.heigvd.res.chill.domain.mercierjo;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Turborg implements IProduct {

  public final static String NAME = "Turborg";
  public final static BigDecimal PRICE = new BigDecimal(7.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
