package ch.heigvd.res.chill.domain.linois;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Cuvee implements IProduct {

  public final static String NAME = "Cuvée des Trolls";
  public final static BigDecimal PRICE = new BigDecimal(5.4);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
