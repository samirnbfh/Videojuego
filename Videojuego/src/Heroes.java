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
		public Heroes(int x, int y,int tamanioX, int tamanioY,String nombre, boolean spawned,boolean alive, int Hp, int velocidad) {//inicio de el constructor por paramteros que recibe si esta vivo, la vida, velocidad
			super(x,y,tamanioX,tamanioY,nombre,spawned,alive,Hp,velocidad);
			
		}
	public void paint(Graphics g){
		
	
	}
}
	
