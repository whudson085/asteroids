package asteroids;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class aster extends Polygon {
	boolean freefloat = true;
	public aster(Point[] inShape, Point inPosition, double inRotation) {
		super(inShape, inPosition, inRotation);
		}

	Random rand = new Random();
	int  n = rand.nextInt(3) + 1;
	
	public void astermoves(){
		if(freefloat == true){
//			position.addToX(Math.cos(Math.toRadians(rotation)));
//			position.addToY(Math.sin(Math.toRadians(rotation)));
			position.addToX(-Math.cos(Math.toRadians(rotation)));
			position.addToY(-Math.sin(Math.toRadians(rotation-50)));
			if(position.getX()>800){
				position = new Point (0, position.getY());
			}
			if(position.getX()<0){
				position = new Point (800, position.getY());
			}
			if(position.getY()>600){
				position = new Point (position.getX(), 0);
			}
			if(position.getY()<0){
				position = new Point (position.getX(), 600);
			}
			
		}
	}
	
	public void astermoven(){
		if(freefloat == true){
			position.addToX(2*Math.cos(Math.toRadians(rotation)));
			position.addToY(2*Math.sin(Math.toRadians(rotation-50)));
			//position.addToX(-Math.cos(Math.toRadians(rotation)));
			//position.addToY(-Math.sin(Math.toRadians(rotation-50)));
			if(position.getX()>800){
				position = new Point (0, position.getY());
			}
			if(position.getX()<0){
				position = new Point (800, position.getY());
			}
			if(position.getY()>600){
				position = new Point (position.getX(), 0);
			}
			if(position.getY()<0){
				position = new Point (position.getX(), 600);
			}
			
		}
	}
	public void astermovew(){
		if(freefloat == true){
//			position.addToX(Math.cos(Math.toRadians(rotation)));
//			position.addToY(Math.sin(Math.toRadians(rotation)));
			position.addToX(-n*Math.cos(Math.toRadians(rotation)));
			position.addToY(-n*Math.sin(Math.toRadians(rotation+30)));
			if(position.getX()>800){
				position = new Point (0, position.getY());
			}
			if(position.getX()<0){
				position = new Point (800, position.getY());
			}
			if(position.getY()>600){
				position = new Point (position.getX(), 0);
			}
			if(position.getY()<0){
				position = new Point (position.getX(), 600);
			}
			
		}
	}
	public void astermovee(){
		Random rand = new Random();
		int  n = rand.nextInt(3) + 1;
		if(freefloat == true){
			
			
			position.addToX(n*Math.cos(Math.toRadians(rotation)));
			position.addToY(n*Math.sin(Math.toRadians(rotation-100)));
//			position.addToX(-Math.cos(Math.toRadians(rotation)));
//			position.addToY(-Math.sin(Math.toRadians(rotation+180)));
			
			if(position.getX()>800){
				position = new Point (0, position.getY());
			}
			if(position.getX()<0){
				position = new Point (800, position.getY());
			}
			if(position.getY()>600){
				position = new Point (position.getX(), 0);
			}
			if(position.getY()<0){
				position = new Point (position.getX(), 600);
			}
		}
	}
	
	
}
