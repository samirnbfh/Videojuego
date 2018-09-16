
/*
Hecho por Paco C
15/07/2018
Clase de Municiones la cual tendra clases hijas dependiendo del tipo de municion que necesite el arma
con atributos daño, y velocidad

	Editado por Samuel Ramirez 9/16/2018
	
*/

public abstract class Municiones extends Spawnable{

	protected int damage; // Daño que causa la municione a otros objeto
	protected int velocidad; //Velocidad a la que se mueve la municion
	
	public Municiones() {
		super();
		damage=0;
		velocidad = 0;
	}
	
	public Municiones(int damage,int velocidad,int x, int y,int tamanioX, int tamanioY,String nombre, boolean spawned) {
		super(x,y,tamanioX,tamanioY,nombre,spawned);
		this.damage = damage;
		this.velocidad = velocidad;
	}	
	
	//Regresa el daño que causa la municion
	public int getDamage() {
		return damage;
	}
	
	//Asigna el daño que causa la municion
	public void setDamage(int damage) {
		this.damage = damage;
	}

	//Regresa velocidad a la que se mueve la municion
	public int getVelocidad() {
		return velocidad;
	}
	
	//Asigna la velocidad a la bala
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	
}
