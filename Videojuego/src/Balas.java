import java.awt.Graphics;

/*
Hecha  por Paco C
15/07/2018
Clase hija de Municiones donde hereda los atributos de Municiones y solo se usan los constructores
*/
public class Balas extends Municiones {

	public Balas() {//inicio del constructor por d
		super();
	}//fin del constrcutor por d
	public Balas(int damage, int velocidad, int x, int y,int tamanioX, int tamanioY,String nombre, boolean spawned) {//inicio de el constructor por paramteros que recibe si esta vivo, la vida, velocidad
		super(damage, velocidad,x,y,tamanioX,tamanioY,nombre,spawned);
	}//fin del constructor por p
	
	public void paint(Graphics g){
	}
	
	
	
}//fin de la clase
