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
	protected boolean hit;//saber si hizo contacto con algun objeto
	
	private Image imagen;// en caso de usar imagenes
	
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHp() {
		return Hp;
	}
	public void setHp(int hp) {
		Hp = hp;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getTam() {
		return tam;
	}
	public void setTam(int tam) {
		this.tam = tam;
	}
	public int getTam1() {
		return tam1;
	}
	public void setTam1(int tam1) {
		this.tam1 = tam1;
	}
	public boolean isHit() {
		return hit;
	}
	public void setHit(boolean hit) {
		this.hit = hit;
	}
	public Image getImagen() {
		return imagen;
	}
	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}
	//public abstract boolean hit(Arma a) ; //verifica si el daño fue hecho y registra el daño hecho
	
	public void paint(Graphics g) {
		// en caso de que usemos imagenes
		/*File archivo= new File (nombre);
		imagen =(new ImageIcon (nombre)).getImage();
		g.drawImage(imagen, x, y, tam, tam, null);//MiVentana mv; en vez de null Main.mv
	*/
		//se crea un rectangulo de color negro como fin de muestra
		g.setColor(Color.BLACK);
		g.fillRect(x, y, tam, tam1);

}
}
