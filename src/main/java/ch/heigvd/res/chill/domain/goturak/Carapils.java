package ch.heigvd.res.chill.domain.goturak;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Carapils implements IProduct {

  public final static String NAME = "Carapils";
  public final static BigDecimal PRICE = new BigDecimal(0.45);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
