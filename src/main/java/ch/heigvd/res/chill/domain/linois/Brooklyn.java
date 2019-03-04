package ch.heigvd.res.chill.domain.linois;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Brooklyn implements IProduct {

  public final static String NAME = "Brooklyn Brewery";
  public final static BigDecimal PRICE = new BigDecimal(4.4);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
