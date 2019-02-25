package ch.heigvd.res.chill.domain.yoannsim;
import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class JujuSamaSake implements IProduct {

        public final static String NAME = "JujuSamaSake";
        public final static BigDecimal PRICE = new BigDecimal(100);

        @Override
        public String getName() {
            return NAME;
        }

        @Override
        public BigDecimal getPrice() {
            return PRICE;
        }
}

