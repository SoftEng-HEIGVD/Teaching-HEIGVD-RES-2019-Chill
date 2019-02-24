package ch.heigvd.res.chill.domain.Tsimwi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class SmokedPumpkinCaper implements IProduct {

  public final static String NAME = "Smoked Pumpkin Caper";
  public final static BigDecimal PRICE = new BigDecimal(1.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
