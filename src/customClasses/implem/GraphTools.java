package customClasses.implem;

import java.io.IOException;
import java.io.Serializable;

import ds.interfaces.Graph;
import ds.interfaces.Iterator;

public class GraphTools implements Serializable {

	private static final long serialVersionUID = 1L;


public static int sumDegreesGraph(Graph<?> graph) {
	 return graph.sumDegrees();
	 
}
public static boolean hasCyclesGraph(Graph<?> graph) {
	 
	return graph.hasCycles();
	 
}


public static  Graph<?> getGraphClone(Graph<?> graph) {
	 
	 
	 return graph.getGraphClone();
	 
	 
}
//Only applies to Graph of IntegerPoint
public static IntegerPoint getGraphRectDimensions(Graph<IntegerPoint> graph) {
	
	Iterator<IntegerPoint> it=graph.getVexes();
	Integer maxX=0,maxY=0;
	while(it.hasNext()) {
		IntegerPoint next=it.next();
		maxX=Math.max(maxX,next.getX());
		maxY=Math.max(maxY,next.getY());
		
		
	}
	return new IntegerPoint(maxX+1,maxY+1);
	
}
//Only applies to Graph of IntegerPoint
public static void mapGraph(Graph<IntegerPoint> graph) {
	
	Iterator<IntegerPoint> it=graph.getVexes();
	IntegerPoint point= getGraphRectDimensions(graph);
	Character[][] printed= new Character[point.getX()][point.getY()];
	for(int i=0;i<point.getX();i++) {
		
		for(int j=0;j<point.getY();j++) {
			
			printed[i][j]='#';
			
		}
		
		
	}
	while(it.hasNext()) {
		IntegerPoint next=it.next();
		printed[next.getX()][next.getY()]='X';
		
	}

	for(int i=0;i<point.getX();i++) {
		
		for(int j=0;j<point.getY();j++) {
			
			System.out.print(printed[i][j]);
		}
		System.out.print('\n');
	}
	try {
		System.in.read();
		
	}catch(IOException e) {
		
		
	}
	
}

}