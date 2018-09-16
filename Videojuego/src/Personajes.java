/*
Hecho por Paco C
15/09/2018
Clase de personajes donde tiene los atributos de vida, velocidad, boolean de si esta vivo

*/
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;

public abstract class Personajes extends Spawnable {

	protected int Hp,velocidad;//atributos de vida y velocidad
	protected boolean alive;//atributo de si esta vivo o no
	
	
	public Personajes() {//inicia constructor por default
		Hp=0; alive=false; velocidad=0;
	}//fin del constructor por default
	public Personajes(int x, int y,int tamanioX, int tamanioY,String nombre, boolean spawned,boolean alive, int HP, int velocidad) {//inicio de el constructor por paramteros que recibe si esta vivo, la vida, velocidad
		super(x,y,tamanioX,tamanioY,nombre,spawned);
		this.alive=alive;
		this.Hp=Hp;
		this.velocidad=velocidad;
		
	}
	/*Setter y getters*/
	//obtiene el valor del objeto
	public boolean getalive() {
		return alive;
	}
	//Modifica el valor del objeto
	public void setalive(boolean alive) {
		this.alive = alive;
	}
	//obtiene la vida del objeto
	public int getHp() {
		return Hp;
	}
	//Modifica la vida del objeto
	public void setHp(int hp) {
		Hp = hp;
	}
	//obtiene el velocidad del objeto
	public int getvelocidad() {
		return velocidad;
	}
	//Modifica el velocidad del objeto
	public void setvelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
}
