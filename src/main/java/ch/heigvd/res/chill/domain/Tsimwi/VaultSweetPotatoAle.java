package ch.heigvd.res.chill.domain.Tsimwi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class VaultSweetPotatoAle implements IProduct {

    public final static String NAME = "Vault Sweet Potato Ale";
    public final static BigDecimal PRICE = new BigDecimal(3.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }

}
