package ch.heigvd.res.chill.domain.MarionDL;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class PilsnerUrquell implements IProduct {

  public final static String NAME = "PilsnerUrquell";
  public final static BigDecimal PRICE = new BigDecimal(1.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
