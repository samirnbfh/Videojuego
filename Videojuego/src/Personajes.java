import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;

public abstract class Personajes {

	protected String nombre;
	protected int Hp,damage,x,y,tam,tam1;
	protected boolean hit;
	
	private Image imagen;
	
	public Personajes() {
		nombre="";
		Hp=0; damage=0;x=0;y=0;tam=0; tam1=0;
	}
	public Personajes(String nombre, int x, int y, int HP, int damage, int tam,int tam1) {
		nombre=this.nombre;
		x=this.x;
		y=this.y;
		Hp=this.Hp;
		damage=this.damage;
		tam=this.tam;
		tam1=this.tam1;
		
	}
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
		
		/*File archivo= new File (nombre);
		imagen =(new ImageIcon (nombre)).getImage();
		g.drawImage(imagen, x, y, tam, tam, null);//MiVentana mv; en vez de null Main.mv
	*/
		g.setColor(Color.BLACK);
		g.fillRect(x, y, tam, tam1);

}
}
