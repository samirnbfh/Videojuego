import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
 /**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	private static final int PWIDTH = 800; // size of panel
	private static final int PHEIGHT = 600;
	
	private int x;
	private int y;
	private int time;
	
	private Thread animator; // for the animation
	private boolean running = false; // stops the animation
	private boolean gameOver = false; // for game termination
	private Graphics dbg;
	private Image dbImage = null;
	private Heroes h;
	private ArrayList <Balas> balas;
	private boolean shoot=false;
	//private Image cara_1 = null;
	//private Image cara_2 = null;
 
	public GamePanel(){
		x = 0;
		y= 0;
		time = 0;
		h=new Heroes(0,0,20,50,"pepe",true,true,100,10);
		balas=new ArrayList <Balas>();
		//llenar_imagenes();
		setBackground(Color.white); // white background
		setPreferredSize( new Dimension(PWIDTH, PHEIGHT));
		setFocusable(true);
		requestFocus(); // JPanel now receives key events
		inicializa();
		movimientosheroe();
		readyForTermination();
		addMouseMotionListener( new MouseAdapter() {
			 public void mouseMoved(MouseEvent e) {
				 testPress(e.getX(), e.getY());
			 }
			 });
		}
	public void addNotify() {	
		super.addNotify();
		startGame(); 
	}
	private void startGame() {
		if (animator == null || !running) {
			animator = new Thread(this);
			animator.start();
		}
	} 
	public void stopGame() {
		running = false; 
	}
	
	public void run() {
		running = true;
		while(running) {
			gameUpdate(); // game state is updated
			gameRender(); // render to a buffer
			repaint(); // paint with the buffer
			time++;
			try {
				Thread.sleep(20); // sleep a bit
			}
			catch(InterruptedException ex){}
		}
		System.exit(0); 
	} 
	 private void gameRender() {
		 if (dbImage == null){ // create the buffer
			 dbImage = createImage(PWIDTH, PHEIGHT);
			 if (dbImage == null) {
				 System.out.println("dbImage is null");
				 return;
			 }
			 else dbg = dbImage.getGraphics();
		 }
		 dbg.setColor(Color.white);
		 dbg.fillRect (0, 0, PWIDTH, PHEIGHT);
		 /*dbg.drawImage(cara_1, 0, 0, 800, 600, null);
		 if(time == 50) { 
			 time = 0;
			 dbg.drawImage(cara_2, 0, 0, 800, 600, null);
		 }*/
		 dbg.setColor(Color.red);
		 dbg.fillRect(x-5, y-5, 10, 10);
		 
		 ListIterator <Balas> it= balas.listIterator();
			while(it.hasNext()) {
				Balas bal= it.next();
				bal.paint(dbg);
			}
		 h.paint(dbg);
		 if (gameOver)
			 gameOverMessage(dbg);
	 	} 
	 	private void gameOverMessage(Graphics g) {
	 		g.drawString("Game Over", 400, 300);
	 } 
	 
	private void gameUpdate(){ 
		if (!gameOver) {
		}
	}
	public void paintComponent(Graphics g){
	 super.paintComponent(g);
	 if (dbImage != null)
	 g.drawImage(dbImage, 0, 0, null);
	 }
	private void readyForTermination(){
		addKeyListener( new KeyAdapter() {	
			public void keyPressed(KeyEvent e){
				int keyCode = e.getKeyCode();
				if ((keyCode == KeyEvent.VK_ESCAPE) ||(keyCode == KeyEvent.VK_Q) ||(keyCode == KeyEvent.VK_END) || ((keyCode == KeyEvent.VK_C) && e.isControlDown()) ) {
					running = false;
			 		}
		 		}
		 	}
				);
		} 
	 
	private void testPress(int x, int y){
		this.x = x;
		this.y = y;
	 if (!gameOver) {
	 // do something
	 }
	}
	public void inicializa() {
		/*genera 50 balas*/
		int num=0;
		while(num<=50) {
			Balas b=new Balas(20,10,h.getX()+1,(h.getY()/2),5,5,"normales",true);//nt damage, boolean hit,int x, int y, int tamanio, int tamanio1
			balas.add(b);
			num++;
		}
	}
	private void movimientosheroe(){
		addKeyListener(new KeyAdapter(){
			
			public void KeyPressed(KeyEvent key){
			if(key.getKeyCode()==37)/*izq*/ {
			h.setX(h.getX()-20);
			}
			else if(key.getKeyCode()==39)/*der*/ {
			h.setX(h.getX()+20);
			}
			else if(key.getKeyCode()==38)/*arriba*/ {
				h.setY(h.getY()-20);
			}
			else if(key.getKeyCode()==40)/*abajo*/ {
				h.setY(h.getY()+20);
			}
			else if(key.getKeyCode()==88) {//por ahora solo con la tecla x se pueden disparar//
			//falta lo de la bala
				shoot=true;
				ListIterator<Balas> it= balas.listIterator();
				while(it.hasNext()) {
					Balas bal=it.next();
					
					if(shoot==true) {
						bal.setX(bal.getX()+10);
					}
				}
			}
			
			}
		});
		addKeyListener(new KeyAdapter(){
			public void KeyReleased(KeyEvent key){
			
			 if(key.getKeyCode()==88) {//por ahora solo con la tecla x se pueden disparar//
			
				shoot=false;
			}
			}
		});
		repaint();
	}
	
	
		
	 
	/*private void llenar_imagenes() {
		File archImagen = new File("imagen_1.gif");
		try {
			BufferedImage imagen = ImageIO.read(archImagen);
			cara_1=imagen;
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		archImagen = new File("imagen_2.gif");
		try {
			BufferedImage imagen = ImageIO.read(archImagen);
			cara_2=imagen;
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}*/
 // more methods, explained later...
	} // end of GamePanel class
