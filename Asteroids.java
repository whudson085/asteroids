 package asteroids;

/*
CLASS: Asteroids
DESCRIPTION: Extending Game, Asteroids is all in the paint method.
NOTE: This class is the metaphorical "main method" of your program,
      it is your control center.
Original code by Dan Leyzberg and Art Simon
Modified by Megan Owen
 */


/*!!Added Features!! Faster Ship, Asteroids moving at different speeds, Space Ship exhibits turbulence when hit, Ship shoots bullets
 when spacebar is pressed, Asteroids turn green when hit, Points are aggregated
 SIDENOTE: Potential insanity went into this project...please enjoy
 */

import java.awt.*;


public class Asteroids extends Game {

	private static int counter = 0;
	
	Point p1 = new Point(60,0); //polygons for the space ship
	Point p2 = new Point(50,0);
	Point p3 = new Point(60,10);
	Point p4 = new Point(50,30);
	Point p5 = new Point(10,40);
	Point p6 = new Point(50,50);
	Point p7 = new Point(60,70);
	Point p8 = new Point(50,80);
	Point p9 = new Point(60,80);
	Point p10 = new Point(70,50);
	Point p11 = new Point(90,40);
	Point p12 = new Point(70,30);
	
	Point asoct1 = new Point(30,20);
	Point asoct2 = new Point(20,40);
	Point asoct3 = new Point(10,50);
	Point asoct4 = new Point(30,50);
	Point asoct5 = new Point(30,70);
	Point asoct6 = new Point(50,50);
	Point asoct7 = new Point(60,50);
	Point asoct8 = new Point(70,10);
	
	Point ashex1 = new Point(60,50);
	Point ashex2 = new Point(50,110);
	Point ashex3 = new Point(100,150);
	Point ashex4 = new Point(90,90);
	Point ashex5 = new Point(130,60);
	Point ashex6 = new Point(110,50);
	
	Point aspent1 = new Point(90,30);
	Point aspent2 = new Point(70,50);
	Point aspent3 = new Point(100,90);
	Point aspent4 = new Point(80,100);
	Point aspent5 = new Point(80,130);
	Point aspent6 = new Point(90,140);
	Point aspent7 = new Point(100,130);
	Point aspent8 = new Point(100,110);
	Point aspent9 = new Point(110,110);
	Point aspent10 = new Point(120,100);
	Point aspent11= new Point(120,60);
	Point aspent12= new Point(110,60);
	Point aspent13= new Point(110,70);
	Point aspent14= new Point(100,70);
	Point aspent15= new Point(100,50);
	
	Point aspens1 = new Point(30,80);
	Point aspens2 = new Point(20,90);
	Point aspens3 = new Point(40,110);
	Point aspens4 = new Point(30,110);
	Point aspens5 = new Point(40,120);
	Point aspens6 = new Point(60,120);
	Point aspens7 = new Point(70,100);
	Point aspens8 = new Point(60,80);
	
	Point aspen1 = new Point(30,80);
	Point aspen2 = new Point(20,90);
	Point aspen3 = new Point(40,110);
	Point aspen4 = new Point(30,110);
	Point aspen5 = new Point(40,120);
	Point aspen6 = new Point(60,80);
	
	Point boom1 = new Point(30,20);
	Point boom2 = new Point(30,30);
	Point boom3 = new Point(20,40);
	Point boom4 = new Point(30,50);
	Point boom5 = new Point(30,60);
	Point boom6 = new Point(40,50);
	Point boom7 = new Point(50,60);
	Point boom8 = new Point(60,50);
	Point boom9 = new Point(70,60);
	Point boom10 = new Point(70,50);
	Point boom11 = new Point(80,40);
	Point boom12 = new Point(70,30);
	Point boom13 = new Point(70,20);
	Point boom14 = new Point(60,30);
	Point boom15 = new Point(50,10);
	Point boom16 = new Point(40,30);
	
	Point bullet1 = new Point(50,20);
	Point bullet2 = new Point(50,25);
	Point bullet3 = new Point(55,25);
	Point bullet4 = new Point(55,20);
	
	Point [] bullet0 = {bullet1, bullet2, bullet3, bullet4};
	Point [] boom0 ={boom1, boom2, boom3, boom4, boom5, boom6,
			boom7,boom8,boom9, boom10, boom11,boom12, boom13, boom14,boom15,boom16};
	Point [] aspen0 ={aspen1, aspen2, aspen3, aspen4, aspen5, aspen6};
	Point [] aspens0 ={aspens1, aspens2, aspens3, aspens4, aspens5, aspens6, aspens7, aspens8};
	Point [] aspent0 ={aspent1, aspent2, aspent3, aspent3, aspent4, aspent5, aspent6, 
			aspent7,aspent8,aspent9,aspent10,aspent11,aspent12,aspent13, aspent14, aspent15};
	Point [] ashex0 = {ashex1, ashex2, ashex3, ashex4, ashex5,ashex6};
	Point [] asoct0 = {asoct1, asoct2,asoct3, asoct4, asoct5, asoct6, asoct7, asoct8};
	Point [] pointarrShip = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12 };
	public Ship spaceShip =  new Ship(pointarrShip, new Point (400,300), -90);

	public Bullets bullet = new Bullets(bullet0, new Point(400,300),-90);
	public aster aster1 = new aster(asoct0,  new Point (100,300), 20);
	public aster aster2 = new aster(asoct0,  new Point (300,300), 40);
	public aster aster3 = new aster(ashex0,  new Point (500,300), 80);
	public aster aster4 = new aster(aspent0, new Point (600, 300), 160);
	public aster aster5 = new aster(aspens0, new Point (100, 500), 320);
	public aster aster6 = new aster(aspens0, new Point (200,600), 30);
	public aster aster7 = new aster(aspen0, new Point (200,200), 60);
	public aster aster8 = new aster(aspent0, new Point (400, 500), 320);

	Point[] sp = spaceShip.getPoints();
	public aster boom = new aster(boom0, new Point ((int)sp[1].getX(),(int)sp[1].getY()), 0);
	
	Image i = Toolkit.getDefaultToolkit().createImage("sky.png");

