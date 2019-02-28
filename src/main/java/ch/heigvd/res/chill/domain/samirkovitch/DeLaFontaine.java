package ch.heigvd.res.chill.domain.samirkovitch;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class DeLaFontaine implements IProduct {

  public final static String NAME = "DeLaFontaine";
  public final static BigDecimal PRICE = new BigDecimal(0.05);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
