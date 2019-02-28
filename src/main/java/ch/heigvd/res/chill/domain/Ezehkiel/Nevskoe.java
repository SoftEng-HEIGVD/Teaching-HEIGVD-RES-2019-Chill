package ch.heigvd.res.chill.domain.Ezehkiel;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Nevskoe implements IProduct {

  public final static String NAME = "Nevskoe";
  public final static BigDecimal PRICE = new BigDecimal(3.4);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
