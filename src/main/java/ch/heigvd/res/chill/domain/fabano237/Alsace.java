package ch.heigvd.res.chill.domain.fabano237;



import ch.heigvd.res.chill.domain.IProduct;



import java.math.BigDecimal;



public class Alsace  implements IProduct {



    public final static String NAME = "Alsace";

    public final static BigDecimal PRICE = new BigDecimal(1.9);



    @Override

    public String getName() {

        return NAME;

    }



    @Override

    public BigDecimal getPrice() {

        return PRICE;

    }

}