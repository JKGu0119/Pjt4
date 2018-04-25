
public class Road {
	protected String roadID;
	protected Intersection node1;
	protected Intersection node2;
	protected double distance;
	
	public Road(String a, Intersection node1, Intersection node2) {
		this.roadID=a;
		this.node1=node1;
		this.node2=node2;
		this.distance=findDistance();
	}
	
	public double findDistance() {
		return 6371000*2*Math.asin(Math.sqrt(       Math.pow( Math.sin((node2.latitude-node1.latitude)/2)  , 2)    +   Math.cos(node1.latitude)*Math.cos(node2.latitude)*Math.pow(   Math.sin((node2.longitude-node1.longitude)/2)   , 2)          ));
		//Haversine formula, Wikipedia, https://en.wikipedia.org/wiki/Haversine_formula
		
	}
}
