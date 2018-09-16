import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;

public class Municiones {

	protected String nombre;
	protected boolean hit;
	protected int damage,x,y,tamanio,tamanio1;
	private  Image  imagen;
	public Municiones() {
		hit=false;
		damage=0;x=0;y=0;tamanio=0;tamanio1=0;
	}
	public Municiones(int damage, boolean hit,int x, int y, int tamanio, int tamanio1) {
		hit=this.hit;
		damage=this.damage;
		x=this.x;
		y=this.y;
		tamanio=this.tamanio;
		tamanio1=this.tamanio1;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isHit() {
		return hit;
	}
	public void setHit(boolean hit) {
		this.hit = hit;
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
	public int getTamanio() {
		return tamanio;
	}
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	public int getTamanio1() {
		return tamanio1;
	}
	public void setTamanio1(int tamanio1) {
		this.tamanio1 = tamanio1;
	}
	public Image getImagen() {
		return imagen;
	}
	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}
	public void paint(Graphics g) {
		/*
		File archivo=new File(nombre);
		
			imagen= (new ImageIcon(nombre)).getImage();
				g.drawImage(imagen,x,y,tamanio, tamanio1, null);
		*/
		g.setColor(Color.BLACK);
		g.fillOval(x, y, tamanio, tamanio1);
	}
}
