package ch.heigvd.res.chill.domain.Dherleth;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class JusDeChaussette implements IProduct {

  public final static String NAME = "JusDeChaussette";
  public final static BigDecimal PRICE = new BigDecimal(0.89);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
