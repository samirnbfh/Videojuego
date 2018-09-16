/*
Hecha por Paco C
15/07/2018
Clase hija de Personajes la cual hereda los atributos y solo se usan los constructores
*/
public class Enemigos extends Personajes {

	public Enemigos() {//inicio del constrcutor por default
		super();
	}//fin del constructor por default
	public Enemigos(boolean alive, int Hp, int velocidad) {//inicio del constrcutor por parametros que recibe el nombre, la vida y el tamaño
		super();
		this.alive=alive;
		this.Hp=Hp;
		this.velocidad=velocidad;
		
	}//fin del constructor por paramteros
	public void paint(Graphics g){
	}
}//fin de la clase
