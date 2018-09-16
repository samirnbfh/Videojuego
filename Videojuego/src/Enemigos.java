/*
Hecha por Paco C
15/07/2018
Clase hija de Personajes la cual hereda los atributos y solo se usan los constructores
*/
public class Enemigos extends Personajes {

	public Enemigos() {//inicio del constrcutor por default
		super();
	}//fin del constructor por default
	public Enemigos(int x, int y,int tamanioX, int tamanioY,String nombre, boolean spawned,boolean alive, int HP, int velocidad) {//inicio de el constructor por paramteros que recibe si esta vivo, la vida, velocidad
		super(x,y,tamaniox,tamanioy,nombre,spawned,alive,Hp,velocidad);
		
	}//fin del constructor por paramteros
	public void paint(Graphics g){
	}
}//fin de la clase
