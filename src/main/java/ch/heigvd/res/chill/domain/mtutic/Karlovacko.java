package ch.heigvd.res.chill.domain.mtutic;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Karlovacko implements IProduct {

  public final static String NAME = "Karlovacko";
  public final static BigDecimal PRICE = new BigDecimal(3.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
