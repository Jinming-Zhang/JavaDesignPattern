package composite;

import java.util.ArrayList;

public interface TreeComponent<T> {
	Integer getSize();
	Integer getHeight();
	ArrayList<T> flatten();
}
