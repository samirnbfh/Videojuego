/*
	Autor: Samuel Ivan Ramirez Navarro
	
	Creado: 9/16/2018
	
	Descripcion: Clase padre de todos los objetos que se van a instanciar en el canva durante la ejecucion del juego
	
*/

import java.awt.Graphics;

public abstract class Spawnable {
	
	private int x; //Posicion de x del objeto que se va a instanciar
	private int y; //Posicion de y del objeto que se va a instanciar
	private boolean spawned; //True= el objeto esta instanciado en el canvas, False: el objeto no esta instanciado en el canvas
	
	public Spawnable() {
		x = 0;
		y = 0;
		spawned = false;
	}

	public Spawnable(int x, int y, boolean spawned) {
		this.x = x;
		this.y = y;
		this.spawned = spawned;
	}

	//Regresa la posicion en x del objeto
	public int getX() {
		return x;
	}
	
	//Asigna una posicion en x al objeto
	public void setX(int x) {
		this.x = x;
	}

	//Regresa una posicion en y al objeto
	public int getY() {
		return y;
	}

	//Asigna una posicion en y al objeto
	public void setY(int y) {
		this.y = y;
	}
	
	//Regresa si el objeto esta instanciado
	public boolean isSpawned() {
		return spawned;
	}

	//Asigna si el onjeto esta instanciado o no
	public void setSpawned(boolean spawned) {
		this.spawned = spawned;
	}

	@Override
	//Imprime la informacion del objeto 
	public String toString() {
		return "Spawnable [x=" + x + ", y=" + y + ", spawned=" + spawned + "]";
	}

	@Override
	//Metodo abstracto que compara el objeto con otro
	public abstract boolean equals(Object obj);
	
	//Metodo que pinta el objeto en el canvas
	public abstract void paint(Graphics g);
	
	
}
