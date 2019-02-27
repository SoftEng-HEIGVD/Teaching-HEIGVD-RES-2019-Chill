package ch.heigvd.res.chill.domain.mercierjo;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Somersby implements IProduct {

  public final static String NAME = "Somersby";
  public final static BigDecimal PRICE = new BigDecimal(5.8);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
