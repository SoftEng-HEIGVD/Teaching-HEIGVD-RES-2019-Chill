package ch.heigvd.res.chill.domain.Eric_Noel;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Wubba_Lubba_Dub_Dub implements IProduct {

  public final static String NAME = "Wubba Lubba Dub Dub";
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
