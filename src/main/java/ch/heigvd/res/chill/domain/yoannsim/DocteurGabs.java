package ch.heigvd.res.chill.domain.yoannsim;
import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class DocteurGabs implements IProduct {

        public final static String NAME = "DocteurGabs";
        public final static BigDecimal PRICE = new BigDecimal(4);

        @Override
        public String getName() {
            return NAME;
        }

        @Override
        public BigDecimal getPrice() {
            return PRICE;
        }
}