//	("C://Users//Whitney//workspace//Homework31.java//asteroids//asteroids//sky.png")

	public Asteroids() {
		super("Asteroids!",800,600);
		this.setFocusable(true);
		this.requestFocus();
		//this.addKeyListener(myTest);
		this.addKeyListener(spaceShip);//redister KeyListener so program knows where to 								//send keyevents
	}


	
	public void paint(Graphics brush) {
		brush.setColor(Color.black);
		brush.fillRect(0,0,width,height);
		brush.drawImage(i, 0,0, null);

		// sample code for printing message for debugging
		// counter is incremented and this message printed
		// each time the canvas is repainted
//		counter=0;
		brush.setColor(Color.RED);
		brush.setFont(new Font( "Monospaced", Font.BOLD, 15 ));
		brush.drawString("ASTERPOINTS " + counter,10,20);
		
		
		
		spaceShip.paint(brush);
		spaceShip.move();
		
		aster1.astercolor(brush);
		aster1.astermoven();
		aster2.astercolor(brush);
		aster2.astermoves();
		aster3.astercolor(brush);
		aster3.astermovew();
		aster4.astercolor(brush);
		aster4.astermovee();
		aster5.astercolor(brush);
		aster5.astermoven();
		aster6.astercolor(brush);
		aster6.astermoves();
		aster7.astercolor(brush);
		aster7.astermovee();
		aster8.astercolor(brush);
		aster8.astermoven();
		brush.setColor(Color.WHITE);

	
		
	//where ever the spaceship goes, the bullet should follow it it should follow the x,y points of the ship
		for (int i = 0; i<1; i++){
			if (Ship.spaceKey == false){
				bullet.paint(brush);
				Point[] p = spaceShip.getPoints();  //OBTAINS THE UPDATED SHIP WHENEVER THE POINT MOVE
				bullet.position = new Point(p[10].getX(), p[10].getY()); //GIVES THE XY POSITION OF THE BULLET 
				if (Ship.leftKey == true){								//TO THE UPDATED XY POSITION OF A POINT ON THE SHIP
					bullet.rotation-=3;
				}
				if (Ship.rightKey == true){
					bullet.rotation+=3;
				}
			}
			else{
				bullet.paint(brush);
				bullet.moveb();
			}
			}
			Polygon[] parr = {aster1, aster2, aster3,aster4, aster5, aster6,aster7,aster8};
				
			if (spaceShip.crash(parr, spaceShip)== true){
				brush.setColor(Color.RED);
				//brush.setColor(Color.getHSBColor(1.0f, 1.0f, 1.0f));
				counter-=10;
					brush.setColor(Color.ORANGE);
					spaceShip.rotation-=30;
					bullet.rotation-=30;
					brush.setFont(new Font( "Monospaced", Font.BOLD, 30 ));
					brush.drawString("BOOM",(int)sp[1].getX(),(int)sp[1].getY());
					boom.paint(brush);
				}
			
//			 
//			for(int c = 0; c < bullet.getPoints().length; c++){
//				if (parr[c].contains(bullet.getPoints()[c])== true){
//					parr[c].colorchange = true;
//					parr[c].astercolor(brush);
//					counter+=1;
//					
//				}
//				if (parr[c+1].contains(bullet.getPoints()[c])== true){
//					parr[c+1].colorchange = true;
//					parr[c+1].astercolor(brush);
//					counter+=1;
//
//				}
//				
//				if (parr[c+2].contains(bullet.getPoints()[c])== true){
//					parr[c+2].colorchange = true;
//					parr[c+2].astercolor(brush);
//					counter+=1;
//
//				}
//				
//				if (parr[c+3].contains(bullet.getPoints()[c])== true){
//					parr[c+3].colorchange = true;
//					parr[c+3].astercolor(brush);
//					counter+=1;
//
//				}
//				
//				if (parr[c+4].contains(bullet.getPoints()[c])== true){
//					parr[c+4].colorchange = true;
//					parr[c+4].astercolor(brush);
//					counter+=1;
//
//				}
//			}
//	}
			
		
			for(int c = 0; c < parr.length; c++){
				for(int b = 0; b < bullet.getPoints().length; b++){
					if (parr[c].contains(bullet.getPoints()[b])== true){
					parr[c].colorchange = true;
					parr[c].astercolor(brush);
				}
				}
			}
	}

		
	//	Ship.spaceKey = false;

	// code to indicate collision
//		if (spaceShip.crash(aster1.shape) == true){
//			brush.setColor(Color.YELLOW);
//			boom.paint(brush);
//			brush.setColor(Color.RED);
//			brush.drawString("BOOM", (at where ever the collision happened);
// 		}
	

	public static void main (String[] args) {
		Asteroids a = new Asteroids();
		a.repaint();
		
	}
}