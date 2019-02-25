package ch.heigvd.res.chill.domain.yoann0000;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Beer implements IProduct {

  public final static String NAME = "Beer";
  public final static BigDecimal PRICE = new BigDecimal(6.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
