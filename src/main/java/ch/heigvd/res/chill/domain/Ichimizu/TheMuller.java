package ch.heigvd.res.chill.domain.Ichimizu;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class TheMuller implements IProduct {

  public final static String NAME = "TheMuller";
  public final static BigDecimal PRICE = new BigDecimal(4.20);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
