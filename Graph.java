import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
	protected ArrayList<Intersection> nodes;
	protected HashMap<Intersection,ArrayList<Road>> adjList;
	
	public Graph(){
		adjList=new HashMap<Intersection,ArrayList<Road>>();
		nodes=new ArrayList<Intersection>();
	}
	
	public void addIntersection(Intersection x) {
		nodes.add(x);
		adjList.put(x, new ArrayList<Road>());
	}
	
	public void addRoad(Road x) {
		adjList.get(x.node1).add(x);
		adjList.get(x.node2).add(x);
	}
}
