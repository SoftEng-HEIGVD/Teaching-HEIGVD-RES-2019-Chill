package ch.heigvd.res.chill.domain.samirkovitch;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Muller implements IProduct {

  public final static String NAME = "Muller";
  public final static BigDecimal PRICE = new BigDecimal(100.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
