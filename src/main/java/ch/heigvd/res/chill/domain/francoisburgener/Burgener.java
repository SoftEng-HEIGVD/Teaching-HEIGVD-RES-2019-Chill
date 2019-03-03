package ch.heigvd.res.chill.domain.francoisburgener;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Burgener implements IProduct {

  public final static String NAME = "Burgener";
  public final static BigDecimal PRICE = new BigDecimal(24.9);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
