package ch.heigvd.res.chill.domain.Obyka;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Pirate implements IProduct {

  public final static String NAME = "Pirate";
  // Pirate are often boor, so the beer is cheap
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
