package traders;


import java.util.ArrayList;
import java.util.List;



public abstract class TradeObservable {
	private List<TradeObserver> tradeObserverCollectoin = new ArrayList<TradeObserver>();

	public abstract int getPrice();

	public void registerObserver(TradeObserver o) {
		this.tradeObserverCollectoin.add(o);
	}

	public void unregisterObserver(TradeObserver o) {
		this.tradeObserverCollectoin.remove(o);
	}

	public void notifyObservers(){
		int price = getPrice();
		for (TradeObserver next: this.tradeObserverCollectoin){
			next.update(price);
		}
	}
}
