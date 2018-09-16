/*
Hecho por Paco C
15/09/2018
Clase de personajes donde tiene los atributos de nombre, vida y daño junto con el tamaño del mismo

*/
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;

public abstract class Personajes extends Spawnable {

	protected String nombre;//NOMBRE DEL PERSONAJE
	protected int Hp,damage,tam,tam1;//atributos de posicion, daño y vida
	
	
	public Personajes() {//inicia constructor por default
		nombre="";
		Hp=0; damage=0;tam=0; tam1=0;
	}//fin del constructor por default
	public Personajes(String nombre, int HP, int damage, int tam,int tam1) {//inicio de el constructor por paramteros que recibe el nombre, la vida, el daño del personaje  y su tamaño
		nombre=this.nombre;
		Hp=this.Hp;
		damage=this.damage;
		tam=this.tam;
		tam1=this.tam1;
		
	}
	/*Setter y getters*/
	//obtiene el nombre del objeto
	public String getNombre() {
		return nombre;
	}
	//Modifica el nombre del objeto
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//obtiene la vida del objeto
	public int getHp() {
		return Hp;
	}
	//Modifica la vida del objeto
	public void setHp(int hp) {
		Hp = hp;
	}
	//obtiene el daño del objeto
	public int getDamage() {
		return damage;
	}
	//Modifica el daño del objeto
	public void setDamage(int damage) {
		this.damage = damage;
	}
	//obtiene el ancho del objeto
	public int getTam() {
		return tam;
	}
	//Modifica el ancho del objeto
	public void setTam(int tam) {
		this.tam = tam;
	}
	//obtiene la altura del objeto
	public int getTam1() {
		return tam1;
	}
	//Modifica la altura del objeto
	public void setTam1(int tam1) {
		this.tam1 = tam1;
	}
	
	
	public abstract paint(Graphics g) ;
}
