package ch.heigvd.res.chill.domain.lougranou;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class BiereAuBoisDesPendus implements IProduct {

  public final static String NAME = "BiereAuBoisDesPendus";
  public final static BigDecimal PRICE = new BigDecimal(8.00);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
