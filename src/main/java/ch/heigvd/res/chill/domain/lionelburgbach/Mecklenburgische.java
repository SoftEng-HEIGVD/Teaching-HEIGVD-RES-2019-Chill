package ch.heigvd.res.chill.domain.lionelburgbach;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Mecklenburgische implements IProduct {

  public final static String NAME = "Mecklenburgische";
  public final static BigDecimal PRICE = new BigDecimal(5.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
