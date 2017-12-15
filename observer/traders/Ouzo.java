package traders;

import java.util.Observable;
import java.util.Random;

public class Ouzo extends Stuff{
  Random randomPrice = new Random();


  public int getPrice() {
    // TODO Auto-generated method stub
    return randomPrice.nextInt(100);
  }

  public void priceChange() {
    System.out.println("Ouzo price changed!");
    this.setChanged();
    if (this.hasChanged()) {
      this.notifyObservers(this.getPrice());
    }
    this.clearChanged();
  }

}
