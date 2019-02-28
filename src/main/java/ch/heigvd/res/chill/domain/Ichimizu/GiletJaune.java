package ch.heigvd.res.chill.domain.Ichimizu;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class GiletJaune implements IProduct {

  public final static String NAME = "GiletJaune";
  public final static BigDecimal PRICE = new BigDecimal(1);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
