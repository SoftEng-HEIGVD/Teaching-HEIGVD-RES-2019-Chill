package ch.heigvd.res.chill.domain;

import ch.heigvd.res.chill.protocol.GreetingsRequest;
import ch.heigvd.res.chill.protocol.GreetingsResponse;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;

import java.math.BigDecimal;
import java.util.Random;

public class Bartender {

  public GreetingsResponse greet(GreetingsRequest request) {
    return new GreetingsResponse("hello, how can I help you?");
  }

  public OrderResponse order(OrderRequest request) {
    String productName = request.getProductName();

    if(request.getBeerCount() > 3){
      return new OrderResponse(new BigDecimal(0),"Sorry Olivier you're too drunk now !");
    } else {
      try {
        // let Java reflection do its magic
        IProduct product = (IProduct) Class.forName(productName).newInstance();
        BigDecimal totalPrice = product.getPrice().multiply(new BigDecimal(request.getQuantity()));
        return new OrderResponse(totalPrice, "Enjoy !");
      } catch (Exception e) {
        return null;
      }
    }
  }
}
