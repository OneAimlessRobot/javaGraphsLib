package ds.implem;

import java.io.Serializable;

import ds.interfaces.GraphEdge;
import ds.interfaces.List;

public class GraphEdgeClass<T> implements Serializable,GraphEdge<T> {
	
	private static final long serialVersionUID = 1L;
	private List<T> info;
	GraphEdgeClass(T first,T second){
		
		info= new DoubleLinkedList<>();
		info.add(first);
		info.add(second);
	}

	public T getFirst(){
		
		return info.get(0);
	}
	public T getSecond(){
		
		return info.get(1);
	}

	public boolean equals(Object otherEdge) {
		boolean result=false;
		if(otherEdge instanceof GraphEdge) {
			return ((GraphEdge<?>)otherEdge).getFirst().equals(this.getFirst())
			&& ((GraphEdge<?>)otherEdge).getSecond().equals(this.getSecond());
			
		}
		return result;
		
		
	}
	public String toString() {
		
		return "["+getFirst()+" "+getSecond()+"]";
	}
}
