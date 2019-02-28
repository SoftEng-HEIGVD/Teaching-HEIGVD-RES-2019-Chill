package ch.heigvd.res.chill.domain.yoann0000;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class IDKBeer implements IProduct {

  public final static String NAME = "IDK Beer";
  public final static BigDecimal PRICE = new BigDecimal(2.1);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
