package ch.heigvd.res.chill.domain.playjul306;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class PinotNoir implements IProduct {

  public final static String NAME = "Pinot Noir";
  public final static BigDecimal PRICE = new BigDecimal(15.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
