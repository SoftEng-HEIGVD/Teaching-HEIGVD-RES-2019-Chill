package ch.heigvd.res.chill.domain.Eric_Noel;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Berliner_Pilsner implements IProduct {

  public final static String NAME = "Berliner Pilsner";
  public final static BigDecimal PRICE = new BigDecimal(2.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
