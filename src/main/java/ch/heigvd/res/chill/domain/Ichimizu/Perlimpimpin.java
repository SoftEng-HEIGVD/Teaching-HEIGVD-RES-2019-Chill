package ch.heigvd.res.chill.domain.Ichimizu;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Perlimpimpin implements IProduct {

  public final static String NAME = "Perlimpimpin";
  public final static BigDecimal PRICE = new BigDecimal(1.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
