package ch.heigvd.res.chill.domain.CrescenceK;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class MalibuAnanas implements IProduct {

  public final static String NAME = "MalibuAnanas";
  public final static BigDecimal PRICE = new BigDecimal(11);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
