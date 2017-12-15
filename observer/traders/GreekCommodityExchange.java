package traders;

public class GreekCommodityExchange {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Stuff ouzo = new Ouzo();
    Stuff tzatziki = new Tzatziki();
    // These are real Greek names
    BullTrader makis = new BullTrader("Makis");
    BearTrader mitsos = new BearTrader("Mitsos");
    ouzo.addObserver(makis);
    ouzo.addObserver(mitsos);
    tzatziki.addObserver(makis);
    tzatziki.addObserver(mitsos);
    for (int i = 0; i < 10; i++) {
      ouzo.priceChange();
      tzatziki.priceChange();
    }

  }
}
