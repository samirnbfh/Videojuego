<<<<<<< HEAD
=======
import java.awt.Color;
>>>>>>> MUDCROSS1507-patch-1
import java.awt.Graphics;

/*
Hecha por Paco C
15/07/2018
Clase hija de Personajes la cual hereda los atributos y solo se usan los constructores
*/

public class Enemigos extends Personajes {

	public Enemigos() {//inicio del constrcutor por default
		super();
	}//fin del constructor por default
<<<<<<< HEAD
	public Enemigos(int x, int y,int tamanioX, int tamanioY,String nombre, boolean spawned,boolean alive, int Hp, int velocidad) {//inicio de el constructor por paramteros que recibe si esta vivo, la vida, velocidad
		super(x,y,tamanioX,tamanioY,nombre,spawned,alive,Hp,velocidad);
		
	}//fin del constructor por paramteros
	
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
=======
	public Enemigos(int x, int y,int tamanioX, int tamanioY,String nombre, boolean spawned,boolean alive, int HP, int velocidad) {//inicio de el constructor por paramteros que recibe si esta vivo, la vida, velocidad
		super(x,y,tamanioX,tamanioY,nombre,spawned,alive,HP,velocidad);
		
	}//fin del constructor por paramteros
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(50, 50, 20,50);
>>>>>>> MUDCROSS1507-patch-1
	}
}//fin de la clase
