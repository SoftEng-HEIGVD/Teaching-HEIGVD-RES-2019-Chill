package ch.heigvd.res.chill.domain.yoannsim;
import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class TireLune implements IProduct {

        public final static String NAME = "TireLune";
        public final static BigDecimal PRICE = new BigDecimal(3.75);

        @Override
        public String getName() {
            return NAME;
        }

        @Override
        public BigDecimal getPrice() {
            return PRICE;
        }
}

