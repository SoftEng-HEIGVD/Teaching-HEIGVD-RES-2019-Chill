package ch.heigvd.res.chill.domain.yoannsim;
import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class CaptainMorgan implements IProduct {

        public final static String NAME = "CaptainMorgan";
        public final static BigDecimal PRICE = new BigDecimal(5);

        @Override
        public String getName() {
            return NAME;
        }

        @Override
        public BigDecimal getPrice() {
            return PRICE;
        }
}

