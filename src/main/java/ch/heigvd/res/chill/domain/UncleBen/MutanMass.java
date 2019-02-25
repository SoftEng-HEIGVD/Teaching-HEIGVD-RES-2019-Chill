package ch.heigvd.res.chill.domain.UncleBen;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class MutanMass implements IProduct {

  public final static String NAME = "Mutan Mass";
  public final static BigDecimal PRICE = new BigDecimal(5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}