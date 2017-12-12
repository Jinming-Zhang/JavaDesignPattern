package traders;

import java.util.Observable;
import java.util.Observer;

public class BullTrader implements Observer {
  private String name;

  public BullTrader(String name) {
    this.name = name;
  }

  @Override
  public void update(Observable o, Object arg) {
    // TODO Auto-generated method stub
    if ((int) arg > 50) {
      System.out.println("This is " + this.name
          + " and I ant to buy risky stuff!");
    }
  }

}
