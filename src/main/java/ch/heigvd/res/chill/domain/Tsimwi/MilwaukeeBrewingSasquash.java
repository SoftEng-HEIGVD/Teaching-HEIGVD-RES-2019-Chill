package ch.heigvd.res.chill.domain.Tsimwi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class MilwaukeeBrewingSasquash implements IProduct {

  public final static String NAME = "Milwaukee Brewing Sasquash";
  public final static BigDecimal PRICE = new BigDecimal(7.3);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
