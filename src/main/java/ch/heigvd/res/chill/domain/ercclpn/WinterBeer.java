package ch.heigvd.res.chill.domain.ercclpn;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class WinterBeer implements IProduct {

  public final static String NAME = "WinterBeer";
  public final static BigDecimal PRICE = new BigDecimal(2.405);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
