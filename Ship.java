package asteroids;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ship extends Polygon implements KeyListener {
		static boolean upKey = false;
		static boolean downKey = false;
		static boolean leftKey = false;
		static boolean rightKey = false;
		static boolean spaceKey = false;
	public Ship(Point[] inShape, Point inPosition, double inRotation) {
		super(inShape, inPosition, inRotation);
		}
		
		public void keyPressed(KeyEvent e){
			int keyCode = e.getKeyCode(); //get keycode that says key is pressed
											//you can use switch if you have a lot of similar statements
			switch(keyCode){ 				//compares all other cases to this
			case KeyEvent.VK_UP: 			//in case
			upKey = true;
			System.out.println("pressed key up");
			break;							//squiggley bracket
			
			case KeyEvent.VK_DOWN:
			downKey = true;
			System.out.println("pressed key down");
			break;
  									
			case KeyEvent.VK_LEFT:
				leftKey = true;
				System.out.println("pressed key left");
				break;
					
			case KeyEvent.VK_RIGHT:
				rightKey = true;
				System.out.println("pressed key right");
				break;
				
			case KeyEvent.VK_SPACE:
				spaceKey = true;
				System.out.println("pressed space");
				break;
				
					default:  	// default means if all else fails so it has to be at the very last declaration	
						break;	
			}
			}

	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode(); 
		switch(keyCode){
		case KeyEvent.VK_UP:
			upKey = false;
			System.out.println("release up");
			break;
		
		case KeyEvent.VK_DOWN:
			downKey = false;
			System.out.println("release down");
			break;
		
		case KeyEvent.VK_LEFT:
			leftKey = false;
			System.out.println("release left");
			break;
				
		case KeyEvent.VK_RIGHT:
			rightKey = false;
			System.out.println("release right");
			break;
//		
//		case KeyEvent.VK_SPACE:
//			spaceKey = false;
//			System.out.println("release space");
//			break;
			
				default:  						//all else fails
					break;	
			 
		}
		}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	 public void move(){
		 
		 if(upKey == true){
			position.addToX(5*Math.cos(Math.toRadians(rotation)));
			position.addToY(5*Math.sin(Math.toRadians(rotation)));
			
		 }
		 
		 if(downKey == true){
			position.addToX(-5*Math.cos(Math.toRadians(rotation)));
			position.addToY(-5*Math.sin(Math.toRadians(rotation)));	
		 }
		 
		 if(leftKey == true){	
			 rotation-=3;
		 }
		 if (rightKey == true){
			 rotation+=3;
		 }
		 
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
