package ch.heigvd.res.chill.domain.Eric_Noel;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Skoll implements IProduct {

  public final static String NAME = "Skoll";
  public final static BigDecimal PRICE = new BigDecimal(5.95);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
