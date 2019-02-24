package ch.heigvd.res.chill.domain.isaiaSpinelli;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Miguel_ma_Belle implements IProduct {

  public final static String NAME = "Miguel_ma_Belle";
  public final static BigDecimal PRICE = new BigDecimal(58.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
