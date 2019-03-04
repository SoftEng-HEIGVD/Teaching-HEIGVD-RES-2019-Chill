package ch.heigvd.res.chill.domain.francoisburgener;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Pelforth implements IProduct {

  public final static String NAME = "Pelforth";
  public final static BigDecimal PRICE = new BigDecimal(8.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
