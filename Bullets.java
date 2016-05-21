package asteroids;

//import java.awt.event.KeyListener;

public class Bullets extends Polygon {

	public Bullets(Point[] inShape, Point inPosition, double inRotation) {
		super(inShape, inPosition, inRotation);
		// TODO Auto-generated constructor stub
	}	
	 public void moveb(){
		 int bullets  = 15;
		 for(int i = 0; i < bullets; i++){
			if (Ship.spaceKey == true){
				position.addToX(5*Math.cos(Math.toRadians(rotation)));
				position.addToY(5*Math.sin(Math.toRadians(rotation)));
			}
			if(position.getX()>810){ 
				Ship.spaceKey = false;	
			}
			if(position.getX()<-10){
				Ship.spaceKey = false;			
			}
			if(position.getY()>600){
				Ship.spaceKey = false;			
			}
			if(position.getY()<-10){
				Ship.spaceKey = false;

			
			 
}

		 }}	
		 }
