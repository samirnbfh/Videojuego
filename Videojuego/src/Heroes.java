/*
Hecho por Paco C
15/07/2018
Clase hija de Personajes en la cual se heredan todos los atributos y solo se ponen los constructores
*/
import java.awt.Color;
import java.awt.Graphics;

public class Heroes extends Personajes {
	

		public Heroes() {//Constructor por default
			super();
		}//fin del constructor por default
		public Heroes(boolean alive, int Hp,int velocidad) {//constructor por parametros que recibe el nombre del heroes con el daño y su tamaño
			this.alive=alive;
			this.Hp=Hp;
			this.velocidad=velocidad;
			
		}
	public void paint(Graphics g){
		
	
	}
}
	
