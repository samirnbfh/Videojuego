/*
	Autor: Samuel Ivan Ramirez Navarro
	
	Creado: 9/16/2018
	
	Descripcion: Clase padre de todos los objetos que se van a instanciar en el canva durante la ejecucion del juego
	
*/

import java.awt.Graphics;

public abstract class Spawnable {
	
	private int x; //Posicion de x del objeto que se va a instanciar
	private int y; //Posicion de y del objeto que se va a instanciar
	private int tamanioX; //Tamaño que tiene el objeto en X 
	private int tamanioY; //Tamaño que tiene el objeto en Y
	private String nombre; //Nombre (id) del objeto
	private boolean spawned; //True= el objeto esta instanciado en el canvas, False: el objeto no esta instanciado en el canvas
	
	public Spawnable() {
		x = 0;
		y = 0;
		tamanioX = 0;
		tamanioY = 0;
		nombre = null;
		spawned = false;
	}

	public Spawnable(int x, int y,int tamanioX, int tamanioY,String nombre, boolean spawned) {
		this.x = x;
		this.y = y;
		this.tamanioX = tamanioX;
		this.tamanioY = tamanioY;
		this.nombre = nombre;
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
	
	//Regresa el tamaño que tiene el objeto en X
	public int getTamanioX() {
		return tamanioX;
	}

	//Asigna el tamaño que tiene el objeto en X
	public void setTamanioX(int tamanioX) {
		this.tamanioX = tamanioX;
	}

	//Regresa el tamaño que tiene el objeto en Y
	public int getTamanioY() {
		return tamanioY;
	}

	//Asigna el tamaño que tiene el objeto en Y
	public void setTamanioY(int tamanioY) {
		this.tamanioY = tamanioY;
	}

	//Regresa el nombre del objeto
	public String getNombre() {
		return nombre;
	}

	//Asigna un nombre al objeto
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	//Imprime la informacion del objeto 
	public String toString() {
		return "Spawnable [x=" + x + ", y=" + y + ", spawned=" + spawned + "]";
	}

	//Recibe un objeto tipo Spawnable, y checa si es del mismo tipo (id)
	public boolean equals(Spawnable obj) {
		if(this.nombre.equals(obj.getNombre()) ) {
			return true;
		}
		return false;
	}
	
	//Metodo que pinta el objeto en el canvas
	public abstract void paint(Graphics g);
	
	
}

