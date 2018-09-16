/*
Hecha  por Paco C
15/07/2018
Clase hija de Municiones donde hereda los atributos de Municiones y solo se usan los constructores
*/
public class Balas extends Municiones {

	public Balas() {//inicio del constructor por d
		super();
	}//fin del constrcutor por d
	public Balas(int damage, boolean hit, int tamanio, int tamanio1) {//inicio del constructor por p que recibe daño, y el tamaño
		hit=this.hit;
		damage=this.damage;
		tamanio=this.tamanio;
		tamanio1=this.tamanio1;
	}//fin del constructor por p
}//fin de la clase
