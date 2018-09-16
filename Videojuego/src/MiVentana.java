import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MiVentana extends JFrame{
		/*
	 
	 */
	private static final long serialVersionUID = 1L;
		GamePanel  game;

		public MiVentana() { 
			super();
			setLayout(new BorderLayout());   
			game = new GamePanel(); 	
			this.add(game, BorderLayout.CENTER);

		}
		
}