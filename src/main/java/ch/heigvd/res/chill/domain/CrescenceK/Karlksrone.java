package ch.heigvd.res.chill.domain.CrescenceK;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Karlksrone implements IProduct {

  public final static String NAME = "Karlksrone";
  public final static BigDecimal PRICE = new BigDecimal(5.1);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
