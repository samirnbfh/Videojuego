/*
Hecha por Paco C
15/07/2018
Clase hija de Personajes la cual hereda los atributos y solo se usan los constructores
*/
public class Enemigos extends Personajes {

	public Enemigos() {//inicio del constrcutor por default
		super();
	}//fin del constructor por default
	public Enemigos(String nombre, int HP, int damage, int tam,int tam1) {//inicio del constrcutor por parametros que recibe el nombre, la vida y el tamaño
		nombre=this.nombre;
		Hp=this.Hp;
		damage=this.damage;
		tam=this.tam;
		tam=this.tam1;
		
	}//fin del constructor por paramteros
	
}//fin de la clase
