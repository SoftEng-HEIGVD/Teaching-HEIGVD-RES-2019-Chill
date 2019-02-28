package ch.heigvd.res.chill.domain.samirkovitch;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Bourree implements IProduct {

  public final static String NAME = "Bourree";
  public final static BigDecimal PRICE = new BigDecimal(0.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
