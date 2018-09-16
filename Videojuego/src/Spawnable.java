/*
	Autor: Samuel Ivan Ramirez Navarro
	
	Creado: 9/16/2018
	
	Descripcion: Clase padre de todos los objetos que se van a instanciar en el canva durante la ejecucion del juego
*/

public abstract class Spawnable {
	
	private int x;
	private int y;
	private boolean spawned;
	
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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isSpawned() {
		return spawned;
	}

	public void setSpawned(boolean spawned) {
		this.spawned = spawned;
	}

	@Override
	public String toString() {
		return "Spawnable [x=" + x + ", y=" + y + ", spawned=" + spawned + "]";
	}

	@Override
	public abstract boolean equals(Object obj);
	
	
	
}
