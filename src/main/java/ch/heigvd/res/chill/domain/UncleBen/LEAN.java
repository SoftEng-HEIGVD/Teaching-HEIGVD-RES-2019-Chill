package ch.heigvd.res.chill.domain.UncleBen;

import java.math.BigDecimal;

import ch.heigvd.res.chill.domain.IProduct;

public class LEAN implements IProduct{
	
	public final static String NAME = "LEAN";
	  public final static BigDecimal PRICE = new BigDecimal(4.20);

	  @Override
	  public String getName() {
	    return NAME;
	  }

	  @Override
	  public BigDecimal getPrice() {
	    return PRICE;
	  }
}
