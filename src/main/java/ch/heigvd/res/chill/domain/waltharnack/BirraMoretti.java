package ch.heigvd.res.chill.domain.waltharnack;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class BirraMoretti implements IProduct {

  public final static String NAME = "BirraMoretti";
  public final static BigDecimal PRICE = new BigDecimal(1.85);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
