package traders;

import java.util.Observable;
import java.util.Random;

public class Tzatziki extends Stuff {
  Random randomPrice = new Random();

  public int getPrice() {
    // TODO Auto-generated method stub
    return randomPrice.nextInt(60);
  }

  public void priceChange() {
    System.out.println("Tzatziki price changed!");
    this.setChanged();
    if (this.hasChanged()) {
      this.notifyObservers(this.getPrice());
    }
    this.clearChanged();
  }

}
