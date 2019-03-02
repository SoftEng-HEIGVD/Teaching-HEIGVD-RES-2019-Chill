package ch.heigvd.res.chill.domain.goturak;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class DeadPonyClub implements IProduct {

  public final static String NAME = "Dead Pony Club";
  public final static BigDecimal PRICE = new BigDecimal(3.3);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
