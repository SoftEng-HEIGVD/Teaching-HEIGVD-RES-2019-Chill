package ch.heigvd.res.chill.domain.mullerPierrickHeig;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Singha implements IProduct {

  public final static String NAME = "Singha";
  public final static BigDecimal PRICE = new BigDecimal(7.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
