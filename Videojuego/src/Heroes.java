/*
Hecho por Paco C
15/07/2018
Clase hija de Personajes en la cual se heredan todos los atributos y solo se ponen los constructores
*/
import java.awt.Graphics;

public class Heroes extends Personajes {
	

		public Heroes() {//Constructor por default
			super();
		}//fin del constructor por default
<<<<<<< HEAD
		public Heroes(int x, int y,int tamanioX, int tamanioY,String nombre, boolean spawned,boolean alive, int Hp, int velocidad) {//inicio de el constructor por paramteros que recibe si esta vivo, la vida, velocidad
			super(x,y,tamanioX,tamanioY,nombre,spawned,alive,Hp,velocidad);
=======
		public Heroes(int x, int y,int tamanioX, int tamanioY,String nombre, boolean spawned,boolean alive, int HP, int velocidad) {//inicio de el constructor por paramteros que recibe si esta vivo, la vida, velocidad
			super(x,y,tamanioX,tamanioY,nombre,spawned,alive,HP,velocidad);
>>>>>>> MUDCROSS1507-patch-1
			
		}
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(50, 50, 20,50);
	
	}
}
	
