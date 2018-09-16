/*
Hecha  por Paco C
15/07/2018
Clase hija de Municiones donde hereda los atributos de Municiones y solo se usan los constructores
*/
public class Balas extends Municiones {

	public Balas() {//inicio del constructor por d
		super();
	}//fin del constrcutor por d
	public Balas(int damage, int velocidad) {//inicio del constructor por p que recibe daño, y el tamaño
		this.velocidad=velocidad;
		this.damage=damage
	}//fin del constructor por p
	
	public void paint(Graphics g){
	}
	
}//fin de la clase
