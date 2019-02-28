package ch.heigvd.res.chill.domain.Dherleth;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class HorriblePiquette implements IProduct {

  public final static String NAME = "horrible piquette";
  public final static BigDecimal PRICE = new BigDecimal(4.99);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
