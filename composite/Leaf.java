package composite;

import java.util.ArrayList;

public class Leaf<T> extends Tree<T> implements TreeComponent<T>{
	

	public Leaf() {
	}


	public Integer getSize() {
		return 0;
	}


	public Integer getHeight() {
		return 0;
	}


	public ArrayList<T> flatten() {
		ArrayList<T> result = new ArrayList<T>();
		//result.add(this.value);
		return result;
	}

}
